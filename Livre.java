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
            disponible = false;
    }


    public void retourner() {
            disponible = true;
    }


    public void afficherLivre() {
        System.out.println("Titre: " + titre);
        System.out.println("Auteur: " + auteur);
        System.out.println("Identifiant: " + identifiant);
        System.out.println(disponible ? "Disponible" : "Emprunté");
    }
}
