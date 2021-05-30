package model;
import java.time.LocalDate;

public class ProductForRent extends Product implements Rentable {


	private LocalDate devolutionDate;
	private State state;


	public void setState(State state){

		this.state=state;
	}

	public ProductForRent (String code, String name,double price, ProductType type) {

		super(code,name,1,price,type);

	}



	public void rentProduct (int amountDays) {

		String a;


		

	}

	@Override 
	public double getRentPrice(int amountDays){
		double totalprice = amountDays*price;
		return totalprice;
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
	public boolean isSafeRent (){

		boolean x=true;


		return x;

	}
























}