import java.util.Scanner

public class Main {
    public static void Main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Bibliotheque bibliotheque = new Bibliotheque();

        int choix = 0;

        while (choix != 5) {
            System.out.println();
            System.out.println("===== MENU BIBLIOTHEQUE =====");
            System.out.println("1. Ajouter un livre");
            System.out.println("2. Afficher les livres");
            System.out.println("3. Emprunter un livre");
            System.out.println("4. Retourner un livre");
            System.out.println("5. Quitter");
            System.out.println("Votre choix : ");


            try {
                choix = Integer.parseInt(scanner.nextLine());

                switch (choix) {
                    case 1:
                        System.out.print("Titre du livre: ");
                        String titre = scanner.nextLine();

                        System.out.print("Auteur du livre: ");
                        String auteur = scanner.nextLine();

                        System.out.println("Identifiant du livre: ");
                        int idAjout = Integer.parseInt(scanner.nextLine());

                        bibliotheque.ajouterLivre(titre, auteur, idAjout);
                        break;

                    case 2:
                        bibliotheque.afficherLivres();
                        break;

                    case 3:
                        System.out.print("Identifiant du livre a emprunter: ");
                        int idEmprunt = Integer.parseInt(scanner.nextLine());

                        bibliotheque.emprunterLivre(idEmprunt);
                        break;

                    case 4:
                        System.out.print("Identifiant du livre a retourner: ");
                        int idRetour = Integer.parseInt(scanner.nextLine());

                        bibliotheque.retournerLivre(idRetour);
                        break;

                    case 5:
                        System.out.println("Au revoir !");
                        break;

                    default:
                        System.out.println("Erreur: choix invalide.");
                    break;
                }
            }catch (Exception e) {
                System.out.println("Erreur: saisie invalide.");
            }
        }
        scanner.close();
    }
}