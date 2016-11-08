package br.eti.clairton.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.eti.clairton.identificator.Identificator;

/**
 * Representa uma Aplicação.
 * 
 * @author Clairton Rodrigo Heinzen<clairton.rodrigo@gmail.com>
 */
@Entity
@Table(name = "aplicacoes")
public class Aplicacao extends Model {
	private static final long serialVersionUID = 1L;

	@Identificator
	private String nome;
	
	@Deprecated
	public Aplicacao() {
		this(null);
	}

	public Aplicacao(String nome) {
		super();
		this.nome = nome;
	}
}
