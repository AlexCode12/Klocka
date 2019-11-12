public class NumberDisplay{
    protected int limit;
    protected int value;


    public NumberDisplay(int maxLimit) {
        value = 0;
        limit = maxLimit;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int newValue) {
        if (newValue < 0 && newValue > limit) {

        } else {
            this.value = newValue;
        } //Om värderna skulle vara -1 och neråt, samt 60 och uppåt gör inte klockan något
    }
    public String getDisplayValue() {
        String display = Integer.toString(value);
        if (value < 10) {
            display = "0" + display;
        }
        return display; //Enbart design, enkelt sätt att få fram den extra nollan (ex 09).
    }
    public void increment() {
        value++;
        if (value == limit) {
            setValue(0);
        }
    }
}
