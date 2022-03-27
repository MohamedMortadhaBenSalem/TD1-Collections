package Ex1;

import java.util.*;

class Banque{
  String nom;
  public ArrayList <Compte> Comptes;    
  
  Banque(String n){
    Comptes = new ArrayList<>(); 
    nom = n;
 }
  
  public void creerCompte(Compte tab1) {
	  Comptes.add(tab1);
  }

public void Affiche() {
	System.out.println("Banque [nom=" + nom + ", Comptes=" + Comptes + "]");
}
  
}