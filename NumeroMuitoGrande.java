package numeromuitogrande;
import  java.math.BigInteger;
import java.util.Scanner;

public class NumeroMuitoGrande {

    public static void main(String[] args) {
    int i;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número muito grande com 30 digitos no máximo: ");
        String num1 = input.next();
        BigInteger bigint1 = new BigInteger(num1);
        System.out.println("Digite outro número muito grande com 30 digitos no máximo: ");
        String num2 = input.next();
        BigInteger bigint2 = new BigInteger(num2); 
        BigInteger soma= bigint1.add(bigint2);
        System.out.println ("Soma: " + soma);
        BigInteger mult= bigint1.multiply(bigint2);
        System.out.println ("Multiplicação: " + mult);
    }
}
