/**
 * @author Rohan Chakraborty, Lalita Choudhury, PushPendra Trivedi
 * 	Other Group Member: Tanya Sharma, Abhishek Shah
 */
package com.gl.skyscraper.calculate;

import java.util.HashMap;

public class SkyscraperCalulaterInterfaceImpl implements SkyscraperCalculatorInterface {
	// body of method findBuildOrder
	public void findBuildOrder(HashMap<Integer, Integer> dayFloormap, int total) {
		int floorTemp = total;
		boolean flag;
		// Looping through each day of construction
		for (int i = 1; i <= total; i++) {
			flag = false;
			System.out.println("Day " + i);
			// checking the day of a given floor is before the current day
			// if it is then print it out
			while (floorTemp >= 1 && dayFloormap.get(floorTemp) <= i) {
				flag = true;
				System.out.print(floorTemp);
				floorTemp--;
			}
			if (flag)
				System.out.println(" ");
		}
	}
}
