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
		double extra=0;
		return extra;
	}

	@Override
	public double calculateTax (double totalPrice, double percenteage) {
		double c=0;


		return c;

	}
	@Override
	public double getSalePrice (int units) {
		double d=0;

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

		boolean x=true;


		return x;

	}































}