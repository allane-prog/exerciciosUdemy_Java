package programa_aluno_aprovado;

public class AlunoPassFailed {
	
	public String nome;
	public double nota1, nota2, nota3;
	
	
	public double somaNotas() {
		double finalGrade = nota1+nota2+nota3;
		return finalGrade;
	}
	public double aprovacao() {
		double soma = nota1+nota2+nota3;
		if (soma >= 60) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			double x = 60 - soma;
			System.out.printf("MISSING %.2f", x);
			System.out.println(" POINTS");
		}
		return soma;
	}
	
}
