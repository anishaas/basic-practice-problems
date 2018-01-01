package practice.assignment;

import java.util.Comparator;

public class InsurancePolicyPremiumSorter implements Comparator<InsurancePolicy> {

	@Override
	public int compare(InsurancePolicy o1, InsurancePolicy o2) {
		if(o1 == null || o2 == null) {
			return 0;
		}
		
		if(o1.getPremium() == null || o2.getPremium() == null) {
			return 0;
		}
		
		return o1.getPremium().compareTo(o2.getPremium());		
	}
	
}
