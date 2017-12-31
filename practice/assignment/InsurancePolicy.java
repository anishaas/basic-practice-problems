package practice.assignment;

public class InsurancePolicy {
	
	private Integer policyId;
	private String policyName;
	private Double premium;
	
	public InsurancePolicy(Integer policyId, String policyName, Double premium) {
		this.policyId = policyId;
		this.policyName = policyName;
		this.premium = premium;
	}
	
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public Double getPremium() {
		return premium;
	}
	public void setPremium(Double premium) {
		this.premium = premium;
	}
}
