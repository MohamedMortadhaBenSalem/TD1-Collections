package Ex1;


import java.util.*;

class Compte implements Comparable<Compte>{
    int numero;
    double solde;
    ArrayList<Compte> Comptes;
    void retrait(double m) {
          solde = solde - m;
}
  void depot(double m){
    solde = solde + m;
}
  
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public double getSolde() {
	return solde;
}
public void setSolde(double solde) {
	this.solde = solde;
}


@Override
public int compareTo(Compte C) {
	if(this.getSolde()==C.getSolde()) {
		return 0;
	}
	else if(this.getSolde()>C.getSolde()){
		return -1;
	}
	else return 1;
}
public void triercompte(){
	 Collections.sort(Comptes,new SoldeComparator());
	}
}