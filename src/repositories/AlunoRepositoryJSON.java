package repositories;

import java.io.FileWriter;
import java.util.HashMap;

import org.json.simple.JSONObject;

import entities.Aluno;
import interfaces.IAlunoRepository;

public class AlunoRepositoryJSON implements IAlunoRepository {

	@Override
	public void exportarDados(Aluno aluno) throws Exception {
		// TODO Auto-generated method stub
		
		HashMap<String, Object> mapa = new HashMap<String, Object>();
		
		mapa.put("idAluno", aluno.getIdAluno());
		mapa.put("nome", aluno.getNome());
		mapa.put("matricula", aluno.getMatricula());
		mapa.put("sexo", aluno.getSexo());
		mapa.put("estadoCivil", aluno.getEstadoCivil());
		
		JSONObject json = new JSONObject(mapa);
		
		FileWriter writer = new FileWriter(PATH + "aluno.json");
		writer.write(json.toJSONString());
		
		writer.flush();
		writer.close();
		
		
	}
	

}
