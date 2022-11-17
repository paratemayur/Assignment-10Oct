package com.mayur.assignment11OctClassAndObject;

import com.mayur.classobj.BoxWeight;

public class BoxMaster {
	public static void main(String[] args) {	
	
		//Box b = new Box(10, 5, 10);
		
		//	System.out.println(b.calcBox());
			
			//BoxWeight bw = new BoxWeight();
			
			BoxWeight bw1 = new BoxWeight(1, 2, 3, 40000);
			System.out.println(bw1.calcDensity());
	
	}
}
