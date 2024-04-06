package programa_aluno_aprovado;

import java.util.Locale;
import java.util.Scanner;

public class MainAppAlunoAprovado {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		AlunoPassFailed aluno;
		aluno = new AlunoPassFailed();
		
		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f\n", aluno.somaNotas());
		aluno.aprovacao();
	
		sc.close();

	}

}
