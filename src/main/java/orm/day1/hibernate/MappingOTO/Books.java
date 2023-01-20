package orm.day1.hibernate.MappingOTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bId;
	private String Bname;
	private Double bPrice;
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public Double getbPrice() {
		return bPrice;
	}
	public void setbPrice(Double bPrice) {
		this.bPrice = bPrice;
	}
	
	
	
	
}
