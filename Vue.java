import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.*;
import java.io.*;

public class Vue extends JPanel{
  private Dessin dessin;

  public Vue(Dessin dessin){
    super();
    this.dessin = dessin;
  }

  public void paint(Graphics g){
    aff(g);
    //g.drawOval(5,5,60,60);
  }

  public int[] get_x_triangle(Triangle t){
    int[] tab=new int[3];
    tab[0]=t.get_x();
    tab[1]=t.get_p1().get_x();
    tab[2]=t.get_p2().get_x();

    return tab;
  }

  public int[] get_y_triangle(Triangle t){
    int[] tab=new int[3];
    tab[0]=t.get_y();
    tab[1]=t.get_p1().get_y();
    tab[2]=t.get_p2().get_y();

    return tab;
  }

  public void aff(Graphics g){
    Iterator<Figure> ite = dessin.iterator();
    Figure fig;
    String type;
    int x;
    int y;
    int width;
    int height;
    int temp_x;
    int temp_y;

    while(ite.hasNext()){
      fig=ite.next();
      fig.vue.dessin(g,fig);

    }
  }
}//fin de la class
