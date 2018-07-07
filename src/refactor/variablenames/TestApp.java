package refactor.variablenames;

public class TestApp 
{
	public static void main(String[] args)
	{
		Store cornerStore = new Store();
		
		cornerStore.addAProduct(new Product("Pizza", 10.00, 1.00, 52));
		cornerStore.addAProduct(new Product("Pizza", 10.00, 1.00, 26));
		cornerStore.addAProduct(new Product("Pizza", 10.00, 1.00, 10));
		cornerStore.getCostOfProducts();
	}
}