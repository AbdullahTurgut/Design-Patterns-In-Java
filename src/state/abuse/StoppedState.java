package state.abuse;

public class StoppedState implements State{
    private Stopwatch stopwatch;


    //alt + Insert ile kısayol constructor oluşturma yapabiliriz
    public StoppedState(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }

    @Override
    public void click() {
        stopwatch.setCurrentState(new RunningState(stopwatch));
        System.out.println("Running");
    }
}
