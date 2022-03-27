package Ex1;

import java.util.*;

class Titulaire{
	  String nom;
	  Set<String> MesComptes; 
	    Titulaire(String n){
	       nom = n;
	       HashSet<String> MesComptes=new HashSet();  
	}
	    public void ajout(String t) {
	    	MesComptes.add(t);
	    }
		public void Affiche() {
			System.out.println("Titulaire [nom=" + nom + ", MesComptes=" + MesComptes + "]");
		}
	}
