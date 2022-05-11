package taxpayer.business;

public class SimpleInterval implements Interval {

	private int lower;
	private int upper;
	private int taxPerMeter;
	public SimpleInterval(int lower, int upper, int taxPerMeter) {
		super();
		this.lower = lower;
		this.upper = upper;
		this.taxPerMeter = taxPerMeter;
	}


	@Override
	public boolean contains(float area) {
		if ((lower <= area) && (area <= upper))
			return true;
		else
			return false;
	}

	@Override
	public int computeTax(float area) {

		return (int) ((area - lower) * taxPerMeter);
	}

	@Override
	public boolean lowerThan(float area) {

		return upper < area; // interval deschis la limita superioara
	}

	@Override
	public int computeFullTax() {
		return (upper - lower) * taxPerMeter;
	}

}
