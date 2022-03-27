package Ex1;

import java.util.Comparator;
public class SoldeComparator implements Comparator<Compte>  {

	@Override
	public int compare(Compte b1, Compte b2) {
		return (Double.compare(b1.getSolde(),b2.getSolde()));
	}

}
