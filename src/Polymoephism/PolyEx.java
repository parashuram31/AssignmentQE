package Polymoephism;

	class Animal {
	    void makeSound() {
	        System.out.println("Some generic sound");
	    }
	}

	class Dog extends Animal {
	    @Override
	    void makeSound() {
	        System.out.println("Woof");
	    }
	}

	class Cat extends Animal {
	    @Override
	    void makeSound() {
	        System.out.println("Meow");
	    }
	}

	public class PolyEx {
	    public static void main(String[] args) {
	        Animal myDog = new Dog(); 
	        Animal myCat = new Cat();
	        
	        myDog.makeSound(); 
	        myCat.makeSound(); 
	    
	}


}
