
package caixaeletronico;

import java.util.Scanner;

public class CaixaEletronico {
 public static void main(String[] args) {
        
        /*CRIAÇÃO DA INSTANCIA DA CLASSE CONTA
        TIPO
        NOME DE VARIEVEL DE INSTANCIA
        DEFINIR A CLASSE QUE SERÁ INSTANCIADA        
        */
     
        //Conta objConta = new Conta();
        
        /*ACESSANDO OS ATRIBUTOS, não é o ideal, foge das boas práticas*/
//        System.out.println("AGENCIA: " + objConta.agencia);
//        System.out.println("CONTA: " + objConta.nroConta);
//        System.out.println("SALDO " + objConta.saldo);
        
        /*ACESSANDO OS MÉTODOS*/
        
       // objConta.verificarSaldo();
        
        //objConta.realizarDeposito(500);
       // objConta.verificarSaldo();
        
       // objConta.realizarSaque(320.55f);
        //objConta.verificarSaldo(); 
        
        /*CRIAÇÃO DO OBJETO DE MENU*/
        
       Menu2 objMenu = new Menu2();
       
       /*
       1 -Saldo
       2 -Depósito
       3 -Saque
       */
       
      objMenu.executarMenu();
      //TesteWhile objWhile = new TesteWhile();
      //objWhile.testeLoop1();
       
    } 
    
}
