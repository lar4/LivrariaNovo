//package br.com.livraria.modelo;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class Autor {
//
//	@Id 
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int IdAutor;
//	
//	@Column
//	private String nome;
//	
//	@Column
//	private String sobrenome;
//	
//	@Column
//	private String biografia;
//	
//	
//	public Autor() {
//		super();
//	}
//	public Autor(int idAutor, String nome, String sobrenome, String biografia) {
//		super();
//		IdAutor = idAutor;
//		this.nome = nome;
//		this.sobrenome = sobrenome;
//		this.biografia = biografia;
//	}
//	public int getIdAutor() {
//		return IdAutor;
//	}
//	public void setIdAutor(int idAutor) {
//		IdAutor = idAutor;
//	}
//	public String getNome() {
//		return nome;
//	}
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//	public String getSobrenome() {
//		return sobrenome;
//	}
//	public void setSobrenome(String sobrenome) {
//		this.sobrenome = sobrenome;
//	}
//	public String getBiografia() {
//		return biografia;
//	}
//	public void setBiografia(String biografia) {
//		this.biografia = biografia;
//	}
//	
//	
//
//}
