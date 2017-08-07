package com.fpp.prac2;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	/**
	 * Public method for determining value of all items in the bicycle shop.
	 * To produce an output, it calls two helper methods. You must implement
	 * the helper methods. Do not modify this method
	 */
	public static int inventoryValue(List<Bicycle> bicycles, List<Accessory> accessories) {
		//DO NOT MODIFY IN ANY WAY
		return (int)computeCurrentValue(prepareList(bicycles, accessories));
	}
	
	/** 
	 * Prepares and returns a list of all products in the store, obtained by combining
	 * the list of all bicycles and the list of all accessories (the inputs to the
	 * method), to form a list having a type common to (generalized from) the two 
	 * input types.
	 */
	private static List/*<implement>*/ prepareList(List<Bicycle> bicycles, List<Accessory> accessories) {
		/* implement */
		List<Product> listOfProduct= new ArrayList<Product>();
		for(Product p:bicycles)
		{
			listOfProduct.add(p);
		}
		for(Product p:accessories)
		{
			listOfProduct.add(p);
		}
		return listOfProduct;
	}
	
	/** Returns the sum of the prices of all items in the bicycle shop, including
	 *  bicycles and accessories
	 */
	private static double computeCurrentValue(List<Product> products) {
		/*implement */
		double sum=0;
		for(Product p:products)
		{
		sum=sum+p.getTotalValue();	
		}
		return sum;
	}
}
