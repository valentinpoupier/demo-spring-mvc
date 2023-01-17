package be.bstorm.akimts.mvc;

import be.bstorm.akimts.mvc.patterns.Perso;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringMvcApplication.class, args);


		Perso p = Perso.builder("luc")
				.nom("dubois")
				.build();
	}

}
