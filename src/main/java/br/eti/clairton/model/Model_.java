package br.eti.clairton.model;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Model.class)
public abstract class Model_ {

	public static volatile SingularAttribute<Model, Long> id;

}
