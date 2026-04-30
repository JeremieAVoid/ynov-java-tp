public class Livre {
    private String titre;
    private String auteur;
    private int identifiant;
    private boolean disponible;

    public Livre(String titre, String auteur, int identifiant) {
        this.titre = titre;
        this.auteur = auteur;
        this.identifiant = identifiant;
        this.disponible = true;
    }

    public String getTitre() {
        return titre;
    }
    public String getAuteur() {
        return auteur;
    }
    public int getIdentifiant() {
        return identifiant;
    }
    public boolean isDisponible() {
        return disponible;
    }

    public void emprunter() {
        if (disponible) {
            disponible = false;
        } else {
            System.out.println("Le livre n'est pas disponible pour emprunt.");
        }
    }

    public void retourner() {
        if (disponible)  {
            System.out.println("Le livre est déjà disponible.");
        } else {
            disponible = true;
        }
    }

    public void afficherLivre() {
        System.out.println("Titre: " + titre);
        System.out.println("Auteur: " + auteur);
        System.out.println("Identifiant: " + identifiant);
        System.out.println(disponible ? "Disponible" : "Emprunté");
    }
}
