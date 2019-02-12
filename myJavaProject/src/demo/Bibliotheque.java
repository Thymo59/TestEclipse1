package demo;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bibliotheque")
public class Bibliotheque {

    public Bibliotheque() {
    }
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "Bibliotheque_id")
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