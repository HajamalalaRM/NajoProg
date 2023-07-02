import  java.util.*;
public class Patient{
	private String nom;
	private Set<String> ordonnance;

	public Patient(String n)
	{
		nom=n;
		ordonnance = new HashSet<String>();
	}
	public String getNom(){return nom;}
	public boolean ordonnanceVide(){return ordonnance.isEmpty();}
	public void affiche(){
		Terminal.ecrireStringln(getNom());
		afficheOrdonnce();
	}
	public void ajoutMedicament(String m){
		ordonnance.add(m);
	}
	public void afficheOrdonnce(){Terminal.ecrireStringln(ordonnance);}
	public boolean contientMedicament(String m){return ordonnance.containts(m);}
}

