package taxpayer.business;

import java.util.List;

public class TaxCalculator implements TaxCalculatorRole {

	private List<Interval> intervals;

	public TaxCalculator(List<Interval> intervals) {
		super();
		this.intervals = intervals;
	}

	@Override
	public int computeTax(float area) {

		int tax = 0;
		for (Interval interval : intervals) {
			if (interval.contains(area)) {
				tax += interval.computeTax(area);
			}
			if (interval.lowerThan(area)) {
				tax += interval.computeFullTax();
			}

		}
		return tax;
	}

}
