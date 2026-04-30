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
        Livre livre = new Livre(titre, auteur, identifiant);
        livres.add(livre);
        System.out.println("livre ajouté avec succès");
    }
    public void afficherLivres() {
        if (livres.isEmpty()) {
            System.out.println("Aucun livre dans la bibliothèque");
            return;
        }
        for (Livre livre : livres) {
            livre.afficherLivre();
        }
    }
    public void emprunterLivre(int identifiant) {
    Livre livre = chercherLivre(identifiant);

    if (livre == null) {
        System.out.println("Erreur: livre introuvable.");
        return;
        }

    if (livre.isDisponible()) {
        System.out.println("Erreur: ce livre est déjà disponible.");
        return;
    }
    livre.retourner();
        System.out.println("Livre retourné avec succès.");
    }

    public Livre chercherLivre(int identifiant) {
        for (Livre livre : livres) {
            if (livre.getIdentifiant() == identifiant) {
                return livre;
            }
        }

        return null;
    }
}
