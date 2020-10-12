interface Dinosaur{
	public String getGenus(); // Genus of the dinosaur
	public String getDiet(); // Diet of the dinosaur
}

class Tyrannosaurus implements Dinosaur{ //implement a new genus(Tyrannosaurus)
	public String getDiet() {
		return "Carnivore";
	}
	public String getGenus() {
		return "Tyrannosaurus";
	}	
}

class Brachiosaurus implements Dinosaur{ //implement a new genus(Brachiosaurus)
	public String getDiet() {
		return "Herbivore";
	}
	public String getGenus() {
		return "Brachiosaurus";
	}
}
public class Factory {
	public static final int TYRANNOSAURUS = 0;
	public static final int BRACHIOSAURUS = 1;
	
	public Dinosaur createDinosaur(int id) { //creates and returns object of type Dinosaur 
		switch(id) {
			case TYRANNOSAURUS:
				return new Tyrannosaurus();
			case BRACHIOSAURUS:
				return new Brachiosaurus();
			default:
				throw new IllegalArgumentException("Wrong number!");
		}
	}
}
