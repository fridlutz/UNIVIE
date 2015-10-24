package at.ac.univie.swa.ase2014.a1276754.task4.groovy

class Distributor {
	def name
	String adress
	String iban
	String bic
	
	String toString(){
		return "Distributor: $name, Adress: $adress, Account Informationen:(IBAN: $iban, BIC: $bic)"
	}
}
