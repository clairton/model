package br.eti.clairton.model;

import javax.persistence.Cacheable;
import javax.persistence.MappedSuperclass;

/**
 * @deprecated use Base
 */
@Cacheable
@MappedSuperclass
public abstract class Model extends Base {
	private static final long serialVersionUID = 1L;
}
