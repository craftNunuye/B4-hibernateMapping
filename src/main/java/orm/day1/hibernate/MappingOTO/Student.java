package orm.day1.hibernate.MappingOTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	
	private int sId;
	private String sName;
	private String Sdep;
	
	@OneToOne
	private Books books;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getSdep() {
		return Sdep;
	}

	public void setSdep(String sdep) {
		Sdep = sdep;
	}

	public Books getBooks() {
		return books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}
	
	
	
	
	
}
