package taxpayer.business;

import landowner.business.Land;
import landowner.business.OwnerRole;

public class TaxPayer implements TaxPayerRole {

	private OwnerRole owner;
	private TaxCalculatorRole taxCalculator;
	private int Id;

	public TaxPayer(OwnerRole owner, TaxCalculatorRole taxCalculator, int id) {
		super();
		this.owner = owner;
		this.taxCalculator = taxCalculator;
		Id = id;
	}

	@Override
	public int computeTax() {
		float area = owner.computeTotalArea();
		int tax = taxCalculator.computeTax(area);
		return tax;
	}

	@Override
	public void add(Land land) {
		owner.add(land);
	}

	@Override
	public void remove(Land land) {
		owner.remove(land);
	}

	public boolean hasId(int Id) {
		return this.Id == Id;
	}
}
