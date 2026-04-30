import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bibliotheque bibliotheque = new Bibliotheque();
        int choix = 0;

        while (choix != 6) {
            System.out.println();
            System.out.println(ConsoleColors.CYAN + ConsoleColors.BOLD + "===== MENU BIBLIOTHÈQUE =====" + ConsoleColors.RESET);
            System.out.println(" 1. Ajouter un livre ");
            System.out.println(" 2. Afficher les livres ");
            System.out.println(" 3. Emprunter un livre ");
            System.out.println(" 4. Retourner un livre ");
            System.out.println(" 5. Rechercher un livre ");
            System.out.println(" 6. Quitter ");
            System.out.print(ConsoleColors.YELLOW + "\nVotre choix : " + ConsoleColors.RESET);

            try {
                choix = Integer.parseInt(scanner.nextLine());

                switch (choix) {
                    case 1:
                        System.out.print("Titre du livre : ");
                        String titre = scanner.nextLine();
                        System.out.print("Auteur du livre : ");
                        String auteur = scanner.nextLine();
                        System.out.print("Identifiant du livre : ");
                        int idAjout = Integer.parseInt(scanner.nextLine());

                        bibliotheque.ajouterLivre(titre, auteur, idAjout);
                        break;

                    case 2:
                        bibliotheque.afficherLivres();
                        break;

                    case 3:
                        System.out.print("Identifiant du livre à emprunter : ");
                        int idEmprunt = Integer.parseInt(scanner.nextLine());
                        bibliotheque.emprunterLivre(idEmprunt);
                        break;

                    case 4:
                        System.out.print("Identifiant du livre à retourner : ");
                        int idRetour = Integer.parseInt(scanner.nextLine());
                        bibliotheque.retournerLivre(idRetour);
                        break;

                    case 5:
                        System.out.print("Identifiant du livre à rechercher : ");
                        int idRecherche = Integer.parseInt(scanner.nextLine());

                        Livre livreRecherche = bibliotheque.chercherLivre(idRecherche);

                        if (livreRecherche == null) {
                            System.out.println(ConsoleColors.RED + "Erreur : livre introuvable." + ConsoleColors.RESET);
                        } else {
                            System.out.println();
                            System.out.println(ConsoleColors.CYAN + "Livre trouvé :" + ConsoleColors.RESET);
                            System.out.println(ConsoleColors.CYAN + "==========================================================================" + ConsoleColors.RESET);
                            System.out.printf(ConsoleColors.BOLD + "| %-5s | %-25s | %-20s | %-12s |" + ConsoleColors.RESET + "\n", 
                                    "ID", "Titre", "Auteur", "État");
                            System.out.println(ConsoleColors.CYAN + "--------------------------------------------------------------------------" + ConsoleColors.RESET);
                            livreRecherche.afficherLivre();
                            System.out.println(ConsoleColors.CYAN + "==========================================================================" + ConsoleColors.RESET);
                        }
                        break;

                    case 6:
                        System.out.println(ConsoleColors.CYAN + ConsoleColors.BOLD + "Au revoir !" + ConsoleColors.RESET);
                        break;

                    default:
                        System.out.println(ConsoleColors.RED + "Erreur : choix invalide." + ConsoleColors.RESET);
                        break;
                }
            } catch (Exception e) {
                System.out.println(ConsoleColors.RED + "Erreur : saisie invalide." + ConsoleColors.RESET);
            }
        }
        scanner.close();
    }
}