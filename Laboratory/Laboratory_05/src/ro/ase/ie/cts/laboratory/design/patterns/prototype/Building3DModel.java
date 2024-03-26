package ro.ase.ie.cts.laboratory.design.patterns.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Building3DModel implements Cloneable{
	
	List<Integer> points = new ArrayList<>();
	String filename;
	
	public Building3DModel(String filename) {
		this.filename = filename;
		System.out.println("Generating model for " + filename);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Random random = new Random();
		for(int i = 0; i < 100; i++) {
			points.add(random.nextInt(1000));
		}
	}
	
	public Building3DModel() {
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//do DEEP COPY
		Building3DModel copy = new Building3DModel();
		copy.filename = this.filename;
		copy.points = new ArrayList<Integer>(this.points);
		return copy;
	}
	
	
	
}
