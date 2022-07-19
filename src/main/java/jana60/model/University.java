package jana60.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//Inizializzazione della tabella

@Entity
@Table(name = "departments")
public class University {
	
    // nome delle colonne della tabella scelta: variabili identiche a quelle della tabella (riga 17: diciamo al programma che l'id ha l'autoincrement)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String address;
	
	private String phone;
	
	private String email;
	
	private String website;
	
	private String headOfDepartment;
	@OneToMany
	@JoinColumn(name = "department_id")
	private List<Degrees> degree;
	
	//Getters and Setters variabili

	public List<Degrees> getDegree() {
		return degree;
	}

	public void setDegree(List<Degrees> degree) {
		this.degree = degree;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getHeadOfDepartment() {
		return headOfDepartment;
	}

	public void setHeadOfDepartment(String headOfDepartment) {
		this.headOfDepartment = headOfDepartment;
	}
	
	
	
}