package be.bstorm.akimts.mvc.patterns;

import lombok.Data;

@Data
public class Perso {

    private String prenom;
    private String nom;

    private Perso(String prenom, String nom){
        this.prenom = prenom;
        this.nom = nom;
    }

    public static Builder builder(String prenom){
        return new Builder(prenom);
    }

    public static class Builder {

        private final String prenom;
        private String nom;

        public Builder(String prenom) {
            this.prenom = prenom;
        }

        public Builder nom(String nom){
            this.nom = nom;
            return this;
        }

        public Perso build(){
            return new Perso(this.prenom, this.nom);
        }

    }

}
