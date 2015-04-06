package nummuitogrande;
import java.util.Scanner;

public class NumMuitoGrande {
    public int[] v1 = new int[30];
    public int[] v2 = new int[30];
    public int[] soma = new int[30];
    public int[] mult= new int[30];
    String num1, num2;
        
    public void LerNumero() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num1 = input.next();
        System.out.println("Digite outro número: ");
        num2 = input.next();

    }
    
     public void ConverterNumero(){
        int n1, n2, i, j;
        n1 = num1.length();
        n2 = num2.length();
        for (i=n1,j=0;i>0;i--,j++){
            char caracter=num1.charAt(j);
            v1[30-i]= Character.getNumericValue(caracter);
        }        
        for (i=n2,j=0;i>0;i--,j++){
            char caracter2=num2.charAt(j);
            v2[30-i]= Character.getNumericValue(caracter2);
        }
    }
     
    public void SomarNumero() {
        int vai= 0, flagra=0;

           for (int i=29; i>=0 ;i--){
            soma[i]= ((v1[i]+v2[i]+vai)%10);
            vai=((v1[i]=v2[i]+vai)/10);
           }
        System.out.print ("Resultado da soma: ");
        for (int i = 0; i <= 29; i++) {
            if (soma[i]==0 && flagra==0 ) {
                if (soma[i+1] != 0)
                    flagra=1;
            }
            else 
                System.out.print(soma[i]);
        }
    }
    
    public static void main(String[] args) {
        NumMuitoGrande big = new NumMuitoGrande();
        big.LerNumero();
        big.ConverterNumero();
        big.SomarNumero();
    }
    
}
