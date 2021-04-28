package pi;

/**
 *
 * @author Arthur
 */
import java.util.Scanner;

public class PI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double prodvalor, taxa, res, entrega, desc, taxapp, pcusto;
        String nome, verific, senhaverific, prod, senha;
        int menu;
        
        Scanner dados = new Scanner(System.in);
      
           System.out.println("Digite seu nome: ");
           nome=dados.nextLine();
           
           System.out.println("Digite sua senha: ");
           senha=dados.nextLine();
           
           System.out.println("LOGIN ");
           
           System.out.println("Digite seu nome :");
           verific=dados.nextLine();
           
           System.out.println("Digite seu senha :");
           senhaverific=dados.nextLine();
           
           if(nome.equals(verific) && senha.equals(senhaverific)){
               
               System.out.println("SUCESSO");
               
               System.out.println("Digite o nome do produto: ");
               prod=dados.nextLine();
               
               System.out.println("Digite o valor do produto: ");
               prodvalor=dados.nextDouble();
               
               
                System.out.print("1- Calcular Taxa \"\n" +
                    "2- Entrega \"\n"
                   +"3- Descontos \"\n" +
                    "4- Taxa app \"\n" +
                    "5- PreÃ§o de custo \"\n"+
                    "6- PreÃ§o do produto \"\n"+
                    "7- Valores finais \"\n");
            
                menu=dados.nextInt();
                
                if(menu==1){
                   System.out.println("Digite o valor da taxa: ");
                   taxa=dados.nextDouble();
                   res= prodvalor - taxa;
                   System.out.println("Valor da Taxa = R$ "+taxa+" Valor do produto = R$ " +prodvalor+ " Taxa aplicada ao valor = R$ " +prodvalor+ " - R$" +taxa+ " = R$ " +res);
                }
                if(menu==2){
                    System.out.println("Digite o valor da entrega: ");
                    entrega=dados.nextDouble();
                    res= prodvalor - entrega;
                    System.out.println("Valor da Entrega = R$ "+entrega+" Valor do produto = R$ " +prodvalor+ " Entrega aplicada ao valor = R$ " +prodvalor+ " - R$" +entrega+ " = R$ " +res);
                }
                if(menu==3){
                    System.out.println("Digite o valor dos descontos: ");
                    desc=dados.nextDouble();
                    res= prodvalor - desc;
                    System.out.println("Valor do Desconto = R$ "+desc+" Valor do produto = R$ " +prodvalor+ " Desconto aplicada ao valor = R$ " +prodvalor+ " - R$" +desc+ " = R$ " +res);
                }
                if(menu==4){
                    System.out.println("Digite o valor da taxa do app: ");
                    taxapp=dados.nextDouble();
                    res= prodvalor - taxapp;
                    System.out.println("Valor da Taxa do app = R$ "+taxapp+" Valor do produto = R$ " +prodvalor+ " Taxa do app aplicada ao valor = R$ " +prodvalor+ " - R$" +taxapp+ " = R$ " +res);
                }
                if(menu==5){
                    System.out.println("Digite o preÃ§o de custo: ");
                    pcusto=dados.nextDouble();
                    res= prodvalor - pcusto;
                    System.out.println("Valor do preÃ§o de custo = R$ "+pcusto+" Valor do produto = R$ " +prodvalor+ " preÃ§o de custo aplicada ao valor = R$ " +prodvalor+ " - R$" +pcusto+ " = R$ " +res);
                }
                if(menu==6){
                    System.out.println("Digite o valor da entrega: ");
                    entrega=dados.nextDouble();
                    res= prodvalor - entrega;
                    System.out.println("Valor da Entrega = R$ "+entrega+" Valor do produto = R$ " +prodvalor+ " Entrega aplicada ao valor = R$ " +prodvalor+ " - R$" +entrega+ " = R$ " +res);
                }
                if(menu==7){
                    System.out.println("Digite o valor da entrega: ");
                    entrega=dados.nextDouble();
                    res= prodvalor - entrega;
                    System.out.println("Valor da Entrega = R$ "+entrega+" Valor do produto = R$ " +prodvalor+ " Entrega aplicada ao valor = R$ " +prodvalor+ " - R$" +entrega+ " = R$ " +res);
                }
    
           }else{
               System.out.println("FALHOU");
           }
    

    }
}
