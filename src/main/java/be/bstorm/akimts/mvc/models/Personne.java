package be.bstorm.akimts.mvc.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Personne {

    @NotBlank
    private String lastname;

    @NotBlank
    private String firstname;

    @Past
    private LocalDate ddn;

}
