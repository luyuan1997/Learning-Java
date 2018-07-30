package easytest;

import org.junit.Test;

import easy.PrimeNumber;


public class TestPrimeNumber {
	@Test
	public void test() {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.IsPrimeNumber(4549);
		primeNumber.IsPrimeNumber(8461);
		primeNumber.IsPrimeNumber(641);
		primeNumber.IsPrimeNumber(313);
	}
}
