package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator;
	
	@Before
	public void setup() {
		calculator = new Calculator();
	}
	
	@Test
	public void addTest() {
		assertEquals(4, calculator.add(2,2));
	}
	
	@Test
	public void subTest() {
		assertEquals(2, calculator.subtract(4, 2));
	}
	
	@Test
	public void multiplyTest() {
		assertEquals(4, calculator.multiply(2, 2));
	}
	
	@Test
	public void divTest() {
		assertEquals(2, calculator.divide(4, 2));
	}
	
	@Test
	public void equalsTest1() {
		assertTrue(calculator.isEqual(1, 1));
	}
	
	@Test
	public void equalsTest2() {
		assertFalse(calculator.isEqual(1, 0));
	}
}
