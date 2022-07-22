import java.util.Scanner;

public class CH05_MySpeciesFifthTry {
	private String name;
	private int population;
	private double growthRate;
	
	public static void main(String [] args) {
		CH05_MySpeciesFifthTry speciesOfTheMonth  = new CH05_MySpeciesFifthTry();
		
		System.out.println("Enter number of years to project: ");
		Scanner s = new Scanner (System.in);
		int numberOfYears = s.nextInt();
		
		System.out.println("Enter data on the Species of the Month:");
		speciesOfTheMonth.readInput();
		speciesOfTheMonth.writeOutput();
		int futurePopulation = speciesOfTheMonth.predictPopulation(numberOfYears);
		System.out.println("In "+ numberOfYears+" years the population will be "+futurePopulation);
		speciesOfTheMonth.setName("Klingon ox");
		speciesOfTheMonth.setPopulation(10);
		speciesOfTheMonth.setGrowthRate(15.0);
		
		System.out.println("The new Species of the Month: ");
		speciesOfTheMonth.writeOutput();
		
		futurePopulation = speciesOfTheMonth.predictPopulation(numberOfYears);
		System.out.println("In "+numberOfYears +" years the population will be "+futurePopulation);
		
		
	}
	public void readInput() {
		Scanner s = new Scanner (System.in);
		System.out.println("What is the species' name?");
		name = s.nextLine();
		System.out.println("What is the population of the species?");
		population = s.nextInt();
		System.out.println("Enter growth rate (% increase per year):");
		growthRate = s.nextDouble();
		
	}
	public void writeOutput() {
		System.out.println("Name = " + name); 
		System.out.println("Population = " + population); 
		System.out.println("Growth rate = " + growthRate + "%");
	}
	public int predictPopulation(int years) {
		int result = 0; 
		double populationAmount = population;
		int count = years;
		while ((count > 0) && (populationAmount > 0))
		{
			populationAmount = (populationAmount + (growthRate / 100) * populationAmount); count--;
		}
		if (populationAmount > 0)
			result = (int)populationAmount;
		return result;
	}
	public void setSpecies(String a, int b, double c ){
		this.name = a;
		this.population = b;
		this.growthRate = c;
	}
	public String getName(){
		return name;
	}
	public int getPopulation() {
		return population;
	}
	public double getGrowthRate() {
		return growthRate;
	}
	public void setName(String a) {
		this.name = a;
	}
	public void setPopulation(int a) {
		this.population = a;
	}
	public void setGrowthRate(double a) {
		this.growthRate = a;
	}
}
