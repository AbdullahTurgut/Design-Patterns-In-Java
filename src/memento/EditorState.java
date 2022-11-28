package memento;

public class EditorState {
    private final String content; //can not change content (final)

    //parametreli constructor
    public EditorState(String content) {
        this.content = content;
    }

    //getter methodu content için
    public String getContent() {
        return content;
    }
}
