import java.util.Scanner;

public class Accounting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int taxRate = Integer.MIN_VALUE;
		int roadTax = Integer.MIN_VALUE;
		int firmLegalEntityRevenue = Integer.MIN_VALUE;
		int firmJSCRevenue = Integer.MIN_VALUE;
		
		while(taxRate < 0 || taxRate > 100) {
			System.out.println("Enter taxRate value:");
			taxRate = sc.nextInt();
		}
		while(roadTax < 0 || roadTax > 100) {
			System.out.println("Enter roadTax value:");
			roadTax = sc.nextInt();
		}
		while(firmLegalEntityRevenue < 0) {
			System.out.println("Enter LegalEntity revenue:");
			firmLegalEntityRevenue = sc.nextInt();
		}
		while(firmJSCRevenue < 0) {
			System.out.println("Enter JSC revenue:");
			firmJSCRevenue = sc.nextInt();
		}
		sc.close();
		
		Accounting accounting = new Accounting();
		LegalEntity legalentity = new LegalEntity(taxRate);
		JSC jsc = new  JSC(taxRate, roadTax);
		legalentity.setRevenue(firmLegalEntityRevenue);
		jsc.setRevenue(firmJSCRevenue);
		accounting.firmLegalEntityBalance(legalentity);
		accounting.firmJSCBalance(jsc);
	}
	
	public  void firmLegalEntityBalance(LegalEntity legalentity) {
		System.out.println("LegalEntity yearRevenue amount: " + legalentity.getYearRevenue());
		System.out.println("LegalEntity YearTax amount: " + legalentity.calcYearTaxValue());
		System.out.println("LegalEntity ClearYearRevenue amount: " + legalentity.calcClearYearRevenue());
	}
	
	public  void firmJSCBalance(JSC jsc) {
		System.out.println("JSC yearRevenue amount: " + jsc.getYearRevenue());
		System.out.println("JSC YearTax amount: " + jsc.calcYearTaxValue());
		System.out.println("JSC ClearYearRevenue amount: " + jsc.calcClearYearRevenue());
	}
}
