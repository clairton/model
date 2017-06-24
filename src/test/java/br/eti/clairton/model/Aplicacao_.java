package br.eti.clairton.model;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Aplicacao.class)
public abstract class Aplicacao_ extends Base_ {

	public static volatile SingularAttribute<Aplicacao, String> nome;

}
