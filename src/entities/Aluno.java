package entities;

import enums.EstadoCivil;
import enums.Sexo;

public class Aluno {
	
	private Integer idAluno;
	private String nome;
	private String matricula;
	private Sexo sexo;
	private EstadoCivil estadoCivil;
	
	
	
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Aluno(Integer idAluno, String nome, String matricula, Sexo sexo, EstadoCivil estadoCivil) {
		super();
		this.idAluno = idAluno;
		this.nome = nome;
		this.matricula = matricula;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
	}


	
	

	public Integer getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Sexo getSexo() {
		return sexo;
	}


	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}


	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}


	public void setEstadocivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}


	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Aluno -> idAluno: " + this.idAluno + ", nome: " + this.nome + ", matrícula: " + this.matricula + "sexo: " + this.sexo + ", estado civil: " + this.estadoCivil; 
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Aluno) {
			Aluno aluno = (Aluno) obj;
			return this.idAluno.equals(aluno.getIdAluno());
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.idAluno.hashCode();
	}
	
	
	
	
	
}
