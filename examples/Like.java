package examples;

public class Like {
	// Like has two Likeable fields to allow a user to like various object types
	Likeable liker;
	Likeable liked;
	public Like(Likeable liker, Likeable liked){
		this.liker = liker;
		this.liked = liked;
	}
	
	public String toString(){
		return "Liker: "+this.liker.toString()+" Liked: "+this.liked.toString();
	}
}
