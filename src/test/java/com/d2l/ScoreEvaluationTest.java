package com.d2l;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ScoreEvaluationTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals("Add Value Correct", 1, 1);
	}
	
	@Test
	public void testAddScore() {
		Score a = new Score();
		assertEquals("Add Value Correct", a.addScore(1, 2), 3);
	}

}
