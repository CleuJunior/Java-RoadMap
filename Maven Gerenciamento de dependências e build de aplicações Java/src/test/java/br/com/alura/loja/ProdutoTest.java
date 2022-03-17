package br.com.alura.loja;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class ProdutoTest {

	@Test
	public void test() {
		Produto produto = new Produto("Produto novo", BigDecimal.TEN);
		Assert.assertEquals("Produto novo", produto.getNome());
		Assert.assertEquals(BigDecimal.TEN, produto.getPreco());

	}

}
