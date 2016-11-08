package br.eti.clairton.model;

import java.sql.Connection;

import javax.inject.Inject;
import javax.naming.InitialContext;
import javax.persistence.EntityManager;
import javax.transaction.TransactionManager;

import org.apache.deltaspike.testcontrol.api.junit.CdiTestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(CdiTestRunner.class)
public class AplicacaoIntegrationTest {
	private @Inject EntityManager entityManager;
	private @Inject Connection connection;
	private final Aplicacao aplicacao = new Aplicacao("Teste");
	private final String jndi = "java:/jboss/TransactionManager";

	@Before
	public void init() throws Exception {
		final InitialContext context = new InitialContext();
		final TransactionManager tm = (TransactionManager) context.lookup(jndi);
		tm.begin();
		final String sql = "DELETE FROM aplicacoes;";
		connection.createStatement().execute(sql);
		entityManager.persist(aplicacao);
		entityManager.joinTransaction();
		entityManager.flush();
		entityManager.clear();
		tm.commit();
	}

	@Test
	public void testRetrieve() throws Exception {
		entityManager.find(Aplicacao.class, aplicacao.getId());
	}
}
