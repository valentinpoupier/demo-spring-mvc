package be.bstorm.akimts.mvc.controllers;

import be.bstorm.akimts.mvc.patterns.Personne;
import be.bstorm.akimts.mvc.services.PersonneService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
