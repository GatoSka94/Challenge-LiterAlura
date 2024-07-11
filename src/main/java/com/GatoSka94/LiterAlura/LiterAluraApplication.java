package com.GatoSka94.LiterAlura;

import com.GatoSka94.LiterAlura.MenuPrincipal.MenuPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.GatoSka94.LiterAlura.repository")
public class LiterAluraApplication implements CommandLineRunner {

    public LiterAluraApplication(MenuPrincipal principal) {
        this.principal = principal;
    }


    public static void main(String[] args) {
		SpringApplication.run(LiterAluraApplication.class, args);
	}

	@Autowired
	private MenuPrincipal principal;

	@Override
	public void run(String... args) throws Exception {

		principal.muestraMenu();

	}
}