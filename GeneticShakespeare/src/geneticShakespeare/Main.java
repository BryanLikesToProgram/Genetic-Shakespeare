package geneticShakespeare;

import java.util.ArrayList;

public class Main {
	private static String testCase ="TO BE OR NOT TO BE";
	
	public static void main(String[] args) {
		ArrayList<String> runningPopulation = new ArrayList<String>();
		int populationCount = 200;
		
		String[] populationArray = new String[populationCount];
		populationArray = Population.firstPopulation(populationCount, getTestCase().length()).clone();
		
		/*
		for (int i = 1; i > 0; i++){
			for(String unit: runningPopulation){
				if (unit == testCase){
					System.out.println("Found The Answer!!!");
					System.exit(0);
				}
				System.out.println(unit);
			}
			runningPopulation = CreateUnit.Mutate(CreateUnit.genMatingPool(populationArray));
		}
		*/
	}
	
	public static String getTestCase() {
		return testCase;
	}
	public static void setTestCase(String testCase) {
		Main.testCase = testCase;
	}

}
