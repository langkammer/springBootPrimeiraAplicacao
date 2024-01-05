package br.com.primeiroprojeto;

import br.com.primeiroprojeto.classe.MinhaClasseDois;
import br.com.primeiroprojeto.classe.MinhaClasseUm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class MainAplicacao {

    @Autowired
    private MinhaClasseUm minhaClasseUm;

    @Autowired
    private MinhaClasseDois minhaClasseDois;


    public static void main(String[] args) {
        SpringApplication.run(MainAplicacao.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void iniciar() throws InterruptedException {
        minhaClasseUm.imprimir();
        minhaClasseDois.imprimir();
        System.out.println("Tudo pronto aplicacao terminou inicio");
    }

}
