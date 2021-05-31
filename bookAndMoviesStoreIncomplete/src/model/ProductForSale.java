package model;

public class ProductForSale extends Product implements Saleable {


	private double discount;
	

	public void setDiscount (double discount){

		this.discount=discount;
	}



	public ProductForSale (String code, String name,int units,double price, ProductType type) {

		super(code,name,units,price,type);

	}


	@Override
	public double applyExtraDiscount(double subtotal, double percenteageDiscount){
		double finalPrice=0;
		finalPrice=subtotal - (percenteageDiscount*subtotal);
		return finalPrice;
	}

	@Override
	public double calculateTax (double totalPrice, double percenteage) {
		double finalPrice;
		finalPrice= totalPrice + (totalPrice*percenteage);

		return finalPrice;

	}

	@Override
	public double getSalePrice (int units) {
		double d=0;

		d= getPrice()*units - discount;

		return d;
	}

	@Override
	public String getInformation() {

		String out= "The code is: " + getCode() + "\n"+ "Name:" + getName()+ "\n" + "Units: "+ getUnits()+ "\n" + "price: "+getPrice();
			switch (getType()){

			case BOOK:
			out+= "\n" + "Type: BOOK";
			break; 
			case MAGAZINE:
			out+= "\n" + "Type: MAGAZINE";
			break; 
			case DVD_MOVIE:
			out+= "\n" + "Type: DVD_MOVIE";
			break; 
			case DOWNLOAD_MOVIE:
			out+= "\n" + "Type: DOWNLOAD_MOVIE";
			break; 

		}
		return out;
	}

	@Override
	public boolean isSafeSale (int units){

		boolean available=false;


		if (units>0 && units<=getUnits()){

			available=true;
		}


		return available;

	}































}