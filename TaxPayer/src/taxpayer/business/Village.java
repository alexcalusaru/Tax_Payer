package taxpayer.business;

import java.util.List;

public class Village {

	private List<TaxPayerRole> payers;

	public Village(List<TaxPayerRole> payers) {
		super();
		this.payers = payers;
	}

	public boolean add(TaxPayerRole e) {
		return payers.add(e);
	}

	public boolean remove(TaxPayerRole payer) {
		return payers.remove(payer);
	}

	public TaxPayerRole searchId(int Id) {
		for (TaxPayerRole payer : payers) {
			if (payer.hasId(Id))
				return payer;

		}
		return null;
	}
}
