package memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    //EditorState için List yapısı
    private List<EditorState> states = new ArrayList<>();

    //Listeye eklemek için push fonksiyonu
    public void push(EditorState state){
        states.add(state);
    }
    //Listeden çıkarma yapmak için
    public EditorState pop(){
        var lastIndex = states.size() - 1; //bu şekilde listenin sonundaki elamanı alabileceğim
        var lastState = states.get(lastIndex); //state listesinin son elamanı alındı
        states.remove(lastState);

        return lastState;
    }
}
