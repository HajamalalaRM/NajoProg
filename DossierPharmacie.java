import  java.util.*;
public class DossierPharmacie{
	private String nom;
	private HashMap<String,Patient> patients;

	public DossierPharmacie(String n)
	{
		nom=n;
		patients = new HashMap<String,Patient>();
	}
	public void nouveauPatient(String nom, String[]ord){
		Patient c =  new Patien(nom);
		for(String n: ord){
			c.ajoutMedicament(n);
		}
		String key = nom.toLowerCase();
		patients.put(key,c);
	}
	public boolean ajoutMedicament(String nom, String m){
		String nm = nom.toLowerCase();
		if(patients.containsKey(nm)){
			Patient temp = patients.get(nm);
			temp.ajoutMedicament(m);
			return patients.replace(nm,patients.get(nm),temp);
		}else{
			return false;
		}
	}
	public Collection<String> affichePatientAvecMedicament(String m){
		Collection<String> list = new ArrayList<String>();
		patients.foreach((k,v)->{
			Patient t = (Patient)v;
			if(t.contientMedicament(m))list.add(t.getNom());
		});
		return list;
	}
	public Collection<String> enlevePatientOrdonnanceVide(){
		patients.foreach((k,v)->{
			Patient t = (Patient)v;
			if(t.ordonnanceVide())patients.remove(t.getNom().toLowerCase());
		});
	}
}

