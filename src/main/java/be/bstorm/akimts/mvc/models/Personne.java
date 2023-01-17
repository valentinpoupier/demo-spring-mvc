package be.bstorm.akimts.mvc.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.Data;
import java.time.LocalDate;

@Data
public class Personne {

    @NotBlank
    private String lastname;

    @NotBlank
    private String firstname;

    @Past
    private LocalDate ddn;

}