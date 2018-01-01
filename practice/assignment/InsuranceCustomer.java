package practice.assignment;

import java.util.List;

import practice.sorting.Customer;

public class InsuranceCustomer implements Comparable<InsuranceCustomer> {

	private Integer insuredId;
	private String insuredName;
	private Integer insuredPhone;
	private String insuredAddress;
	private Double insuredSalary;
	private List<InsurancePolicy> policies;
	
	public InsuranceCustomer(Integer id, String name, Integer phone, String address, 
			Double salary) {
		this.insuredId = id;
		this.insuredName = name;
		this.insuredPhone = phone;
		this.insuredAddress = address;
		this.insuredSalary = salary;
	}
	
	public Integer getInsuredId() {
		return insuredId;
	}
	public void setInsuredId(Integer insuredId) {
		this.insuredId = insuredId;
	}
	public String getInsuredName() {
		return insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}
	public Integer getInsuredPhone() {
		return insuredPhone;
	}
	public void setInsuredPhone(Integer insuredPhone) {
		this.insuredPhone = insuredPhone;
	}
	public String getInsuredAddress() {
		return insuredAddress;
	}
	public void setInsuredAddress(String insuredAddress) {
		this.insuredAddress = insuredAddress;
	}
	public Double getInsuredSalary() {
		return insuredSalary;
	}
	public void setInsuredSalary(Double insuredSalary) {
		this.insuredSalary = insuredSalary;
	}
	public List<InsurancePolicy> getPolicies() {
		return policies;
	}
	public void setPolicies(List<InsurancePolicy> policies) {
		this.policies = policies;
	}
	
	@Override
	public int compareTo(InsuranceCustomer o) {
		if(o==null){
			return 0;
		}		
		return this.getInsuredId().compareTo(o.getInsuredId());
	}
}
