package repositories;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import entities.Aluno;
import interfaces.IAlunoRepository;

public class AlunoRepositoryXML implements IAlunoRepository {

	@Override
	public void exportarDados(Aluno aluno) throws Exception {
		// TODO Auto-generated method stub
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.newDocument();
		
		Element root = document.createElement("ALUNO");
		document.appendChild(root);
		
		Element idAluno = document.createElement("IDALUNO");
		idAluno.setTextContent(aluno.getIdAluno().toString());
		root.appendChild(idAluno);
		
		Element nome = document.createElement("NOME");
		nome.setTextContent(aluno.getNome().toString());
		root.appendChild(nome);
		
		Element matricula = document.createElement("MATRICULA");
		matricula.setTextContent(aluno.getMatricula().toString());
		root.appendChild(matricula);
		
		Element sexo = document.createElement("SEXO");
		sexo.setTextContent(aluno.getSexo().toString());
		root.appendChild(sexo);
		
		Element estadoCivil = document.createElement("ESTADOCIVIL");
		estadoCivil.setTextContent(aluno.getEstadoCivil().toString());
		root.appendChild(estadoCivil);
		
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource domSource = new DOMSource(document);
		
		StreamResult stream = new StreamResult(new File(PATH + "aluno.xml"));
		transformer.transform(domSource, stream);
		
	}
	
	
	

}
