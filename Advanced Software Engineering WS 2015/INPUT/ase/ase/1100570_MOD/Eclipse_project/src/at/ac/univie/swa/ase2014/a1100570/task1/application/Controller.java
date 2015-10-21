/**
 * @author Volodimir Begy, a1100570
 */

package at.ac.univie.swa.ase2014.a1100570.task1.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import at.ac.univie.swa.ase2014.a1100570.task1.model.Account;
import at.ac.univie.swa.ase2014.a1100570.task1.model.Content;
import at.ac.univie.swa.ase2014.a1100570.task1.model.Movie;
import at.ac.univie.swa.ase2014.a1100570.task1.model.Music;
import at.ac.univie.swa.ase2014.a1100570.task1.model.Profile;
import at.ac.univie.swa.ase2014.a1100570.task1.model.StreamingLibrary;
import at.ac.univie.swa.ase2014.a1100570.task1.model.SubscriptionManagement;
import at.ac.univie.swa.ase2014.a1100570.task1.model.TvSeries;



public class Controller {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
	private Application view;
	
	//models for tables
	private Vector<Vector<String>> dataSL;
	private Vector<Vector<String>> dataAC;
	private Vector<Vector<String>> dataPR;
	
	//meta models
	private SubscriptionManagement sm;
	private StreamingLibrary sl;
	private Vector<Profile> profiles;

	
	public Controller(Application view){
		this.view=view;
	}
	
	public void createTestData() throws ParseException{
		sl=new StreamingLibrary();
		Music m=new Music(1,"Led Zeppeling",false);
		Movie mo=new Movie(2,"Fear and Loathing",true);
		TvSeries tv=new TvSeries(3,"Dexter",false);
		sl.addContent(m);
		sl.addContent(mo);
		sl.addContent(tv);
		transformSL();
		
		sm=new SubscriptionManagement();
		
		Account a1=new Account(1,false,"30-10-1993","30-10-1994");
		Account a2=new Account(2,false,"30-10-1993","30-10-1994");
		a1.addProfile(1,"Max");
		a1.addProfile(2,"Tom");
		a2.addProfile(3,"Max");
		a2.addProfile(4,"Tom");
		sm.addAccount(a1);
		sm.addAccount(a2);
		transformAC();
		transformPR();
	}
	
	public void transformSL(){
		dataSL=new Vector<Vector<String>>();
		Vector<Content> contents=sl.getContent();
		for(int i=0;i<contents.size();i++){
			Vector<String> tableEntry=new Vector<String>();
			tableEntry.add(""+contents.get(i).getId());
			tableEntry.add(contents.get(i).getName());
			if(contents.get(i).isInhome())
				tableEntry.add("true");
			else
				tableEntry.add("false");
			tableEntry.add(contents.get(i).getClass().getSimpleName());
			dataSL.add(tableEntry);
		}
	}
	
	public void transformAC(){
		dataAC=new Vector<Vector<String>>();
		Vector<Account> accounts=sm.getAccounts();
		
		for(int i=0;i<accounts.size();i++){
			Vector<String> tableEntry=new Vector<String>();
			tableEntry.add(""+accounts.get(i).getId());
			if(accounts.get(i).isTrial())
				tableEntry.add("true");
			else
				tableEntry.add("false");
			tableEntry.add(sdf.format(accounts.get(i).getRegistrationDate()));
			tableEntry.add(sdf.format(accounts.get(i).getTrialExpiration()));
			tableEntry.add(""+accounts.get(i).amountProfiles());
			dataAC.add(tableEntry);
		}
	}
	
	public void transformPR() {
		dataPR=new Vector<Vector<String>>();
		profiles=new Vector<Profile>();
		
		for(int i=0;i<sm.getAccounts().size();i++){
			for(int j=0;j<sm.getAccounts().get(i).getProfiles().size();j++){
				profiles.add(sm.getAccounts().get(i).getProfiles().get(j));
			}
		}
		
		for(int i=0;i<profiles.size();i++){
			Vector<String> tableEntry=new Vector<String>();
			tableEntry.add(""+profiles.get(i).getAccount().getId());
			tableEntry.add(""+profiles.get(i).getId());
			tableEntry.add(profiles.get(i).getName());
			dataPR.add(tableEntry);
		}
	}
	
	public void updateSL(int row, int column){
		Content c=sl.getContent().get(row);
		Object newVal=view.getTableSL().getValueAt(row, column);
		if(column==0){
			c.setId(Integer.parseInt(newVal.toString()));
		}
		else if(column==1){
			c.setName(newVal.toString());
		}
		else if(column==2){
			if(newVal.toString().equals("true"))
				c.setInhome(true);
			else if(newVal.toString().equals("false"))
				c.setInhome(false);
			else
				throw new IllegalStateException(); 
		}
	}
	
	public void updateAC(int row, int column) throws ParseException{
		Account a=sm.getAccounts().get(row);
		Object newVal=view.getTableAC().getValueAt(row, column);
		
		if(column==0){
			a.setId(Integer.parseInt(newVal.toString()));
			
			//if accounts id changed: change profiles table
			transformPR();
			//refill model PR
			for(int i=0;i<dataPR.size();i++){
				((DefaultTableModel) view.getTablePR().getModel()).removeRow(0);
				((DefaultTableModel) view.getTablePR().getModel()).addRow(dataPR.get(i));
			}
		}
		else if(column==1){
			if(newVal.toString().equals("true"))
				a.setTrial(true);
			else if(newVal.toString().equals("false"))
				a.setTrial(false);
			else
				throw new IllegalStateException(); 
		}
		else if(column==2){
			SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
			Date registrationDate=sdf.parse(newVal.toString());
			a.setRegistrationDate(registrationDate);
		}
		else if(column==3){
			SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
			Date td=sdf.parse(newVal.toString());
			a.setRegistrationDate(td);
		}

	}
	
	public void updateAcAndPrViews(){
		int s=dataAC.size();
		for(int i=0;i<s;i++){
			((DefaultTableModel) view.getTableAC().getModel()).removeRow(0);
		}
		transformAC();
		s=dataAC.size();
		for(int i=0;i<dataAC.size();i++){
			((DefaultTableModel) view.getTableAC().getModel()).addRow(dataAC.get(i));
		}

		s=dataPR.size();
		for(int i=0;i<s;i++){
			((DefaultTableModel) view.getTablePR().getModel()).removeRow(0);
		}
		transformPR();
		s=dataPR.size();
		for(int i=0;i<s;i++){
			((DefaultTableModel) view.getTablePR().getModel()).addRow(dataPR.get(i));
		}
	}
	
	public void createSL(Content m){
		getSl().addContent(m);
		transformSL();
		((DefaultTableModel) view.getTableSL().getModel()).addRow(getDataSL().get(getDataSL().size()-1));
	}
	
	public void removeSL(int index){
		getSl().removeContent(index);
		transformSL();
		((DefaultTableModel) view.getTableSL().getModel()).removeRow(index);
	}
	
	public void createAC(int id, boolean trial, String rd, String ed){
		Account a;
		try {
			a = new Account(id,trial,rd,ed);
			getSm().addAccount(a);
			transformAC();
			((DefaultTableModel) view.getTableAC().getModel()).addRow(getDataAC().get(getDataAC().size()-1));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
	}
	
	public void deleteAC(int index){
		getSm().deleteAccount(Integer.parseInt(view.getTableAC().getValueAt(index,0).toString()));
		transformAC();
		((DefaultTableModel) view.getTableAC().getModel()).removeRow(index);
		
		//update PR model and view
		while(((DefaultTableModel) view.getTablePR().getModel()).getRowCount()>0){
			((DefaultTableModel) view.getTablePR().getModel()).removeRow(0);
		}
		transformPR();
		
		int s=getDataPR().size();
		for(int i=0;i<s;i++){
			((DefaultTableModel) view.getTablePR().getModel()).addRow(getDataPR().get(i));
		}
	}
	
	public boolean createPR(int accountID, int id, String name){
		Account a = null;
		for(int i=0;i<getSm().getAccounts().size();i++){
			if(getSm().getAccounts().get(i).getId()==accountID){
				a=getSm().getAccounts().get(i);
				break;
			}
		}
		return a.addProfile(id, name);
	}
	
	public void deletePR(int index){
		int accountID=Integer.parseInt(((DefaultTableModel) view.getTablePR().getModel()).getValueAt(index, 0).toString());
		Account a=null;
		for(int i=0;i<getSm().getAccounts().size();i++){
			if(getSm().getAccounts().get(i).getId()==accountID){
				a=getSm().getAccounts().get(i);
				break;
			}
		}
		
		a.removeProfile(Integer.parseInt(((DefaultTableModel) view.getTablePR().getModel()).getValueAt(index, 1).toString()));
		updateAcAndPrViews();
	}
	
	public void updatePR(int row, int column){
		
		if(column==1)
			profiles.get(row).setId(Integer.parseInt(((DefaultTableModel) view.getTablePR().getModel()).getValueAt(row, column).toString()));
		else if(column==2)
			profiles.get(row).setName(((DefaultTableModel) view.getTablePR().getModel()).getValueAt(row, column).toString());
	}
	
	public Vector<Vector<String>> getDataAC(){
		return this.dataAC;
	}
	
	public Vector<Vector<String>> getDataPR(){
		return this.dataPR;
	}
	
	public Vector<Vector<String>> getDataSL(){
		return this.dataSL;
	}
	
	public SubscriptionManagement getSm(){
		return this.sm;
	}
	
	public StreamingLibrary getSl(){
		return this.sl;
	}
}
