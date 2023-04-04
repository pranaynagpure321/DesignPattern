import Factory.ShapFactory;
import Factory.Shape;
import Singelton.SingleDemo;
import pranaymemento.Editior;
import pranaymemento.History;

import java.util.Scanner;


// this pattern is used to create undo mechnism
public class Main {

    public static void main(String[] args) {

        String pattern="";
        Scanner in = new Scanner(System.in);
        System.out.println( " please Enter Design Pattern ");
        pattern = in.nextLine();

        if(pattern.equals("memento"))
        {
            Editior editior = new Editior();
            History history = new History();

            editior.setContent("a");
            history.push(editior.createState());

            editior.setContent("b");
            history.push(editior.createState());

            editior.setContent("c");
            editior.restore(history.pop());
            editior.restore(history.pop());

            System.out.println(editior.getContent());
        }

        if (pattern.equals("singelton"))
        {
            SingleDemo demo = SingleDemo.getInstance();

            demo.showMessage();

            SingleDemo demo1 = SingleDemo.getInstance();

            System.out.println(demo == demo1);
        }

        if (pattern.equals("factory"))
        {
            ShapFactory shapFactory = new ShapFactory();

            Shape shape1 = shapFactory.getShape("CIRCLE");
            shape1.draw();

            Shape shape2 = shapFactory.getShape("SQUARE");
            shape2.draw();

            Shape shape3 = shapFactory.getShape("RECTANGLE");
            shape3.draw();
        }

    }
}


