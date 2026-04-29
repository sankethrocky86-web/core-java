class WatchExecutor{
public static void main(String[] args){
	int battery= Watch.getbatteries();
	String language=Watch.getLanguage();
	String productDimension=Watch.getProductDimension();
	String firstAvailable=Watch.getDataFirstAvailable();
	String asin=Watch.getASIN();
	String itemModel=Watch.getItemModelNumber();
	String countryOfOrigin=Watch.getCountryOfOrigin();
	String department=Watch.getDepartment();
	String importer=Watch.getImporter();
	String itemWeight=Watch.getItemWeights();
	String itemDimension=Watch.getItemDimension();
	String netQuality=Watch.getNetQuality();
	String genericName=Watch.getGenericName();
	String customerReview=Watch.getCustomerReview();
	
	System.out.println("Battery Information:" +battery);
	System.out.println("Language to show:" +language);
	System.out.println("Availability details:" +firstAvailable);
	System.out.println("ASIN Id information:" +asin);
	System.out.println("Item Model details:" +itemModel);
	System.out.println("Country of origin:" +countryOfOrigin);
	System.out.println("Department details:" +department);
	System.out.println("Importer informations:" +importer);
	System.out.println("Item quantity information:" +itemDimension);
	System.out.println("Net quality details:" +netQuality);
	System.out.println("The generic name of product:" +genericName);
	System.out.println("The customer review of product is:" +customerReview);
	}
}