package by.bsu.fund.bean;

public class Coin {
	private double diameter; // правильна€ инкапсул€ци€
	private double weight; // правильна€ инкапсул€ци€

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double value) {
		if (value > 0) {
			diameter = value;
		} else {
			System.out.println("Oтрицательный диаметр!");
		}
	}

	public double getWeight() { // правильное им€ метода
		return weight;
	}

	public void setWeight(double value) {
		weight = value;
	}
}