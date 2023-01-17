package be.bstorm.akimts.mvc.controllers;

import be.bstorm.akimts.mvc.models.Personne;
import be.bstorm.akimts.mvc.services.PersonneService;
import jakarta.validation.Valid;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class PersonneController {

    private final PersonneService personneService;

    public PersonneController(PersonneService personneService) {
        this.personneService = personneService;
    }


    @GetMapping("/personne")
    public String insertForm(@ModelAttribute("personne") Personne personne){
        return "person";
    }

    @PostMapping("/personne")
    public String validation(@ModelAttribute("personne") @Valid Personne personne, BindingResult bindingResult){
        if (bindingResult.hasErrors())
            return "person";

        personneService.affichepersonne(personne);
        return "index";
    }
}
