package be.bstorm.akimts.mvc.services;

import be.bstorm.akimts.mvc.models.Calcul;
import org.springframework.stereotype.Service;

@Service
public class CalculService {

    public int addReponse(Calcul form){
        if (form.getOp().equalsIgnoreCase("+")) {
            form.setReponse(form.getNb1() + form.getNb2());
        }
        if (form.getOp().equalsIgnoreCase("-")) {
            form.setReponse(form.getNb1() - form.getNb2());
        }
        if (form.getOp().equalsIgnoreCase("*")) {
            form.setReponse(form.getNb1() * form.getNb2());
        }
        if (form.getOp().equalsIgnoreCase("/")) {
            form.setReponse(form.getNb1() / form.getNb2());
        }
        if (form.getOp().equalsIgnoreCase("%")) {
            form.setReponse(form.getNb1() % form.getNb2());
        }
        return form.getReponse();
    }
}
