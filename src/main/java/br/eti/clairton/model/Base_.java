package br.eti.clairton.model;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Base.class)
public abstract class Base_ {

	public static volatile SingularAttribute<Base, Long> id;

}
