package myPackage;

public class StandardDeviation{



	public static int calculateFrequencyOf(int [] numbers ){
			return numbers.length;
	}

	public static int calculateTotalOf(int[] numbers){

		int sum = 0;

		int lengthOfArray = calculateFrequencyOf(numbers);
		
		for(int index = 0; index < lengthOfArray; index++){
			sum += numbers[index];
		}

		return sum;			
	}

	public static double calculateMeanOf(int[] numbers){
		return (double) calculateTotalOf(numbers)/ calculateFrequencyOf(numbers) ;			
	}


	public static double [] calculateDeviation(int[] numbers){

		double [] deviations = new double [calculateFrequencyOf(numbers)];
		double mean = calculateMeanOf(numbers);
		double deviation;

		for (int index = 0; index < deviations.length; index++){
			deviation = numbers[index] - mean;
			deviations[index] = deviation;
		}
		return deviations ;			
	}

	public static double [] calculateDeviationSquares(int[] numbers){

		double [] deviations = calculateDeviation(numbers);
		
		for (int index = 0; index < deviations.length; index++){
			deviations[index] = deviations[index] * deviations[index];
		}
		
		return deviations ;			
	}

	public static double calculateSumOfDeviationSquaresOf(int[] numbers){

		double [] deviations = calculateDeviationSquares(numbers);
	
		double sum = 0;

		for(double deviation : deviations)
			sum +=deviation;

		return sum;		
	}

	public static double calculateVarianceOf(int [] numbers){

		return calculateSumOfDeviationSquaresOf(numbers) / calculateFrequencyOf(numbers) ;

	}

	public static double calculateStandardDeviationOf(int [] numbers){

		return Math.sqrt(calculateVarianceOf(numbers));
	}





}