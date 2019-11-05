public class NumberDisplay {
    protected int limit;
    protected int value;


    public void NumberDisplay (int maxLimit) {
        value = 0;
        limit = maxLimit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;

    }
    

}
