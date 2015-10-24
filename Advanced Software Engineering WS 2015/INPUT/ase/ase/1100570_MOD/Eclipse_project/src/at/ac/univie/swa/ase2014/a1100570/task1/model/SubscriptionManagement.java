/**
 * @author Volodimir Begy, a1100570
 */

package at.ac.univie.swa.ase2014.a1100570.task1.model;

import java.util.Date;
import java.util.Vector;

public class SubscriptionManagement {

	private Vector<Account> accounts;
	
	public SubscriptionManagement(){
		this.setAccounts(new Vector<Account>());
	}

	public Vector<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Vector<Account> accounts) {
		this.accounts = accounts;
	}
	
	public void addAccount(Account a){
		this.accounts.add(a);
	}
	
	public void deleteAccount(int id){
		boolean in=false;
		int index=0;
		
		for(int j=0;j<accounts.size();j++){
			if(accounts.get(j).getId()==id){
				in=true;
				index=j;
				break;
			}
		}
		if(in){
			for(int i=0;i<accounts.get(index).getProfiles().size();i++){
				Profile.deleteID(accounts.get(index).getProfiles().get(i).getId());
			}
			this.accounts.remove(index);
			Account.deleteID(id);
		}
	}
	
	@SuppressWarnings("deprecation")
	public void notifyNotTrialAccountsAboutMonthlyFee(){

		if(new Date().getDate()==1)
			for(int i=0;i<accounts.size();i++)
				if(!accounts.get(i).isTrial()){
					System.out.println("Sending email notification to the account...");
					//dummy accounts.get(i).getEmail();
				}
	}
}
