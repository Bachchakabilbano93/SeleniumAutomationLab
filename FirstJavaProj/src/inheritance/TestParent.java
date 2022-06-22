package inheritance;

public class TestParent {

	public static void main(String[] args) {
		
		GrandParent grandParent = new GrandParent();
		Parent parent = new Parent();
		parent.printValue();
		parent.myMovies();
		grandParent.myMovies();

	}

}
