
package banco;
import java.util.Scanner;

public class GerenciaBanco {
    public float saldo;
    public String extrato = "";
   
   
    
    public void menu (){
        
        Scanner sc = new Scanner (System.in);
        
        while (true){
            
            System.out.println("\t\n ----------MENU----------\n");
            System.out.println("[1] Depositar \n" + "[2} Sacar \n" + "[3] Extrato \n" + "[0] Sair ");
            System.out.println("Informe a opcao desejada: ");
            
             int opcao = sc.nextInt();
             
             if (opcao == 1){
                 System.out.println("Informe o valor do deposito: " );
                 float valorDeposito = sc.nextFloat();
                 deposito (valorDeposito);
             } else if (opcao == 2 ){
                 System.out.println("Informe o valor do saque ");
                 float valorSaque = sc.nextFloat();
                 saque (valorSaque);
             } else if (opcao == 3){
                 exibirExtrato();                  
             } else if (opcao == 0) {
                 System.out.println("Obrigado(a) por utilizar nosso sistema ");
                 break;
             }else{
                 System.out.println("Informe uma opcao valida ");
             }
                              
        }
            
    }
    
    public void deposito (float valor){
        saldo += valor;
        extrato += "\t\n Depositos realizados R$ " + valor;
        System.out.println("Valor do deposito: R$ " + valor);
    }
    
    public void saque (float valor){
        if (saldo >= valor){
            saldo -= valor;
            extrato += " \t\n Saques realizados: R$ " + valor;
            System.out.println("Valor do saque: R$ " + valor);
        }else{
            System.out.println("Voce nao possui saldo suficiente");
        }                     }
    
    public void exibirExtrato (){
        
        if (!extrato.equals ("")){
           System.out.println("\t==========EXTRATO==========");
           System.out.println(extrato);
           System.out.println(" Saldo atual: R$ " + saldo );
            
        }else{
            System.out.println("\t==========EXTRATO==========\n");
            System.out.println("NENHUMA TRASACAO FOI REALIZADA");
        }
        
        
       
       
        
       
        
    }
            
    
}


