
public class Gate {
    private int slowness;
    private boolean free;

    public Gate(int slowness, boolean free) {
        this.slowness = slowness;
        this.free = free;
    }

    public int getSlowness() {
        return slowness;
    }

    public boolean isFree() {
        return free;
    }
}
