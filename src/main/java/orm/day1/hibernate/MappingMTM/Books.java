package orm.day1.hibernate.MappingMTM;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

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
