package ddd_project.model.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public abstract class Entidade {

	/**
	 * Indentificador unico da entidade.
	 * 
	 * a estratégia de geração autómatica de ids facilita a persistencia na base
	 * de dados.
	 */
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	/**
	 * Construtor padrão para criação de novas entidades.
	 */
	public Entidade() {

	}

	/**
	 * 
	 * @param idP
	 *            - Id passado de parâmeto, útil para atualização de entidades
	 *            na base de dados.
	 */
	public Entidade(final Long idP) {
		id = idP;
	}

	/**
	 * Recupera identificador da entidade.
	 * 
	 * @return Identificador único da entidade.
	 */
	public Long getId() {
		return id;
	}
	
	@Override
	public final boolean equals(final Object outro) {
		if (this == outro) {
			return true;
		}
		
		if (outro == null || getClass() != outro.getClass()) {
			return false;
		}
		Entidade entidade = (Entidade) outro;
		
		return id.equals(entidade.id);
	}
	
	@Override
	public final int hashCode() {
		return id.hashCode();
	}
}