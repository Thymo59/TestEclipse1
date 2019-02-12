package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import demo.Auteur;
import demo.Bibliotheque;
import demo.Editeur;
import demo.Genre;
import demo.Livre;

public class Test {
	
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(Constants.MY_JPA_EM);
	private static EntityManager entityManager = entityManagerFactory.createEntityManager();

	public static void main(String[] args) {
		
		entityManager.getTransaction().begin();
		Editeur editeur1 = new Editeur();
		editeur1.setNom("WaltDisney");
		entityManager.persist(editeur1);
		entityManager.getTransaction().commit();
//		
		entityManager.getTransaction().begin();
		Genre genre1 = new Genre();
		genre1.setLabel("Fantastique");
		entityManager.persist(genre1);
		entityManager.getTransaction().commit();
		
		entityManager.getTransaction().begin();
		Auteur auteur1 = new Auteur();
		auteur1.setNom("Mogly");
		entityManager.persist(auteur1);
		entityManager.getTransaction().commit();
		
		entityManager.getTransaction().begin();
		Bibliotheque bibliotheque1 = new Bibliotheque();
		bibliotheque1.setNom("Vincent LALLIER");
		entityManager.persist(bibliotheque1);
		entityManager.getTransaction().commit();
		
		entityManager.getTransaction().begin();
		Livre livre1 = new Livre();
		livre1.setTitre("L'enfant de la jungle");
		livre1.setAuteur(auteur1);
		livre1.setEditeur(editeur1);
		livre1.setGenre(genre1);
		livre1.setBibliotheque(bibliotheque1);
		entityManager.persist(livre1);
		entityManager.getTransaction().commit();
		
		System.out.println(genre1);
		System.out.println(rechercherGenre("Fantastique"));
		
		entityManager.close();
		entityManagerFactory.close();
	}
	
	public static List<Genre> rechercherGenre( String nomGenre){
		return entityManager.createQuery("SELECT g FROM Genre g WHERE label='"+nomGenre+"'").getResultList() ;
	}

}
