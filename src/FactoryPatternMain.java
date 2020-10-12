
public class FactoryPatternMain {

	public static void main(String[] args) {
		Factory f = new Factory();
		
		Dinosaur delta = f.createDinosaur(Factory.TYRANNOSAURUS);
		Dinosaur alpha = f.createDinosaur(Factory.TYRANNOSAURUS);
		Dinosaur blue = f.createDinosaur(Factory.BRACHIOSAURUS);
		
		System.out.println(alpha.getGenus()+" ("+alpha+"): diet: "+alpha.getDiet());
		System.out.println(delta.getGenus()+" ("+delta+"): diet: "+delta.getDiet());
		System.out.println(blue.getGenus()+" ("+blue+"): diet: "+blue.getDiet());
	}

}
