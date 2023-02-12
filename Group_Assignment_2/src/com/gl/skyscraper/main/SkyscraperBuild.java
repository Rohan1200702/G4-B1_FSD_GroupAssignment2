/**
 * @author Rohan Chakraborty, Lalita Choudhury, PushPendra Trivedi
 * 	Other Group Member: Tanya Sharma, Abhishek Shah
 */
package com.gl.skyscraper.main;

import java.util.HashMap;
import java.util.Scanner;

import com.gl.skyscraper.calculate.SkyscraperCalculatorInterface;
import com.gl.skyscraper.calculate.SkyscraperCalulaterInterfaceImpl;

public class SkyscraperBuild {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// using hash map to map the floors with days
			HashMap<Integer, Integer> dayFloormap = new HashMap<>();
			System.out.println("Enter the total number of floors in the building");
			int floors = sc.nextInt();
			// filling in the Hashmap with floors as the key
			for (int i = 1; i <= floors; i++) {
				System.out.println("Enter the floor size given on day : " + i);
				dayFloormap.put(sc.nextInt(), i);
			}
			System.out.println("The order of construction is as follows");
			// calling the interface to show the floor assembling order
			SkyscraperCalculatorInterface sky = new SkyscraperCalulaterInterfaceImpl();
			sky.findBuildOrder(dayFloormap, floors);
		}
	}

}
