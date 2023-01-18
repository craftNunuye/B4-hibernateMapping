package orm.day1.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="insurancetable")
public class insurance {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private int insuranceId;
	
	@Column(name="insuranceNumber")
	private int insuranceNum;
	
	@Transient
	private int insuranceclac;
	
	

	private String insuranceName;
	
	@Column(nullable = false )
	private String insuranceDec;

	private fullName fullName;

	public int getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}

	public int getInsuranceNum() {
		return insuranceNum;
	}

	public void setInsuranceNum(int insuranceNum) {
		this.insuranceNum = insuranceNum;
	}

	public int getInsuranceclac() {
		return insuranceclac;
	}

	public void setInsuranceclac(int insuranceclac) {
		this.insuranceclac = insuranceclac;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public String getInsuranceDec() {
		return insuranceDec;
	}

	public void setInsuranceDec(String insuranceDec) {
		this.insuranceDec = insuranceDec;
	}

	public fullName getFullName() {
		return fullName;
	}

	public void setFullName(fullName fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "insurance [insuranceId=" + insuranceId + ", insuranceNum=" + insuranceNum + ", insuranceclac="
				+ insuranceclac + ", insuranceName=" + insuranceName + ", insuranceDec=" + insuranceDec + ", fullName="
				+ fullName + "]";
	}
	
	
	
}
