package com.navin.Telusko;

public class Tyre 
{
   private String brand;

// constructor injection 
   
//public Tyre(String brand) 
//{
//	super();
//	this.brand = brand;
//}

public String getBrand() 
{
	return brand;
}

// setter injection 
public void setBrand(String brand)
{
	this.brand = brand;
}

@Override
public String toString() 
{
	return "Its working....";
}
   
    
}
