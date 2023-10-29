package classes;
//SILVER : 1000 
//GOLD : 2000
//DIAMOND : 5000
//PLATINUM : 10000
public enum ServicePlan {
	GOLD(2000),PLATINIUM(10000),SILVER(1000),DIAMOND(5000);
	
	private int price;
	private  ServicePlan(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
