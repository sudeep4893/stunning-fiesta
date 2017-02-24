package com.psl.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.psl.bean.Dish;
import com.psl.bean.Location;
import com.psl.util.DominozPizzaDeliveryImpl;

public class Client {

	public static void main(String[] args) {
		
		System.out.println("************************************************");
		System.out.println("Dominos Pizza ");
		System.out.println("************************************************");
		System.out.println(" ");
		List<Dish> dishs = new ArrayList<Dish>();
		Set<Location> locations = new HashSet<Location>();
		
		DominozPizzaDeliveryImpl dm = new DominozPizzaDeliveryImpl();
		dm.populateData("dish.txt", "location.txt", dishs, locations);
		for(Location l : locations){
			System.out.println(l + " ");
		}
		System.out.println("Size of Locations set is : " + locations.size());
		System.out.println(" ");
		System.out.println("************************************************");
		for(Dish d : dishs){
			System.out.println(d + " ");
		}
		System.out.println("Size of Dishes list is : "+ dishs.size());
		System.out.println(" ");
		System.out.println("************************************************");
		dm.calculateLocationForDistance(dishs, locations);
		for(Dish d : dishs){
			System.out.println(d + " ");
		}
		System.out.println("Size of Dishes list is : "+ dishs.size());
		
		
		
	}

}
