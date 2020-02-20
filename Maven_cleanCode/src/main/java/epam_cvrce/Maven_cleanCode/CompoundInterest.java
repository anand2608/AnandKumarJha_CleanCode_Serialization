package epam_cvrce.Maven_cleanCode;

public class CompoundInterest implements SimpCompInt {

	int principle;
	double rate,time;
	
	public CompoundInterest(int principle, double rate, double time) {
		super();
		this.principle = principle;
		this.rate = rate;
		this.time = time;
	}
	
	public double calculateInterest() {
		double compoundinterest=principle*(Math.pow(1+(rate/100), time));
		return compoundinterest;
	}


}
