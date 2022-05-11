package taxpayer.construction;

import java.util.ArrayList;
import java.util.List;

import landowner.business.Rectangle;
import landowner.business.Square;
import landowner.business.Triangle;
import taxpayer.business.TaxPayer;
import taxpayer.business.TaxPayerRole;
import taxpayer.business.Village;

public class Application {

	private TaxPayerBuilder taxPayerBuilder;
	private Village village;
	public Application() {
		taxPayerBuilder = new TaxPayerBuilder();
		List<TaxPayerRole> taxPayers = new ArrayList<TaxPayerRole>();
		village = new Village(taxPayers);
		
	}

	public static void main(String[] args) {
		Application application = new Application();
		application.launch();

	}

	private void launch() {

		TaxPayer payer = taxPayerBuilder.buildProgressiveTaxed(23);
		village.add(payer);
		Square square = new Square(20);
		payer.add(square);
		System.out.println(payer.computeTax());
		Rectangle rectangle = new Rectangle(40,50);
		payer.add(rectangle);
		System.out.println(payer.computeTax());
		Triangle triangle = new Triangle(1, 2, 2);
		payer.add(triangle);
		System.out.println(payer.computeTax());
	}
}
