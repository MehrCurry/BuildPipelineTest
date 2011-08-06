package de.gzockoll.test.buildpipeline;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.core.Is.*;

public class KontoTest {

	@Test
	public void test() {
		Konto k = new Konto();
		assertThat(k.getSaldo(),is(0));
	}

}
