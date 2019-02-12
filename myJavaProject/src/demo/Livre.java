package demo;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Livre")
public class Livre  {

    public Livre() {
    }

    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "Livre_id")
    private int id;
    
    
    private String titre;
    
    @ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Auteur_id")
    private Auteur auteur;
    
    @ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Genre_id")
    private Genre genre;
    
    @ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Editeur_id")
    private Editeur editeur;
    
    @ManyToOne(cascade = CascadeType.ALL)
   	@JoinColumn(name = "Bibliotheque_id")
    private Bibliotheque bibliotheque;

	public Bibliotheque getBibliotheque() {
		return bibliotheque;
	}

	public void setBibliotheque(Bibliotheque bibliotheque) {
		this.bibliotheque = bibliotheque;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Auteur getAuteur() {
		return auteur;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Editeur getEditeur() {
		return editeur;
	}

	public void setEditeur(Editeur editeur) {
		this.editeur = editeur;
	}

	public int getId() {
		return id;
	}

}