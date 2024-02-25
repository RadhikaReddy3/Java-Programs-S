package com.pojo;

public class FoodandBev {
	
	private int fbid;
	private String food;
	private double fprice;
	
	public FoodandBev() {
		
	}
	
	public FoodandBev(int fbid, String food, double fprice) {
		 
		this.fbid = fbid;
		this.food = food;
		this.fprice = fprice;
	}
	 
	
	public int getFbid() {
		return fbid;
	}
	public void setFbid(int fbid) {
		this.fbid = fbid;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public double getFprice() {
		return fprice;
	}
	public void setFprice(double fprice) {
		this.fprice = fprice;
	}
	  

}
