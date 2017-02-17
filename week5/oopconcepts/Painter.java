import java.util.*;

public class Painter {
  private List<Tree> treeObjects;
  private List<Rock> rockObjects;
  private List<House> houseObjects;

  public Painter() {
    treeObjects = new ArrayList<Tree>();
    rockObjects = new ArrayList<Rock>();
    houseObjects = new ArrayList<House>();
  }

  public void addTree(Tree t) {
    treeObjects.add(t);
  }

  public void addRock(Rock r) {
    rockObjects.add(r);
  }

  public void addHouse(House h) {
    houseObjects.add(h);
  }

  public void paintTrees() {
    for(Tree tree : treeObjects) {
      tree.paint();
    }
  }

  public void paintRocks() {
    for(Rock rock : rockObjects) {
      rock.paint();
    }
  }

  public void paintHouses() {
    for(House house : houseObjects) {
      house.paint();
    }
  }

  public void paintAllObjects() {
    paintTrees();
    paintRocks();
    paintHouses();
  }

  public static void main(String args[]) {
    Painter painter = new Painter();

    Tree t1 = new Tree();
    Tree t2 = new Tree();
    Tree t3 = new Tree();

    painter.addTree(t1);
    painter.addTree(t2);
    painter.addTree(t3);

    Rock r1 = new Rock();
    Rock r2 = new Rock();
    Rock r3 = new Rock();

    painter.addRock(r1);
    painter.addRock(r2);
    painter.addRock(r3);

    House h1 = new House();
    House h2 = new House();
    House h3 = new House();

    painter.addHouse(h1);
    painter.addHouse(h2);
    painter.addHouse(h3);

    painter.paintAllObjects();

  }
}
