package wikiSampleSolution.wikiSampleSolution.application.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.apache.commons.lang3.StringUtils;

import org.eclipse.emf.common.util.URI;

import wikiSampleSolution.wikiSampleSolution.Wiki;
import wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionFactory;
import wikiSampleSolution.wikiSampleSolution.application.view.ViewManagement;
import wikiSampleSolution.wikiSampleSolution.Article;
import wikiSampleSolution.wikiSampleSolution.Content;
import wikiSampleSolution.wikiSampleSolution.History;
import wikiSampleSolution.wikiSampleSolution.RegisteredUser;
import wikiSampleSolution.wikiSampleSolution.Role;
import wikiSampleSolution.wikiSampleSolution.RoleType;
import wikiSampleSolution.wikiSampleSolution.User;
import wikiSampleSolution.wikiSampleSolution.Version;

import wikiSampleSolution.main.JSONAray;
import wikiSampleSolution.main.JSONElement;
import wikiSampleSolution.main.JSONFormat;
import wikiSampleSolution.main.JSONObject;
import wikiSampleSolution.main.JSONProperty;
import wikiSampleSolution.main.JSONString;

//import at.ac.univie.swa.ase2014.a0123456.task1.model.netflix.Media;
//import at.ac.univie.swa.ase2014.a0123456.task1.model.netflix.StreamingLibrary;

public class ControllerManagement {
	
	private Wiki wikipedia;
	
	//last registered user who makes changes in the articles
	private RegisteredUser last_registered_user=null;
	
	//used for json serialization
	private Map<Object,Integer> Object_IDS=new HashMap<>();
	
	private List<HashMap<String,String>> json_collection = new ArrayList<HashMap<String,String>>();
	private JSONFormat json_format=new JSONFormat();
	
	//List <Map <String, String>> json_collection;
	
	private Map <String, List<EStructuralFeature>> object_properties=new HashMap<String, List <EStructuralFeature>>();
	
	public RegisteredUser getLastRegisteredUser()
	{
		return this.last_registered_user;
	}
	public void setLastRegisteredUser(RegisteredUser last_reg_user)
	{
		this.last_registered_user=last_reg_user;
	}
	
	public List<Content> getContent()
	{
		return wikipedia.getContent();
	}
	
	public List<User> getUsers()
	{
		return wikipedia.getUsers();
	}
	
	public ControllerManagement(Wiki wiki)
	{
		wikipedia=wiki;
	}
	
	public void addContent(Content newArticle)
	{
		wikipedia.getContent().add(newArticle);
						
		History init_article_history=WikiSampleSolutionFactory.eINSTANCE.createHistory();
		wikipedia.getHistory().add(init_article_history);
		this.assign_ID(init_article_history);
		Version version1=WikiSampleSolutionFactory.eINSTANCE.createVersion();
		version1.setEditedBy(this.last_registered_user);
		wikipedia.getVersions().add(version1);
		this.assign_ID(version1);
		version1.setDiff(newArticle.getContentMarkup());
		version1.setTimestamp(new Date());
		init_article_history.getVersions().add(version1);
		
		newArticle.setHistory(init_article_history);
		
		
	}
	public void removeContent(int index)
	{
		
		wikipedia.getContent().remove(index);
	}
	public void updateContent(int index, String title, String markup)
	{
		wikipedia.getContent().get(index).setTtile(title);
		wikipedia.getContent().get(index).setContentMarkup(markup);
		
	}
	
	public List<Version> getHistory (int index)
	{
		return wikipedia.getContent().get(index).getHistory().getVersions();
	}
	
	public void updateHistory(int index, String title, String markup_new)
	{
		Content cont=wikipedia.getContent().get(index);
		
		int version_exists=0;
		for(int i=0;i<cont.getHistory().getVersions().size();i++)
		{
			if(cont.getHistory().getVersions().get(i).getDiff().equals(markup_new))
			{
				version_exists=1;
				break;
			}
		}
		
		if(version_exists==0)
		{
			Version version_new=WikiSampleSolutionFactory.eINSTANCE.createVersion();
			version_new.setEditedBy(this.last_registered_user);
			
			wikipedia.getVersions().add(version_new);
			this.assign_ID(version_new);
			version_new.setDiff(markup_new);
			version_new.setTimestamp(new Date());
			cont.getHistory().getVersions().add(version_new);
		}
				
		
	}
	public void enable_user_actions(RegisteredUser ru, ViewManagement vm)
	{
		int found_user=0;
		
		for(int i=0;i<wikipedia.getUsers().size();i++)
		{
			RegisteredUser reg_user=(RegisteredUser)wikipedia.getUsers().get(i);
			if(reg_user.getUsername().equals(ru.getUsername()))
			{
				if(reg_user.getRole().getType()==RoleType.AUTOCONFIRMED_USER)
				{
					vm.enable_autoconfirmed_actions();
					found_user=1;
					break;
				}
				else if(reg_user.getRole().getType()==RoleType.ADMIN)
				{
					vm.enable_admin_actions();
					found_user=1;
					break;
				}
				else if(reg_user.getRole().getType()==RoleType.SYSOP)
				{
					vm.enable_sysop_actions();
					found_user=1;
					break;
				}
				else if(reg_user.getRole().getType()==RoleType.REGISTERED_USER)
				{
					vm.enable_registered_actions();
					found_user=1;
					break;
				}
				
			}
			
		}
		
		if(found_user==0)//user does not exist in the list
		{
			//add a new registered user in the list
			Role registered_role=WikiSampleSolutionFactory.eINSTANCE.createRole();
			this.assign_ID(registered_role);
			registered_role.setType(RoleType.REGISTERED_USER);
			ru.setRole(registered_role);
			wikipedia.getUsers().add(ru);
			wikipedia.getRole().add(registered_role);
			
			vm.enable_registered_actions();
		}
	}
	/*public List<Object> find_objects_for_the_property(String eclass)
	{
		List<Object> object_return=new ArrayList<Object>();
		Object obj_main=wikipedia;
		String input_str=eclass;
		String output_str = input_str.substring(0, 1).toUpperCase() + input_str.substring(1);
		
		//for Users an additional "s" has to be added at the end since the mothod is called "getUsers()"
		if(output_str.equals("User"))
		{
			output_str=output_str+"s";
		}
		
		String methodName = "get"+output_str;
		Object ret=null;
		//java reflection: invoke method for an object
		java.lang.reflect.Method method=null;
				
		try {
		  method = obj_main.getClass().getMethod(methodName);
		} catch (SecurityException e) {
		  // ...
		} catch (NoSuchMethodException e) {
		  // ...
		}

		if(method!=null)//method exists for the given object
		{
			object_return.add(wikipedia);
			return object_return;
		}
		else
		{
			for(String key : object_properties.keySet())
			{
				for(int i=0;i<object_properties.get(key).size();i++)
				{
					EStructuralFeature estrf=object_properties.get(key).get(i);
					
					if(estrf.toString().equals(key))
					{
						Object xyz=null;
						try {
							xyz = Class.forName(key).newInstance();
						} catch (InstantiationException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IllegalAccessException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						input_str=key;
						output_str = input_str.substring(0, 1).toUpperCase() + input_str.substring(1);
						
						//for Users an additional "s" has to be added at the end since the mothod is called "getUsers()"
						if(output_str.equals("User"))
						{
							output_str=output_str+"s";
						}
						obj_main=xyz;
																	
						methodName = "get"+output_str;
						ret=null;
						//java reflection: invoke method for an object
						method=null;
								
						try {
						  method = obj_main.getClass().getMethod(methodName);
						} catch (SecurityException e) {
						  // ...
						} catch (NoSuchMethodException e) {
						  // ...
						}

						if(method!=null)//method exists for the given object
						{
							
							
						}
						
					}
				}
				
				
			}
		}
	}*/
	public void json_export ()
	{
		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());

		// Register the package -- only needed for stand-alone!
		EcorePackage ecorePackage = EcorePackage.eINSTANCE;

		// Get the URI of the model file.
		URI fileURI = URI.createFileURI(new File("model/wikiSampleSolution.ecore").getAbsolutePath());

		// Demand load the resource for this file.
		Resource resource = resourceSet.getResource(fileURI, true);
		
		EPackage epackage =(EPackage)resource.getContents().get(0);
		List <EObject> list_eobjects=epackage.eContents();
		
/*		PrintWriter json_file=null;
		try {
			json_file = new PrintWriter("json_representation.json", "UTF-8");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
*/		
		//List <Map <String, String>> json_collection=null;
		Map <Object,Integer> objects_ids=null;
		//Map <String, List<EStructuralFeature>>object_properties=new HashMap<String, List <EStructuralFeature>>();
		int number_of_meta_class_objects=0;
		
		//Map <String, String> json_map = new HashMap<String, String>();
		//map.put("dog", "type of animal");
		//System.out.println(map.get("dog"));
		
		//extracting all meta objects in the ecore model and their properties
		EClass content_class=null;
		
		
		for(int j=0;j<list_eobjects.size();j++)
		{
			if(list_eobjects.get(j) instanceof EClass)
			{
				EClass class_obj=(EClass) list_eobjects.get(j);
				//get structural features (eAttribute and eReference)
				List <EStructuralFeature> list_features =class_obj.getEStructuralFeatures();
				
				object_properties.put(class_obj.getName(), list_features);
				
				number_of_meta_class_objects+=1;
				
				/*if(classifier_obj.getName().equals("Content"))
				{
					content_class=classifier_obj;
					break;
				}*/
			}
		}
		
		int first_key=1;
		
		for(String key : object_properties.keySet())
		{
			if(first_key==1)//here a little bit different treatment for the whole wikipedia
			{
				
				first_key=0;
			}
			else
			{
					Object obj_main=wikipedia;
					
					List<EStructuralFeature> list_features=object_properties.get(key);
					String input_str=key;
					String output_str = input_str.substring(0, 1).toUpperCase() + input_str.substring(1);
					
					//for Users an additional "s" has to be added at the end since the mothod is called "getUsers()"
					if(output_str.equals("User") || output_str.equals("Version"))
					{
						output_str=output_str+"s";
					}
					
					String methodName = "get"+output_str;
					Object ret=null;
					//java reflection: invoke method for an object
					java.lang.reflect.Method method=null;
					try {
					  method = obj_main.getClass().getMethod(methodName);
					} catch (SecurityException e) {
					  // ...
					} catch (NoSuchMethodException e) {
					  // ...
					}
	
					if(method!=null)//method exists for the given object
					{
						try {
						  ret=method.invoke(obj_main);
						  int ii=4;
						} catch (IllegalArgumentException e) {
						} catch (IllegalAccessException e) {
						} catch (InvocationTargetException e) {
							
						}
										
						//conversion into list of objects
						List<Object> list_of_instances=new ArrayList<Object>();
						if (ret instanceof List<?>){
							list_of_instances=(List<Object>) ret;
						}
						else
						{
							if(ret!=null)
							{
								list_of_instances.add(ret);
							}
						}
						
						for(int i=0;i<list_of_instances.size();i++)
						{
							
							Object obj_local=list_of_instances.get(i);
							
							HashMap<String, String> new_json_obj=new HashMap<String, String>();
							JSONObject json_model_obj=new JSONObject();
									
							for(int j=0;j<list_features.size();j++)
							{
								
								
									String input_str_local=list_features.get(j).getName();
									String output_str_local = input_str_local.substring(0, 1).toUpperCase() + input_str_local.substring(1);
									
									String methodName_local = "get"+output_str_local;
									Object ret_local=null;
									
									//java reflection: invoke method for an object
									java.lang.reflect.Method method_local=null;
									try {
									  method_local = obj_local.getClass().getMethod(methodName_local);
									} catch (SecurityException e) {
									  // ...
									} catch (NoSuchMethodException e) {
									  // ...
									}
			
									if(method_local!=null)//method exists for the given object
									{
										try {
											ret_local=method_local.invoke(obj_local);
										  int ii=4;
										} catch (IllegalArgumentException e) {
										} catch (IllegalAccessException e) {
										} catch (InvocationTargetException e) {
											
										}
									
									
									
										//conversion into list of objects
										List<Object> list_of_instances_local=new ArrayList<Object>();
										if (ret_local instanceof List<?>){
											list_of_instances_local=(List<Object>) ret_local;
										}
										else
										{
											if(ret_local!=null)
											{
												list_of_instances_local.add(ret_local);
											}
										}
										//EObjectContainmentEList list_of_instances_local=(EObjectContainmentEList)ret_local;
										
										//creating json objects
										
										if(list_features.get(j) instanceof EReference)
										{
											//HashMap<String, String> new_json_obj=new HashMap<String, String>();
											//new_json_obj.put("ID", (this.get_object_ID(obj_local)).toString());
											//new_json_obj.put("ObjectType", key);
											new_json_obj.put((list_features.get(j).getName()).toString(), this.convert_list_of_objects_into_list_of_IDs(list_of_instances_local));
											
											//JSON model objects
											JSONString json_string_0=new JSONString();
											json_string_0.setJSONString(this.convert_list_of_objects_into_list_of_IDs(list_of_instances_local));
											
											JSONProperty json_prop_0=new JSONProperty();
											json_prop_0.setName((list_features.get(j).getName()).toString());
											json_prop_0.setJSONElement(json_string_0);
											
											json_model_obj.addJSONproperty(json_prop_0);
											
											//json_collection.add(new_json_obj);
										}
										else if (list_features.get(j) instanceof EAttribute)
										{
											//HashMap<String, String> new_json_obj=new HashMap<String, String>();
											//new_json_obj.put("ID", (this.get_object_ID(obj_local)).toString());
											//new_json_obj.put("ObjectType", key);
											if(list_of_instances_local!=null)
											{
												if((list_of_instances_local instanceof List<?>) && list_of_instances_local.size()!=0)
												{
													new_json_obj.put((list_features.get(j).getName()).toString(), (list_of_instances_local.get(0)).toString());
													
													//JSON model objects
													JSONString json_string_0=new JSONString();
													json_string_0.setJSONString((list_of_instances_local.get(0)).toString());
													
													JSONProperty json_prop_0=new JSONProperty();
													json_prop_0.setName((list_features.get(j).getName()).toString());
													json_prop_0.setJSONElement(json_string_0);
													
													json_model_obj.addJSONproperty(json_prop_0);
												}
												else
												{
													new_json_obj.put((list_features.get(j).getName()).toString(), "");
													
													//JSON model objects
													JSONString json_string_0=new JSONString();
													json_string_0.setJSONString("");
													
													JSONProperty json_prop_0=new JSONProperty();
													json_prop_0.setName((list_features.get(j).getName()).toString());
													json_prop_0.setJSONElement(json_string_0);
													
													json_model_obj.addJSONproperty(json_prop_0);
												}
											}
											else
											{
												new_json_obj.put((list_features.get(j).getName()).toString(), "");
												
												//JSON model objects
												JSONString json_string_0=new JSONString();
												json_string_0.setJSONString("");
												
												JSONProperty json_prop_0=new JSONProperty();
												json_prop_0.setName((list_features.get(j).getName()).toString());
												json_prop_0.setJSONElement(json_string_0);
												
												json_model_obj.addJSONproperty(json_prop_0);
											}
											//json_collection.add(new_json_obj);
										}
															
									}//method_local!=0
								
							}
							//json serialization using Strings
							new_json_obj.put("ID", (this.get_object_ID(obj_local)).toString());
							new_json_obj.put("ObjectType", key);
							json_collection.add(new_json_obj);
							
							//JSON model objects: equivalent to the previous json serialization representation
							JSONString json_string_1=new JSONString();
							json_string_1.setJSONString((this.get_object_ID(obj_local)).toString());
							
							JSONString json_string_2=new JSONString();
							json_string_2.setJSONString(key);
							
							JSONProperty json_prop_1=new JSONProperty();
							json_prop_1.setName("ID");
							json_prop_1.setJSONElement(json_string_1);
							
							JSONProperty json_prop_2=new JSONProperty();
							json_prop_2.setName("ObjectType");
							json_prop_2.setJSONElement(json_string_2);
							
							json_model_obj.addJSONproperty(json_prop_1);
							json_model_obj.addJSONproperty(json_prop_2);
							
							
						}
					}//method!=0
				
				}//for l
				
			
		}


		// Print the contents of the resource to System.out.
		try
		{
		resource.save(System.out, Collections.EMPTY_MAP);
		}
		catch (IOException e) {}
		
		//json_file.close();

	}
	
	public void write_json_file()
	{
		PrintWriter json_file=null;
		try {
			json_file = new PrintWriter("json_representation.json", "UTF-8");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		json_file.println("[");
		for(int i=0;i<json_collection.size();i++)
		{
			json_file.println("\t{");
			HashMap<String, String> hash_map=json_collection.get(i);
			int hash_map_size=1;
			for(String key : hash_map.keySet())
			{
				if(hash_map_size==hash_map.size())
				{
					json_file.println("\t\t"+key+":"+hash_map.get(key));
				}
				else
				{
					json_file.println("\t\t"+key+":"+hash_map.get(key)+",");
				}
				hash_map_size++;
				
			}
			
			json_file.print("\t}");
			if(i==(json_collection.size()-1))
			{
				json_file.println("");
			}
			else
			{
				json_file.println(",");
			}
		}
		json_file.println("]");		
		
		
		json_file.close();
	}

	
	public void assign_ID(Object obj)
	{
		int exist=0;
		for(Object key : Object_IDS.keySet())
		{
			if(obj.equals(key))
			{
				exist=1;
				break;
			}
		}
		
		if(exist==0)
		{
			Object_IDS.put(obj, Object_IDS.keySet().size());
		}
		
	}
	public Integer get_object_ID(Object obj)
	{
		for(Object key : Object_IDS.keySet())
		{
			if(key.equals(obj)) 
			{
				return Object_IDS.get(obj);
			}
				
		}
		
		System.out.println("No object with the given ID is found");
		return -1;
	}
	
	public String convert_list_of_objects_into_list_of_IDs(List<Object> list_of_obj)
	{
		if(list_of_obj.size()==0)
		{
			return "[]";
		}
		
		String all_obj="[";
		Integer id=this.get_object_ID((Object)list_of_obj.get(0));
		all_obj=all_obj+id.toString();
		for(int i=1;i<list_of_obj.size();i++)
		{
			id=this.get_object_ID(list_of_obj.get(i));
			all_obj=all_obj+","+id.toString();
			
		}
		all_obj=all_obj+"]";
		return all_obj;
	}
}
