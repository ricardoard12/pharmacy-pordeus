package br.ufc.si.farmacia.model;

public class Unidade {
	private int id;
	private String nome;
	private String nome_responsavel;

	public Unidade() {
			super();
		}
		
	public Unidade(int id, String nome, String nome_responsavel) {
		super();
		this.id = id;
		this.nome = nome;
		this.nome_responsavel = nome_responsavel;
	}

	// método get e set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome_responsavel() {
		return nome_responsavel;
	}

	public void setNome_responsavel(String nome_responsavel) {
		this.nome_responsavel = nome_responsavel;
	}
	

	//esse comentário é um teste
   
}// fim da classe unidade
