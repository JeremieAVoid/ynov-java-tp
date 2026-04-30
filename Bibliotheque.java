import java.util.ArrayList;

public class Bibliotheque {
    private ArrayList<Livre> livres;

    public Bibliotheque() {
        livres = new ArrayList<>();
    }

    public void ajouterLivre(String titre, String auteur, int identifiant) {
        if (chercherLivre(identifiant) != null) {
            System.out.println(ConsoleColors.RED + "Erreur : un livre avec cet identifiant existe déjà." + ConsoleColors.RESET);
            return;
        }
        Livre livre = new Livre(titre, auteur, identifiant);
        livres.add(livre);
        System.out.println(ConsoleColors.GREEN + "Livre ajouté avec succès." + ConsoleColors.RESET);
    }

    public void afficherLivres() {
        if (livres.isEmpty()) {
            System.out.println();
            System.out.println(ConsoleColors.CYAN + "==============================================" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.YELLOW + "Aucun livre dans la bibliothèque." + ConsoleColors.RESET);
            System.out.println(ConsoleColors.CYAN + "==============================================" + ConsoleColors.RESET);
            return;
        }

        System.out.println();
        System.out.println(ConsoleColors.CYAN + ConsoleColors.BOLD + "                         LISTE DES LIVRES " + ConsoleColors.RESET);
        System.out.println(ConsoleColors.CYAN + "==========================================================================" + ConsoleColors.RESET);
        System.out.printf(ConsoleColors.BOLD + "| %-5s | %-25s | %-20s | %-12s |" + ConsoleColors.RESET + "\n", 
                "ID", "Titre", "Auteur", "État");
        System.out.println(ConsoleColors.CYAN + "--------------------------------------------------------------------------" + ConsoleColors.RESET);

        for (Livre livre : livres) {
            livre.afficherLivre();
        }
        System.out.println(ConsoleColors.CYAN + "==========================================================================" + ConsoleColors.RESET);
        System.out.println("Nombre total de livres : " + livres.size());
    }

    public void emprunterLivre(int identifiant) {
        Livre livre = chercherLivre(identifiant);
        if (livre == null) {
            System.out.println(ConsoleColors.RED + "Erreur : livre introuvable." + ConsoleColors.RESET);
            return;
        }
        if (!livre.isDisponible()) {
            System.out.println(ConsoleColors.RED + "Erreur : ce livre est déjà emprunté." + ConsoleColors.RESET);
            return;
        }
        livre.emprunter();
        System.out.println(ConsoleColors.GREEN + "Livre emprunté avec succès." + ConsoleColors.RESET);
    }

    public void retournerLivre(int identifiant) {
        Livre livre = chercherLivre(identifiant);
        if (livre == null) {
            System.out.println(ConsoleColors.RED + "Erreur : livre introuvable." + ConsoleColors.RESET);
            return;
        }
        if (livre.isDisponible()) {
            System.out.println(ConsoleColors.RED + "Erreur : ce livre est déjà disponible." + ConsoleColors.RESET);
            return;
        }
        livre.retourner();
        System.out.println(ConsoleColors.GREEN + "Livre retourné avec succès." + ConsoleColors.RESET);
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