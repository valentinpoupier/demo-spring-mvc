package be.bstorm.akimts.mvc.models;

import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class CalculatriceForm {

    private int nbr1, nbr2;
    private char operator;

}
