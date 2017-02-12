package examples;

import java.util.ArrayList;

public class NormalUser extends User implements Likeable{
	ArrayList<Like> likes = new ArrayList<Like>();
	ArrayList<Message> sent = new ArrayList<Message>();
	ArrayList<Message> recieved = new ArrayList<Message>();
	
	public NormalUser(String username){
		super(username);
		// the super() method calls
		// our base class (in this case, the abstract class User)
		// public User(String username)
		
		// and since our only constructor in User recieves
		// a username as an argument, we send it too 
		
		// you can even call a specific overloaded constructor 
		// (we only have one but if you want to, for example,
		// add an empty one, you could call it with "super()" )
	}
	
	
	// two definitions of a message method
	
	public void message(NormalUser reciever, String text){
		Message m = new Message();
		m.setSender(this);
		m.setReciever(reciever);
		m.setText(text);
		this.sent.add(m);
		reciever.recieved.add(m);
	}
	
	public void message(Message m){
		this.sent.add(m);
		m.getReciever().recieved.add(m);
	}
	
	// overwriting the default toString of user
	// reminder that this changes what will be printed
	// when we do something like System.out.println(user)
	
	public String toString(){
		return this.getUsername();
	}
	
	// try commenting this method to see what the compiler says
	// (spoiler: since this comes from our implemented interface, 
	// it HAS to be implemented!)
	@Override
	public void like(Like l) {
		likes.add(l);
		System.out.println("From User like method: "+l.liker.toString()+" likes "+l.liked.toString());
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
