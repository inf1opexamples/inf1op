package examples;

public interface Likeable {
	public void like(Like l);
	// one advantage of using this: everything that implements Likeable
	// gets to define their own behavior for like(Like l)
			
	// we can see similar examples in the Java API:
	// the Iterable interface ( https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html )
	// the name itself is telling: everything that can be iterated 
	// has to be able to do these things
			
	// these comments can also be found in the Likeable interface and the Message class
	// so you don't miss them
}
