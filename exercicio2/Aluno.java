public class Aluno{
    String nome;
    int idade;
    String numeroMatricula;


    public void imprimirDadosCadastrais() {
		System.out.println ("Nome: " + this.nome);
    	System.out.println ("Idade: " + this.idade);
    	System.out.println ("Número Matrícula: " + this.numeroMatricula);
	}  
    public static void main(String [] args){
    

    Aluno estudante1 = new Aluno();
    Aluno estudante2 = new Aluno();
    Aluno estudante3 = new Aluno();
    Aluno estudante4 = new Aluno();

    estudante1.nome = "Helder";
    estudante1.idade = 17;
    estudante1.numeroMatricula = "201318110149";
    estudante1.imprimirDadosCadastrais ();

	System.out.println ("");
   
    estudante2.nome = "Amanda";
    estudante2.idade = 17;
    estudante2.numeroMatricula = "201318110025";
    estudante2.imprimirDadosCadastrais ();
 
    System.out.println ("");

    estudante3.nome = "Nath";
    estudante3.idade = 17;
    estudante3.numeroMatricula = "201318110211";
    estudante3.imprimirDadosCadastrais ();

    System.out.println ("");

    estudante4.nome = "Brenda";
    estudante4.idade = 17;
    estudante4.numeroMatricula = "201318110041";
    estudante4.imprimirDadosCadastrais ();
    
    
 }   
 }
