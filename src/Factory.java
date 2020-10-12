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

class Velociraptor implements Dinosaur{ //implement a new genus(Velocirapor)
	public String getDiet() {
		return "Carnivore";
	}
	public String getGenus() {
		return "Velocirapor";
	}
}
public class Factory {
	public enum Dinos { 
		TYRANNOSAURUS,BRACHIOSAURUS,VELOCIRAPTOR
	}
	
	public Dinosaur createDinosaur(Dinos d) { //creates and returns object of type Dinosaur 
		switch(d) {
			case TYRANNOSAURUS:
				return new Tyrannosaurus();
			case BRACHIOSAURUS:
				return new Brachiosaurus();
			case VELOCIRAPTOR:
				return new Velociraptor();
			default:
				throw new IllegalArgumentException("Wrong number!");
		}
	}
}
