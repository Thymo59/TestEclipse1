package demo;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Auteur")
public class Auteur {

    public Auteur() {
    }

    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "Auteur_id")
    private int id;
    
    private String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getId() {
		return id;
	}
}