package examples;

public class Message implements Likeable{
	private NormalUser sender;
	private NormalUser reciever;
	private String text;
	
	
	public Message(){
		// empty constructor to call getters and setters from it
	}
	
	public Message(NormalUser sender, NormalUser reciever, String text){
		this.sender = sender;
		this.reciever = reciever;
		this.text = text;
	}
	
	// getters and setters for all fields
	
	public NormalUser getReciever() {
		return reciever;
	}
	
	public void setReciever(NormalUser reciever) {
		this.reciever = reciever;
	}
	
	public NormalUser getSender() {
		return sender;
	}
	
	public void setSender(NormalUser sender) {
		this.sender = sender;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}

	
	// overwriting the toString method
	
	// reminder that this changes what will be printed
	// when we do something like System.out.println(message)
	
	public String toString(){
		return "Message text: "+text;
	}
	
	// try commenting this method to see what the compiler says
	// (spoiler: since this comes from our implemented interface, 
	// it HAS to be implemented!)
	@Override
	public void like(Like l) {
		System.out.println("Messages can't like stuff! But they can be liked!");
	}
	
	
	// one advantage of using this: everything that implements Likeable
	// gets to define their own behavior for like(Like l)
		
	// we can see similar examples in the Java API:
	// the Iterable interface ( https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html )
	// the name itself is telling: everything that can be iterated 
	// has to be able to do these things
		
	// these comments can also be found in the Likeable interface and the Message class
	// so you don't miss them
}
