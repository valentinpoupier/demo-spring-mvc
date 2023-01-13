package be.bstorm.akimts.mvc.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Calcul {
    private int nb1;
    private String op;
    private int nb2;
    private int reponse;
}
