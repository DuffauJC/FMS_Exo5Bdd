/**
 * 
 */
package fr.fms.bdd;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import fr.fms.entities.Article;

/**
 * @author Stagiaires08P
 *
 */
public interface Dao<T> {

	public Connection connection=BddConnection.getConnection();
	public void create(T obj);               // ajout d'une nouvelle occurence en base
	public T read(int id);					 // renvoi un objet correspondant à l'id en base
	public boolean update(Article obj);            // met à jour l'objet en base, renvoi vrai si c'est fait
	public boolean delete(int id);            // supprime l'objet en base, renvoi vrai si c'est fait
	public ArrayList<T> readAll();			 // renvoi tous les objets de la table correspondante
	
}
