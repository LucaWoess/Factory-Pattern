
public class FactoryPatternMain {

	public static void main(String[] args) {
		Factory f = new Factory();
		
		Dinosaur delta = f.createDinosaur(Factory.Dinos.TYRANNOSAURUS);
		Dinosaur alpha = f.createDinosaur(Factory.Dinos.TYRANNOSAURUS);
		Dinosaur blue = f.createDinosaur(Factory.Dinos.BRACHIOSAURUS);
		Dinosaur staudacher = f.createDinosaur(Factory.Dinos.VELOCIRAPTOR);
		
		System.out.println(alpha.getGenus()+" ("+alpha+"): diet: "+alpha.getDiet());
		System.out.println(delta.getGenus()+" ("+delta+"): diet: "+delta.getDiet());
		System.out.println(blue.getGenus()+" ("+blue+"): diet: "+blue.getDiet());
	}

}
