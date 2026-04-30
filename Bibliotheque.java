import java.util.ArrayList;

public class Bibliotheque {
    private ArrayList<Livre> livres;

    public Bibliotheque() {
        livres = new ArrayList<Livre>();
    }
    public void ajouterLivre(String titre, String auteur, int identifiant) {
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
            System.out.println();
            System.out.println("==============================================");
            System.out.println("Aucun livre dans la bibliotheque.");
            System.out.println("==============================================");
        return;
        }

        System.out.println();
        System.out.println("==========================================================================");
        System.out.println("                         LISTE DES LIVRES");
        System.out.println("==========================================================================");
        System.out.printf("| %-5s | %-25s | %-20s | %-12s |\n", "ID", "Titre", "Auteur", "Etat");
        System.out.println("--------------------------------------------------------------------------");

        for (Livre livre : livres) {
            livre.afficherLivre();
        }
        System.out.println("==========================================================================");
        System.out.println("Nombre total de livres : " + livres.size());
    }
    public void emprunterLivre(int identifiant) {
        Livre livre = chercherLivre(identifiant);

        if (livre == null) {
            System.out.println("Erreur: livre introuvable.");
            return;
        }

        if (!livre.isDisponible()) {
            System.out.println("Erreur: ce livre est déjà emprunté.");
            return;
        }

        livre.emprunter();
        System.out.println("Livre emprunté avec succès.");
    }

    public void retournerLivre(int identifiant) {
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
        System.out.println("Livre retourné avec succes.");
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
