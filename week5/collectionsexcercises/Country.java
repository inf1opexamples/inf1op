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

  }

  public void addSomeCities() {

  }

  public static void main(String args[]){
    Country uk = new Country();

    // Add some more cities
    eua.cities.put("NY", "New York");
    eua.cities.put("OR", "Portland");

    // Print out some cities

    //
    System.out.println("----------");
    Boolean edinburgh = uk.states.containsKey("Edinburgh");

    if(!edinburgh) {
      System.out.println("Nope.");
    }
  }
}
