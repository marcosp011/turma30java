package programas;

public class CadNovoAluno {

	public static void main(String[] args) {
		
		//instanciar um aluno = criar 1 aluno no código.
		
		Aluno exemplo1 = new Aluno ();
		Aluno exemplo2 = new Aluno();
		exemplo1.nome = "epaminondas";
		exemplo1.matricula = "MAT-1";
		exemplo1.nota = 5;
		exemplo1.anoNascimento=2005;
		
		
		exemplo2.nome = "Maria";
		exemplo2.matricula= "MAT-2";
		exemplo2.nota = 10;
		exemplo2.anoNascimento= 1978;
		
		exemplo1.mostraIdade();
		exemplo2.mostraIdade();//2021
		exemplo2.mostraIdade(2050, 0);
		exemplo2.mostraIdade(2021, 1960);
		
	
		
	}
		
			

	}


