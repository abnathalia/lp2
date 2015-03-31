import java.util.Scanner;

public class Cpf {
       
    public static void main(String[] args) {
       int j=2;
       int restodivisao;
       int soma=0;
       int i;
       int peso [] = new int[11];
       int numero [] = new int [11];
       int resul [] = new int [11];
       
       //Ler CPF
       Scanner input = new Scanner(System.in);
       System.out.println ("Digite os nove primeiros digitos de seu CPF: ");
       String cpfnro = input.next(); 
            for (i=8;i>=0;i--){
                numero [i] = Character.getNumericValue(cpfnro.charAt(i)); //converter para int
            }
        //primeiro verificador
        //atribuir valor ao peso   
            for (i=8;i>=0;i--){
                peso[i] = j;
                j++;
            }
        //multiplicar peso*numero
            for (i=8;i>=0;i--) {
                resul[i]= numero[i] * peso[i];
            }
        //somar os elementos de resul[i]   
            for (i=0;i<9; i++) { 
                soma+=resul[i];
            }
        restodivisao = soma%11;
        if(restodivisao<2){
            i=9;
            numero[i]=0;
            System.out.println("1º verificador: " + numero[i]);
        }
        else{
            numero[i]= 11-restodivisao;
            System.out.println("1º verificador: " + numero[i]);
        }
        

        //segundo verificador
        //atribuir valor ao peso   
            j=2;
            for (i=9;i>=0;i--){
                peso[i] = j;
                j++;
            }
        //multiplicar peso*numero
            for (i=9;i>=0;i--) {
                resul[i]= numero[i] * peso[i];
            }
            soma=0;
        //somar os elementos de resul[i]   
            for (i=0;i<10; i++) { 
                soma+=resul[i];
            }
        restodivisao = soma%11;
        if(restodivisao<2){
            i=10;
            numero[i]=0;
            System.out.println("2º verificador: " + numero[i]);
        }
        else{
            numero[i]= 11-restodivisao;
            System.out.println("2º verificador: " + numero[i]);
        }
        System.out.println("CPF: ");
        for(i=0;i<11;i++){
            System.out.println("" + numero[i]);
        }
        
    }
}  

