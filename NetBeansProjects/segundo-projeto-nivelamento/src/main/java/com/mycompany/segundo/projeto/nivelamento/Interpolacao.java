package com.mycompany.segundo.projeto.nivelamento;

import java.net.Socket;

public class Interpolacao {
    public static void main(String[] args) {
        String nome = "Xampson";
        Integer idade = 42;
        Double altura = 1.55;
        
       System.out.println(
           String.format("Meu nome é %s, tenho %d anos e %.2f de altura", 
                   nome, idade, altura));       
    }
}
