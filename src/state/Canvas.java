package state;

public class Canvas {
    private Tool currentTool; //getter ve setter için alt+enter

    public void mouseDown(){
        currentTool.mouseDown();
    }
    public void mouseUp(){
        currentTool.mouseUp();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
