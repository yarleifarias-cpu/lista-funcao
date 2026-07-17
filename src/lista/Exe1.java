package lista;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Exe1 {
    static void exibirSaudacao(String nome){
        System.out.println("Olá " + nome + "! Seja bem vindo ao SENAI");
    }

   public static void main(String[] args) {
        exibirSaudacao( "Yarlei");
       exibirSaudacao( "Kossi");
       exibirSaudacao( "Tatavo");
    }
}
