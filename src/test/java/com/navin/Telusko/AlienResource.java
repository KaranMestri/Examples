package com.navin.Telusko;

@path("aliens")
public class AlienResource 
{
	@GET
	
    public Alien getAlien()
    {
    	System.out.println("getAlien called.....");
    	Alien a1 = new Alien();
    	a1.setName("Navin");
    	a1.setPoints(60);
    	return a1;
    }
}
