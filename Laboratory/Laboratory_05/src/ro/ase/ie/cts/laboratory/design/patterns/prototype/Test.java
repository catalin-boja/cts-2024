package ro.ase.ie.cts.laboratory.design.patterns.prototype;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {

		//create 5 identical buildings
		Building3DModel building1 = new Building3DModel("office.3d");
		//Building3DModel building2 = new Building3DModel("office.3d");
		//Building3DModel building3 = new Building3DModel("office.3d");
		
		Building3DModel building2 = (Building3DModel) building1.clone();
		Building3DModel building3 = (Building3DModel) building1.clone();
	}

}
