package ro.ase.ie.cts.clean.code;

import java.util.ArrayList;
import java.util.List;

import com.sun.jdi.ClassType;

public class DependencyContainer {
	List<Object> dependencies = new ArrayList<>();
	
	public void addDependency(Object dependency) {
		this.dependencies.add(dependency);
	}
	
	public Object getDependency(ClassType type) {
		for(Object dependency : dependencies) {
			if(dependency.getClass().equals(type)) {
				return dependency;
			}
		}
		return null;
	}
}
