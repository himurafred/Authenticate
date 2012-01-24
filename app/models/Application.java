package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GenericGenerator;

import play.db.jpa.GenericModel;

@Entity
public class Application extends GenericModel{

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	public String idApplication;
	
	//Description de d'application
	public String description;

	//Nom de l'application
	public String name;
	
	//Liste de user inscrit à l'application
	@ManyToMany (cascade = CascadeType.ALL)
	public List<User> users;
}