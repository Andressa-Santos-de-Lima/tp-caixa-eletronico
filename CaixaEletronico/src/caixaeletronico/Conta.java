
package caixaeletronico;

public class Conta {
 
    /*
    ATRIBUTOS: SÃO ESTRUTURAS QUE REPRESENTAM
    OS DADOS DA CLASSE. EX.: AGENCIA, CONTA, SALDO, SENHA
    ATRIBUTOS POSSUEM DUAS ESTRUTURAS BÁSICAS: VISIBILIDADE E TIPO DE DADO
    VISIBILIDADE: DEFINE O NÍVEL DE ACESSO NO PROJETO
    TIPO DE DADO: DEFINE A CAPACIDADE DE ARMAZENAMENTO DE DADO DO ATRIBUTO
    */
   /*
    DECLARAÇÃO DOS ATRIBUTOS DA CLASSE CONTA
    ESTRUTURA DE DECLARAÇÃO DE UM ATRIBUTO:
    1ª PARTE - VISIBILIDADE
    2ª PARTE - TIPO
    3ª PARTE - NOME
    4ª PARTE(OPCIONAL) -ATRIBUIÇÃO DE VALOR OU DE DADO
    */
    /*
    TIPOS DE VISIBILIDADE:
    PUBLIC - PERMITE ACESSO DE QUALQUER ESTRUTURA DO CÓDIGO
    PROTECTED
    PRIVATE
    */
    
   public String agencia = "000-20-X"; //boa prática pede o nome do atributo em minusculo
   public String nroConta = "1234-000-B"; // nome composto o segundo nome começa com letra maiuscula
   public float saldo = 6000;
    
    /*
    MÉTODOS: SÃO ESTRUTURAS QUE REPRESENTAM AS
    AÇÕES QUE A CLASSE É CAPAZ DE EXECUTAR.
    VERIFICAR SALDO, REALIZAR DEPÓSITO, REALIZAR SAQUE
    
    DECLARAÇÃO DE METODOS
    1ª PARTE - VISIBILIDADE
    2ª PARTE - TIPO RETORNO DO METODO
    3ª PARTE - NOME DO METODO
    4ª PARTE - CABEÇALHO DE PARAMETROS
    */
   
   public void verificarSaldo(){
   
   //SAIDA DE TEXTO DO METODO verificarSaldo
   System.out.println("SEU SALDO ATUAL É: " + this.saldo);
      
      } // FECHAMENTO DO MÉTODO

   
   /*METODO DE REALIZAR DEPOSITO*/
   
   public void realizarDeposito (float valor){
   
       /*PRIMEIRA FORMA*/
    //this.saldo = this.saldo + valor;   
    
     /*SEGUNDA FORMA, boa prática*/
     
     this.saldo +=valor;
        
   }
   /*METODO DE REALIZAR SAQUE*/
   
   public void realizarSaque (float valor){
   
   this.saldo -=valor;
   
   }
   
} // FECHAMENTO DA CLASSE

