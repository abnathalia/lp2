package cpf;
import java.util.Scanner;

public class CPF {
       
    public static void main(String[] args) {
       int j=2;
       int restodivisao;
       int soma=0;
       int i;
       int peso [] = new int[10];
       int numero [] = new int [10];
       int resul [] = new int [10];
       
       //Ler CPF
       Scanner input = new Scanner(System.in);
       System.out.println ("Digite os nove primeiros digitos de seu CPF: ");
       String cpfnro = input.next(); 
            for (i=8;i>=0;i--){
                numero [i] = Character.getNumericValue(cpfnro.charAt(i)); //converter para int
                System.out.println("Nº cpf: " + numero[i]);
            }
        //atribuir valor ao peso   
            for (i=8;i>=0;i--){
                peso[i] = j;
                j++;
                System.out.println("peso: " + peso[i]);
            }
        //multiplicar peso*numero
            for (i=8;i>=0;i--) {
                resul[i]= numero[i] * peso[i];
                System.out.println("P*N: " + resul[i]);
            }
        //somar os elementos de resul[i]   
            for (i=0;i<9; i++) { 
                soma+=resul[i];
            }
        System.out.println("soma: " + soma);
        restodivisao = soma%11;
        //primeiro verificador
        System.out.println("Resto divisao: " + restodivisao);
        if(restodivisao<2){
            i=10;
            numero[i]=0;
        }
        else
            numero[i]= 11-restodivisao;
        System.out.println("1º verificador: " + numero[i]);
    }
}
