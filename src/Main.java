import pranaymemento.Editior;
import pranaymemento.History;


// this pattern is used to create undo mechnism
public class Main {

    public static void main(String[] args) {

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
}
