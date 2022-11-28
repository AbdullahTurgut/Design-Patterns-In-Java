package state.abuse;

public class RunningState implements State{
    private Stopwatch stopwatch;
    //Stopwatch click event ile erişmek için constructor yazmamız lazım
    public RunningState(Stopwatch stopwatch){
        this.stopwatch = stopwatch;
    }
    @Override
    public void click() {
        stopwatch.setCurrentState(new StoppedState(stopwatch));
        System.out.println("Stopped");
    }
}
