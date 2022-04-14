package fr.fms;

import fr.fms.bdd.ArticleDao;
import fr.fms.entities.Article;


public class ShopApp {


	private static ArticleDao shop;	
	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) {

		shopInit();
	
			// insertion d'un article
			Article art=new Article("Tapis de souris","Asus",45.99 );
			shop.create(art);

			// mise à jour d'un article que je récupère
			Article modif=shop.read(4);
			modif.setDescription("Tapis de douche");
			modif.setBrand("Baleine bleue");
			modif.setUnitaryPrice(499.99);
			shop.update(modif);

			// suppression d'un article
			shop.delete(4);

			// lecture d'un article en fonction de son identifiant
			Article read=shop.read(16);
			if (read!=null) {
				System.out.println("Affichage de l' "+read.toString());
			} else {
				System.out.println("Article inexistant");
			}
			System.out.println("-------------------------------------------------------");

			
			// lecture de la table articles
			System.out.println("Liste des articles : ");
			for(Article a : shop.readAll())
				System.out.println(a);
			System.out.println("-------------------------------------------------------");

	}
/**
 * initialisation de la boutique
 */
	private static void shopInit() {
		// TODO Auto-generated method stub
		shop = new ArticleDao();
	}


}

