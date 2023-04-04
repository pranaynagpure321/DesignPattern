package pranaymemento;

import java.util.ArrayList;
import java.util.List;

public class History {

    private List<EdittorState>  states = new ArrayList<>();

    public void push(EdittorState state){
        states.add(state);
    }

    public EdittorState pop(){
        int lastindex = states.size() - 1;
        EdittorState lastState = states.get(lastindex);
        states.remove(lastindex);
        return lastState;
    }

}
