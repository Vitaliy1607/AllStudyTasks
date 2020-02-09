package generics;

public class Container<TYPE> {
    private TYPE val;

    public Container(TYPE val) {
        this.val = val;
    }

    public TYPE getVal() {
        return val;
    }

    public void setVal(TYPE val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Container{" +
                "val=" + val +
                '}';
    }
}
