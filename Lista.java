import java.util.Arrays;
import java.util.Scanner;

public class Lista{
            /*
            Teste unitario
            Teste de caixa branca
            teste de caixa preta
            teste de caixa cinza
            teste de regressão
            teste de integração
            teste de volume
            teste de performance
            teste de carga
            teste de estresse
            teste de estabilidade
            */
    public static void main(String[] args) {
        String[] listaDeTestes = new String[]{
            "teste unitario"
            ,"Teste de caixa branca"
            ,"teste de caixa preta"
            ,"teste de caixa cinza"
            ,"teste de regressão"
            ,"teste de integração"
            ,"teste de volume"
            ,"teste de performance"
            ,"teste de carga"
            ,"teste de estresse"
            ,"teste de estabilidade"};
    
    Scanner input = new Scanner(System.in);
    String nomeTeste; 
    boolean contem;
   

    do{
        
        System.out.println("Inira o nome de um teste ");
        nomeTeste = input.nextLine();
        contem = Arrays.stream(listaDeTestes).anyMatch(nomeTeste::equals);
        if(contem==false){
            System.out.println(nomeTeste+" Não consta na lista");
        }
    }
    while( contem == false);
   
    System.out.println("Sucesso!!!!!");

}   
   
   

    }



