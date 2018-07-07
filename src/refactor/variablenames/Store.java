package refactor.variablenames;

import java.util.ArrayList;

public class Store 
{
	public ArrayList<Product> theProducts = new ArrayList<Product>();
	
	public void addAProduct(Product newProduct)
	{
		theProducts.add(newProduct);
	}
	
	public void getCostOfProducts()
	{
		for(Product product : theProducts)
		{
			// You can also use an explaining variable for complicated calculations
			// It may however be better to extract this code into a method though
			// to separate it from the method
			// final is used to make sure the temp only has 1 value per iteration
			// It is bad practice to assign different values to a temp
			final int numOfProducts = product.getQuantity();  
			final String prodName = product.getName();
			final double cost = product.getTotalCost();
			
			final double costWithDiscount = product.getTotalCost() / product.getQuantity();
			final double costWithoutDiscount = product.getPrice() + product.getShippingCost();
			
			System.out.println("Total cost for " + numOfProducts + " " + prodName + "s is $" + cost);
			System.out.println("Cost per product " + costWithDiscount);
			System.out.println("Savings per product " + (costWithoutDiscount - costWithDiscount));
			System.out.println();
		}
	}
}