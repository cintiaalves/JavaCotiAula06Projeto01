package interfaces;

import entities.Aluno;

public interface IAlunoRepository {
	
	public static final String PATH = "c:\\temp\\";
	
	void exportarDados(Aluno aluno) throws Exception;
		
	

}
