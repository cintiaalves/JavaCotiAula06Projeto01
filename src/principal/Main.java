package principal;

import java.util.Scanner;

import entities.Aluno;
import enums.EstadoCivil;
import enums.Sexo;
import interfaces.IAlunoRepository;
import repositories.AlunoRepositoryJSON;
import repositories.AlunoRepositoryXML;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			Aluno aluno = new Aluno(1, "Cintia", "2021-001", Sexo.Femino, EstadoCivil.Casado);
			
			System.out.println("Informe o tipo de arquivo: (1)XML ou (2)JSON: ");
			Integer opcao = Integer.parseInt(new Scanner(System.in).nextLine());
			
			IAlunoRepository alunoRepository = null;
			
			switch (opcao) {
			
			case 1:
				alunoRepository = new AlunoRepositoryXML();
				break;
			
			case 2:
				alunoRepository = new AlunoRepositoryJSON();
				break;
			
			default:
				throw new Exception("Opção inválida!");
			}
			
			alunoRepository.exportarDados(aluno);
			
			System.out.println("\nDados gravados com sucesso!");
		}
		
		catch(Exception e) {
			System.out.println("\nErro: " + e.getMessage());
		}

	}

}
