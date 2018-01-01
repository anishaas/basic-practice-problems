package practice.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsurancePolicyHelper {
	
	private List<InsuranceCustomer> customers = new ArrayList<InsuranceCustomer>();
	
	public List<InsurancePolicy> getAllPolicesByHighestPremium() {
		List<InsurancePolicy> policies = new ArrayList<InsurancePolicy>();
		for(InsuranceCustomer c : customers) {
			policies.addAll(c.getPolicies());
		}
		Collections.sort(policies, new InsurancePolicyPremiumSorter());
		return policies;
	}
	
	public void sortCustomers() {
		Collections.sort(customers);
	}

	public void createCustomer(Integer id, String name, Integer phone, String address, Double salary, 
			Integer policyId, String policyName, Double premium) {
		InsuranceCustomer c = new InsuranceCustomer(id, name, phone, address, salary);
		customers.add(c);
		addPolicyToExistingCustomer(id, policyId, policyName, premium);
	}
	
	public boolean deleteCustomer(Integer id) {
		InsuranceCustomer customer = getCustomerById(id);
		if(customer != null) {
			customers.remove(customer);	
			return true;
		}
		//customer not found
		return false; 
	}
	
	private InsuranceCustomer getCustomerById(Integer id) {
		for(InsuranceCustomer c : customers) {
			if (c.getInsuredId().equals(id)) {
				return c;
			}
		}
		return null;
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
	
	public void addPolicyToExistingCustomer(Integer customerId, Integer policyId, String policyName, 
			Double premium) {
		InsuranceCustomer customer = getCustomerById(customerId);
		InsurancePolicy policy = new InsurancePolicy(policyId, policyName, premium);
		if(customer != null) {
			customer.getPolicies().add(policy);	
		}
	}
	
	public boolean getCustomerPolicies(Integer id) {
		InsuranceCustomer customer = getCustomerById(id);
		if(customer != null) {
			customer.getPolicies();
			return true;
		}
		//customer not found
		return false;
	}
	
	public boolean deletePolicyFromCustomer(Integer customerId, Integer policyId) {
		InsurancePolicy policy;
		InsuranceCustomer customer = getCustomerById(customerId);
		if(customer != null) {
			//get customer's policies
			List<InsurancePolicy> policies = customer.getPolicies();
			if(policies != null) {
				for(InsurancePolicy p : policies) {
					if(p.getPolicyId().equals(policyId)) {
						customer.getPolicies().remove(p);
					}
				}	
			}
		}
		return false;
	}
	
	public List<InsuranceCustomer> getCustomers() {
		return customers;
	}
	
}
