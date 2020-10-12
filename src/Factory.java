interface Dinosaur{
	public String getDiet();
	public String getName();
}

class Tyrannosaurus implements Dinosaur{
	public String getDiet() {
		return "Carnivore";
	}
	public String getName() {
		return "Tyrannosaurus";
	}	
}

class Brachiosaurus implements Dinosaur{
	public String getDiet() {
		return "Herbivore";
	}
	public String getName() {
		return "Brachiosaurus";
	}
}
public class Factory {
	public static final int TYRANNOSAURUS = 0;
	public static final int BRACHIOSAURUS = 1;
	
	public Dinosaur createDinosaur(int id) {
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
