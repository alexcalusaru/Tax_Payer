package taxpayer.construction;

import java.util.ArrayList;
import java.util.List;

import landowner.business.Land;
import landowner.business.Landowner;
import landowner.business.OwnerRole;
import taxpayer.business.Interval;
import taxpayer.business.SimpleInterval;
import taxpayer.business.TaxCalculator;
import taxpayer.business.TaxCalculatorRole;
import taxpayer.business.TaxPayer;

public class TaxPayerBuilder {

	public TaxPayer buildProgressiveTaxed(int id) {

		
		List<Interval> intervals = new ArrayList<Interval>();
		SimpleInterval simpleInterval = new SimpleInterval(0,1000,1);
		intervals.add(simpleInterval);
		simpleInterval = new SimpleInterval(1001, 2000, 2);
		intervals.add(simpleInterval);
		simpleInterval = new SimpleInterval(2001,3000,5);
		intervals.add(simpleInterval);
		simpleInterval = new SimpleInterval(3001,Integer.MAX_VALUE,5);
		intervals.add(simpleInterval);
		TaxCalculatorRole taxCalculator = new TaxCalculator(intervals);
		List<Land> lands = new ArrayList<Land>();
		OwnerRole owner = new Landowner(lands);
		TaxPayer taxPayer = new TaxPayer(owner, taxCalculator, id);
		return taxPayer;
		
		
	}
}
