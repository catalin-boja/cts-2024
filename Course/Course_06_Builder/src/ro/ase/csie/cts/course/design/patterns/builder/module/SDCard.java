package ro.ase.csie.cts.course.design.patterns.builder.module;

public class SDCard implements InterfaceExternalMemory{
	double capacitate;
	
	public SDCard(double capacitate){
		this.capacitate = capacitate;
	}
}
