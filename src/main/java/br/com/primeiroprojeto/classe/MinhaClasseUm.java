package br.com.primeiroprojeto.classe;

import org.springframework.stereotype.Component;

@Component
public class MinhaClasseUm {

    public MinhaClasseUm() {
        System.out.println("Instanciando MinhaClasseUm :: " + this.hashCode());
    }
    public void imprimir() {
        System.out.println("Minha classe um hascode é : " + this.hashCode());
    }
}
