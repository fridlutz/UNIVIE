package at.ac.univie.swa.ase2014.a1276754.task1.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;

import at.ac.univie.swa.ase2014.a1276754.task1.model.*;

public class Main {
	public static void main(String[] args) {
		List<Account> Accounts = new ArrayList<Account>();
		List<StreamingMedia> Media = new ArrayList<StreamingMedia>();
		
		Account acc1 = new Account();
		Accounts.add(acc1);
		Account acc2 = new Account();
		Accounts.add(acc2);
		
		Profile pro1 = new Profile();
		Profile pro2 = new Profile();
		Profile pro3 = new Profile();
		acc1.addProfile(pro1);
		acc1.addProfile(pro2);
		acc2.addProfile(pro3);

		Media.add(new Movie());
		Media.add(new Movie());
		Media.add(new Music());
		Media.add(new Music());
		Media.add(new TV_Series());
		Media.add(new TV_Series());
		
        JFrame frame = new JFrame("Accounts");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] headerAcc = {"ID","Name","Email","Passwort","bezahlte_Abozeit","Land"};
        
        Library<Account> newContentPane = new Library<Account>(Accounts,headerAcc, Account.class);
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);

        frame.pack();
        frame.setVisible(true);
        
        JFrame frame2 = new JFrame("Media");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] headerMovie = {"ID","Name","Produzent","Groesse/Anzahl"};
        
        Library<StreamingMedia> newContentPane2 = new Library<StreamingMedia>(Media,headerMovie, Media.class);
        newContentPane.setOpaque(true);
        frame2.setContentPane(newContentPane2);

        frame2.pack();
        frame2.setVisible(true);
	}
}
