package taxpayer.business;

public interface Interval {

	boolean contains(float area);

	int computeTax(float area);

	boolean lowerThan(float area);

	int computeFullTax();

}
