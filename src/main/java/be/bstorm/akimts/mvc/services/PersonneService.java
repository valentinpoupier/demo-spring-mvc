package be.bstorm.akimts.mvc.services;

import be.bstorm.akimts.mvc.models.Personne;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

@Service
public class PersonneService {

    public void affichepersonne(Personne personne){
        System.out.println(personne.toString());
    }

}
