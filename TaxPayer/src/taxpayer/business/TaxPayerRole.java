package taxpayer.business;

import landowner.business.Land;

public interface TaxPayerRole {

	int computeTax();

	void add(Land land);

	void remove(Land land);

	boolean hasId(int id);

}