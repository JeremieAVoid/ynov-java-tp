import java.util.ArrayList;

public class Bibliotheque {
    private ArrayList<Livre> livres;

    public Bibliotheque() {
        livres = new ArrayList<livre>();
    }
    public void ajouterLivre(string titre, string auteur, int identifiant) {
        if (chercherLivre(identifiant) != null) {
            System.out.println("Erreur: un livre avec cet identifiant existe déjà");
            return;
        }
    }
}
