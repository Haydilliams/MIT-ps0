package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import turtle.TurtleSoup;

public class testsTest {

	@Test
	public void calculateHeadingToPointTest() {
		
		
		double shouldBe150 = TurtleSoup.calculateHeadingToPoint(30, 0, 1, 0, 0);
		double shouldBe270 = TurtleSoup.calculateHeadingToPoint(0, 0, 0, -1, 0);

		assertTrue(shouldBe150 == 150d);
		System.out.println(shouldBe270);
		assertTrue(shouldBe270 == 270d);
	}
	
	@Test
	public void calculateHeadingTest() {
		Integer zero = new Integer(0);
		Integer one = new Integer(1);
		ArrayList<Integer> xCoords= new ArrayList<Integer>(4);
		xCoords.add(zero);
		xCoords.add(zero);
		xCoords.add(one);
		xCoords.add(one);
		ArrayList<Integer> yCoords= new ArrayList<Integer>(4);
		yCoords.add(one);
		yCoords.add(zero);
		yCoords.add(zero);
		yCoords.add(one);
		
		List<Double> result = TurtleSoup.calculateHeadings(xCoords, yCoords);

		System.out.println(result);

	}

}
