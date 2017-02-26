package week5.collectionsexcercises;

import java.util.*;

public class Country {
	  public HashMap<String, String> states;
	  public HashMap<String, String> cities;

	  public Country() {
	    states = new HashMap<String, String>();
	    cities = new HashMap<String, String>();

	    addSomeStates();
	    addSomeCities();
	  }

	  public void addSomeStates() {
	    states.put("Oregon", "OR");
	    states.put("Florida", "FL");
	    states.put("California", "CA");
	    states.put("New York", "NY");
	    states.put("Michigan", "MI");
	  }

	  public void addSomeCities() {
	    cities.put("CA", "San Francisco");
	    cities.put("MI", "Detroit");
	    cities.put("FL", "Jacksonville");
	  }

  public static void main(String args[]){
	  Country eua = new Country();

	    // Add some more cities
	    eua.cities.put("NY", "New York");
	    eua.cities.put("OR", "Portland");

	    // Puts out some cities
	    System.out.println("----------");
	    System.out.println("NY State has: " + eua.cities.get("NY"));
	    System.out.println("OR State has: " + eua.cities.get("OR"));

	    // Puts some states
	    System.out.println("----------");
	    System.out.println("Michigan's abbreviation is " + eua.states.get("Michigan"));
	    System.out.println("Florida's abbreviation is " + eua.states.get("Florida"));

	    // Do it by using the state then cities dict
	    System.out.println("----------");
	    System.out.println("Michigan has: " + eua.cities.get(eua.states.get("Michigan")));
	    System.out.println("Florida has: " + eua.cities.get(eua.states.get("Florida")));

	    // Puts every state abbreviation
	    System.out.println("----------");
	    eua.states.forEach((state, abbrev) -> System.out.println(state + " is abbreviated " + abbrev));

	    // Puts every city in state
	    System.out.println("----------");
	    eua.cities.forEach((abbrev, city) -> System.out.println(abbrev + " has the city " + city));
	    
	 // Puts every city in state
	    System.out.println("----------");
	    eua.cities.forEach((abbrev, city) -> System.out.println(abbrev + " has the city " + city));

	    // Now do both at the same time
	    System.out.println("----------");
	    eua.states.forEach((state, abbrev)->{
	      String city = eua.cities.get(abbrev);
	      System.out.println(state + " is abbreviated " + abbrev + " and has city " + city);
	    });

	    //
	    System.out.println("----------");
	    Boolean texas = eua.states.containsKey("Texas");

	    if(!texas) {
	      System.out.println("Sorry, no Texas.");
	    }
  }
}
