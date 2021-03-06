/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
*/

package de.gzockoll.test.buildpipeline;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.core.Is.*;

public class KontoTest {

	@Test
	public void testConstructor() {
		Konto k = new Konto();
		assertThat(k.getSaldo(),is(0));
	}
	
	@Test
	public void buche_should_work_for_positive_values() {
		Konto k = new Konto();
		assertThat(k.getSaldo(),is(0));
		k.buche(10);
		assertThat(k.getSaldo(),is(10));
	}

	@Test(expected=IllegalArgumentException.class)
	public void buche_should_throw_exception_for_negative_values() {
		Konto k = new Konto();
		assertThat(k.getSaldo(),is(0));
		k.buche(-10);
	}

}
