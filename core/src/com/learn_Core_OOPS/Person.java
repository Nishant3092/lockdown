package com.learn_Core_OOPS;

public class Person {

	
	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private double id;
    private String name;

    public Person() {
        // Only Person class can access and assign
        id = Math.random();
        
        sayHello();
    }

    // This method is protected for giving access within Person class only
    private void sayHello() {
        System.out.println("Hello - " + getId());
    }
    
    
}
