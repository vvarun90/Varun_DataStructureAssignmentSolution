package com.greatlearning.question1.driver;

import java.util.LinkedList;
import java.util.Scanner;

import com.greatlearning.question1.service.ConstructionPlan;

public class Main {

	public static void main(String[] args) {
		
		int floors;
		
		LinkedList<Integer> list = new LinkedList<>();
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the total no of floors in the building");
		floors = sc.nextInt();
		
		for(int i = 1; i <= floors; i++) {
			
			System.out.println("Enter the floor size given on day : " + i);
			list.add(sc.nextInt());			
		}
		
		ConstructionPlan plan = new ConstructionPlan();
		plan.implementConstructionPlan(list);
		
		sc.close();

	}

}
