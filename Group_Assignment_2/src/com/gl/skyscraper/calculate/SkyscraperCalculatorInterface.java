/**
 * @author Rohan Chakraborty, Lalita Choudhury, PushPendra Trivedi
 * 	Other Group Member: Tanya Sharma, Abhishek Shah
 */
package com.gl.skyscraper.calculate;

import java.util.HashMap;

/*
 * Interface created to calculate the Skyscraper  assembly day
 */
public interface SkyscraperCalculatorInterface {
	public void findBuildOrder(HashMap<Integer, Integer> dayFloormap, int floors);
}
