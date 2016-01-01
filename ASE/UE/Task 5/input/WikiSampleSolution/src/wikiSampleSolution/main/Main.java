package wikiSampleSolution.main;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

import wikiSampleSolution.wikiSampleSolution.application.view.ViewManagement;

import wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionFactory;
import wikiSampleSolution.wikiSampleSolution.Article;
import wikiSampleSolution.wikiSampleSolution.Wiki;
import wikiSampleSolution.wikiSampleSolution.History;
import wikiSampleSolution.wikiSampleSolution.RegisteredUser;
import wikiSampleSolution.wikiSampleSolution.Role;
import wikiSampleSolution.wikiSampleSolution.RoleType;
import wikiSampleSolution.wikiSampleSolution.User;
import wikiSampleSolution.wikiSampleSolution.Version;

import wikiSampleSolution.wikiSampleSolution.application.controller.ControllerManagement;

public class Main {
	
	public static String readFile(String path, Charset encoding) throws IOException 
	  {
		  byte[] encoded = Files.readAllBytes(Paths.get(path));
		  return new String(encoded, encoding);
	  }
	
	public static void main(String[] args) {
		
		Wiki wiki_all= WikiSampleSolutionFactory.eINSTANCE.createWiki();
		
		ControllerManagement controller=new ControllerManagement(wiki_all);
		
		controller.assign_ID(wiki_all);
		
					
		//creating an initial article based on the Wikitext.txt file
		Article init_article= WikiSampleSolutionFactory.eINSTANCE.createArticle();
		controller.assign_ID(init_article);
		init_article.setTtile("Wikitext-Main page");
		String MARKUP_LANGUAGE=null;		
		try {
			MARKUP_LANGUAGE = Main.readFile("Wikitext.txt", StandardCharsets.UTF_8);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		init_article.setContentMarkup(MARKUP_LANGUAGE);
		
		History init_article_history=WikiSampleSolutionFactory.eINSTANCE.createHistory();
		wiki_all.getHistory().add(init_article_history);
		controller.assign_ID(init_article_history);
		
				
		Version version1=WikiSampleSolutionFactory.eINSTANCE.createVersion();
		controller.assign_ID(version1);
		wiki_all.getVersions().add(version1);
		version1.setDiff(MARKUP_LANGUAGE);
		version1.setTimestamp(new Date());
		
		init_article_history.getVersions().add(version1);
		
		init_article.setHistory(init_article_history);
				
		wiki_all.getContent().add(init_article);
		
		RegisteredUser admin=WikiSampleSolutionFactory.eINSTANCE.createRegisteredUser();
		RegisteredUser sysop=WikiSampleSolutionFactory.eINSTANCE.createRegisteredUser();
		RegisteredUser autoconfirmed=WikiSampleSolutionFactory.eINSTANCE.createRegisteredUser();
		controller.assign_ID(admin);
		controller.assign_ID(sysop);
		controller.assign_ID(autoconfirmed);
		
		Role admin_role=WikiSampleSolutionFactory.eINSTANCE.createRole();
		Role sysop_role=WikiSampleSolutionFactory.eINSTANCE.createRole();
		Role autoconfirmed_role=WikiSampleSolutionFactory.eINSTANCE.createRole();
		controller.assign_ID(admin_role);
		controller.assign_ID(sysop_role);
		controller.assign_ID(autoconfirmed_role);
		
		wiki_all.getRole().add(admin_role);
		wiki_all.getRole().add(sysop_role);
		wiki_all.getRole().add(autoconfirmed_role);
		
		admin_role.setType(RoleType.ADMIN);
		sysop_role.setType(RoleType.SYSOP);
		autoconfirmed_role.setType(RoleType.AUTOCONFIRMED_USER);
		
		admin.setUsername("Srdjan_1");
		//set editor of an article version
		version1.setEditedBy(admin);
		admin.setRole(admin_role);
		
		sysop.setUsername("Srdjan_2");
		sysop.setRole(sysop_role);
		
		autoconfirmed.setUsername("Srdjan_3");
		autoconfirmed.setRole(autoconfirmed_role);
		
		wiki_all.getUsers().add(admin);
		wiki_all.getUsers().add(sysop);
		wiki_all.getUsers().add(autoconfirmed);
	
		
		//controller.json_export();
		//controller.write_json_file();
		
		ViewManagement vm=new ViewManagement(controller);
		vm.enable_unregistered_actions();
		
		/*StreamingLibrary library = NetflixFactory.eINSTANCE.createStreamingLibrary();
		Movie movie1 = NetflixFactory.eINSTANCE.createMovie();
		movie1.setName("Spider man");
		movie1.setLength("190");
		
		Movie movie2 = NetflixFactory.eINSTANCE.createMovie();
		movie2.setName("Iron man");
		movie2.setLength("220");
		
		library.getMedien().add(movie1);
		library.getMedien().add(movie2);
		
		service.setStreamLibrary(library);
		
		MediaManagementView view = new MediaManagementView(service.getStreamLibrary());*/
		
	}

}
