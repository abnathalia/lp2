public class Calculadora{

	int var1;
	int var2;
    float divisao;
    int soma;
	int subtracao;
	int multiplicacao;
	
	public void soma(){
	
	soma = (var1 + var2);	

	System.out.println("A soma é " + this.soma);
	
	}
	
	public void subtracao(){
	
	subtracao = (var1 - var2);	

	System.out.println("A subtração é " + this.subtracao);
	
	}
	
	public void multiplicacao(){
	
	multiplicacao = (var1 * var2);	

	System.out.println("A multiplicação é " + this.multiplicacao);
	
	}
	
	public void divisao(){
	
	divisao = (var1 / var2);	

	System.out.println("A divisão é " + this.divisao);
	
	}
	
	public static void main (String [] args){
	
	Calculadora conta1 = new Calculadora();
	Calculadora conta2 = new Calculadora();
	Calculadora conta3 = new Calculadora();


	conta1.var1 = 8;
	conta1.var2 = 5;
	conta1.soma();
	conta1.subtracao();
	conta1.multiplicacao();
	conta1.divisao();

	conta2.var1 = 12;
	conta2.var2 = 2;
	conta2.soma();
	conta2.subtracao();
	conta2.multiplicacao();
	conta2.divisao();

	conta3.var1 = 32;
	conta3.var2 = 25;
	conta3.soma();
	conta3.subtracao();
	conta3.multiplicacao();
	conta3.divisao();


	}

}
