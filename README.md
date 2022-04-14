# FMS_Exo5Bdd

- exo 3 version 3
 
Reprenons donc nos bonnes habitudes et découpons notre appli à l’aide des packages :

5.1 Ajouter le package fr.fms.entities et ajoutez-y la classe Article

5.2 Ajouter le package fr.fms.dao qui va faire le lien entre notre application et la base de données, ajoutez-y l’interface générique Dao (ci-dessous) contenant les méthodes dites 
CRUD pour Create, Read, Update et Delete, puis ajouter la classe ArticleDao qui 
implémente l’interface générique Dao : public class ArticleDao implements Dao<Article>

5.3 Capturer et relayer les exceptions avec des messages explicites (Privilégier le try with ressources). Puis dans votre programme principal tester votre implémentation ArticleDao.
