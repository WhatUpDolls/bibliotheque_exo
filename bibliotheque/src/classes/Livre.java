package classes;

import interfaces.Empruntable;

public class Livre implements Empruntable {
    private String titre;
    private String auteur;
    private String idbook;
    private boolean disponible;

    public Livre(String titre, String auteur, String idbook, boolean disponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.idbook = idbook;
        this.disponible = disponible;
    }

    @Override
    public void emprunter() {
        this.disponible = false;
    }

    @Override
    public void rendre() {
        this.disponible = true;
    }
}
