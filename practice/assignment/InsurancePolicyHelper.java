package practice.assignment;

import java.util.ArrayList;
import java.util.List;

public class InsurancePolicyHelper {
	
	private List<InsuranceCustomer> customers = new ArrayList<InsuranceCustomer>();

	public void createCustomer(Integer id, String name, Integer phone, String address, Double salary, 
			Integer policyId, String policyName, Double premium) {
		InsuranceCustomer c = new InsuranceCustomer(id, name, phone, address, salary);
		customers.add(c);
		
		InsurancePolicy policy = createPolicy(policyId, policyName, premium);
		addPolicyToExistingCustomer(c, policy);
	}
	
	public void deleteCustomer(InsuranceCustomer customer) {
		customers.remove(customer);
	}
	
	public InsuranceCustomer searchForCustomer(Integer id) {
		for(InsuranceCustomer c : customers) {
			if(c.getInsuredId().equals(id)) {
				return c;
			}
		}
		return null;
	}
	
	public InsurancePolicy searchForPolicy(Integer id) {
		for(InsuranceCustomer c : customers) {
			//check all customer policies against id
			for(InsurancePolicy p : c.getPolicies()) {
				if(p.getPolicyId().equals(id)) {
					return p;
				}
			}
		}
		return null;
	}
	
	public InsurancePolicy createPolicy(Integer policyId, String policyName, Double premium) {
		return new InsurancePolicy(policyId, policyName, premium);
	}
	
	public void addPolicyToExistingCustomer(InsuranceCustomer customer, InsurancePolicy policy) {
		customer.getPolicies().add(policy);
	}
	
	public List<InsurancePolicy> getCustomerPolicies(InsuranceCustomer customer) {
		return customer.getPolicies();
	}
	
	public void deletePolicyFromCustomer(InsuranceCustomer customer, InsurancePolicy policy) {
		customer.getPolicies().remove(policy);
	}
	
}
