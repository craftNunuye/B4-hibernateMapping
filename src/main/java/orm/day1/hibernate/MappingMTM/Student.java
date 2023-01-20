package orm.day1.hibernate.MappingMTM;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	
	private int sId;
	private String sName;
	private String Sdep;
	
	@ManyToMany
	private List<Books> books= new ArrayList<Books>();

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

	public List<Books> getBooks() {
		return books;
	}

	public void setBooks(List<Books> books) {
		this.books = books;
	}
	
	
	
}
