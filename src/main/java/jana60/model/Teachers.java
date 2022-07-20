package jana60.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

//Inizializzazione della tabella

@Entity
@Table(name = "teachers")
public class Teachers {

	
    // nome delle colonne della tabella scelta: variabili identiche a quelle della tabella (riga 17: diciamo al programma che l'id ha l'autoincrement)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String surname;
	
	private String phone;
	
	private String email;
	
	private String officeAddress;
	
	private String officeNumber;


	//fare many to many
	
	@ManyToMany
	@JoinTable
	(
		name = "course_teacher",
		joinColumns = {@JoinColumn(name = "teacher_id")},
		inverseJoinColumns = {@JoinColumn(name = "course_id")}
			 
	)
	private List<Courses>courses;
	
	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAdress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	public String getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}
	
	
	
	
}