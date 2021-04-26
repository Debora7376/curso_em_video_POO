package aula07;
import java.util.List;

public class Aula07 {

    public static void main(String[] args) {
       Lutador lutadores[] = new Lutador [6];

        lutadores[0] =  new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9, 11, 3,1);
        lutadores[1] =  new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8, 14, 2,3);
        lutadores[2] =  new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9, 12, 2,1);
        lutadores[3] =  new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6, 13, 0,2);
        lutadores[4] =  new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3, 5, 4,3);
        lutadores[5] =  new Lutador("Nerdaard", "EUA", 30, 1.81f,105.7 , 12, 2,4);
        lutadores[1].apresentar();
        lutadores[1].status();
      }
    }
