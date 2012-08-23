package br.ufc.si.farmacia.model;

public class Paciente {
	private int id;
	private String nome;
	private Long rg;
	private String numero_cartao_sus;

	// métodos get e set
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

	public Long getRg() {
		return rg;
	}

	public void setRg(Long rg) {
		this.rg = rg;
	}

	public String getNumero_cartao_sus() {
		return numero_cartao_sus;
	}

	public void setNumero_cartao_sus(String numero_cartao_sus) {
		this.numero_cartao_sus = numero_cartao_sus;
	}

	// construtor
	public Paciente() {

	}// fim do construtor

	public Paciente(String nome, Long rg, String numero_cartao_sus) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.numero_cartao_sus = numero_cartao_sus;
	}
	
	

}// fim da classe paciente
