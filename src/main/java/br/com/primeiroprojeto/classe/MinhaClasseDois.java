package br.com.primeiroprojeto.classe;

import org.springframework.stereotype.Component;

@Component
public class MinhaClasseDois {

    public MinhaClasseDois() {
        System.out.println("Instanciando MinhaClasseDois :: " + this.hashCode());
    }
    public void imprimir() {
        System.out.println("Minha classe dois hascode é : " + this.hashCode());
    }
}
