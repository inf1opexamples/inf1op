package week5.oopconcepts;

import java.util.*;

public class Painter {
	private List <Paintable> paintableObjects;

  public Painter() {
    paintableObjects = new ArrayList<Paintable>();
  }

  public void addPaintable(Paintable p) {
    paintableObjects.add(p);
  }

  public void paintAllObjects() {
    for(Paintable p : paintableObjects) {
      p.paint();
    }
  }


  public static void main(String args[]) {
    Painter painter = new Painter();

    Tree t1 = new Tree();
    Tree t2 = new Tree();
    Tree t3 = new Tree();

    painter.addPaintable(t1);
    painter.addPaintable(t2);
    painter.addPaintable(t3);

    Rock r1 = new Rock();
    Rock r2 = new Rock();
    Rock r3 = new Rock();

    painter.addPaintable(r1);
    painter.addPaintable(r2);
    painter.addPaintable(r3);

    House h1 = new House();
    House h2 = new House();
    House h3 = new House();

    painter.addPaintable(h1);
    painter.addPaintable(h2);
    painter.addPaintable(h3);

    painter.paintAllObjects();

  }
}
