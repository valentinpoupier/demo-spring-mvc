package be.bstorm.akimts.mvc.models;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class HotelForm {

    @PositiveOrZero
    @NotNull
    private Long id;

    @PositiveOrZero
    @Max(5)
    @NotNull
    private Integer stars;

    @NotBlank
    @Size(max = 100)
    private String receptionist;

    @NotBlank
    @Size(max = 100)
    private String name;

    @NotBlank
    @Size(max = 200)
    private String address;

}
