package examples;

public class Main {

	public static void main(String [] args) {
		// create two normal users
		NormalUser user1 = new NormalUser("user1");
		NormalUser user2 = new NormalUser("user2");
		
		// create a message from user1 to user2
		Message m = new Message(user1, user2, "message from u1 to u2");
		user1.message(m); // message(Message m), which assumes the user invoking the method
						  // is the sender
		user2.message(user1, "pick up your lanundry, user2!"); // messsage(User reciever, String text)
		user1.message(user2, "I'm going home bro");
		
		Like l = new Like(user1, m); // Like(Likeable liker, Likeable liked)
									 // creating a new like object where
									 // the "liker" is User user1, and the "liked" is Message m
		
									 // we can do this because the Like constructor is defined with
									 // Likeable arguments and both NormalUser and Message implement it
		
		user1.like(l); // user like(Like l) method, which adds Like l to the user likes array
		user2.like(new Like(user2, user1)); // another way to instantiate a like (without a reference)
											// why do this? because we won't actually be needing the 
											// reference afterwards! You can choose to do this when
											// you know you won't be making object calls with the reference
		
		m.like(l); // this is actually possible! 
		
		// now we iterate through user1's sent array, an array of Message items
		System.out.println("\n\nPrinting user 1 sent array");
		for(Message mi: user1.sent){
			System.out.println(mi.toString());
		}
		
		
		// same for user1 likes array, an array of Like items
		System.out.println("\n\nPrinting user 1 likes array");
		for(Like li: user1.likes){
			System.out.println(li.toString());
		}
		
		System.out.println("\n\nPrinting user 2 sent array");
		for(Message mi: user2.sent){
			System.out.println(mi.toString());
		}
		
		System.out.println("\n\nPrinting user 2 likes array");
		for(Like li: user2.likes){
			System.out.println(li.toString());
		}

	}

}
