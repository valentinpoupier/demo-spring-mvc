package be.bstorm.akimts.mvc.services;

import be.bstorm.akimts.mvc.patterns.Personne;
import org.springframework.stereotype.Service;

@Service
public class PersonneService {

    public void affichepersonne(Personne personne){
        System.out.println(personne.toString());
    }

}
