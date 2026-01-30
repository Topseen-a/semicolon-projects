package myPackage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StandardDeviationTest{

	@Test
	public void uselessTestThatArrayExists(){
		
			//Given
			int [] numbers = {1, 2, 3, 4, 5};
			assertNotNull(numbers);

	}


	@Test
	public void testThatLengthCanBeGotten(){

		int [] numbers = {1, 2, 3, 4, 5};

		int expectedLength = StandardDeviation.calculateFrequencyOf(numbers);
		int actualLength = 5;

		assertEquals(expectedLength, actualLength);

	} 


	@Test
	public void testThatSumOfNumbersIsCalculated(){

		int [] numbers = {1, 2, 3, 4, 5};

		int expectedSum = StandardDeviation.calculateTotalOf(numbers);
		int actualSum = 15;

		assertEquals(expectedSum, actualSum);

	} 


	@Test
	public void testThatMeanOfNumbersIsCalculated(){

		int [] numbers = {1, 2, 3, 4, 5, 6};

		double expectedMean = StandardDeviation.calculateMeanOf(numbers);
		double actualMean = 3.5;

		assertEquals(expectedMean, actualMean);

	} 

	@Test
	public void testThatDeviationOfNumbersFromMeanIsCalculated(){

		int [] numbers = {1, 2, 3, 4, 5, 6};

		double [] expectedDeviations = StandardDeviation.calculateDeviation(numbers);
		double [] actualDeviations = {-2.5, -1.5, -0.5, 0.5, 1.5, 2.5};

		assertArrayEquals(expectedDeviations, actualDeviations);

	} 


	@Test
	public void testThatDeviationSquaresIsCalculated(){

		int [] numbers = {1, 2, 3, 4, 5, 6};

		double [] expectedDeviationSquares = StandardDeviation.calculateDeviationSquares(numbers);
		double [] actualDeviationSquares = {6.25, 2.25, 0.25, 0.25, 2.25, 6.25};

		assertArrayEquals(expectedDeviationSquares, actualDeviationSquares);

	} 

	@Test
	public void testThatSumOfDeviationSquaresIsCalculated(){

		int [] numbers = {1, 2, 3, 4, 5, 6};

		double  expectedSumOfDeviationSquares = StandardDeviation.calculateSumOfDeviationSquaresOf(numbers);
		double actualSumOfDeviationSquares = 17.5;

		assertEquals(expectedSumOfDeviationSquares, actualSumOfDeviationSquares);

	} 


	@Test
	public void testThatVarianceIsCalculated(){

		int [] numbers = {1, 2, 3, 4, 5};

		double  expectedVariance = StandardDeviation.calculateVarianceOf(numbers);
		double actualVariance = 2.0;

		assertEquals(expectedVariance, actualVariance);

	} 

	@Test
	public void testThatStandardDeviationIsCalculated(){

		int [] numbers = {1, 2, 3, 4, 5};

		double expectedStandardDeviation = StandardDeviation.calculateStandardDeviationOf(numbers);
		double actualStandardDeviation = 1.4142135623730951;

		assertEquals(expectedStandardDeviation, actualStandardDeviation);
		
	}






















































}








