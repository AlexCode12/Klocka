public class NumberDisplay{
    protected int limit;
    protected int value;

    /**
     * Metod som sätter limiten.
     * @param maxLimit
     */
    public NumberDisplay(int maxLimit) {
        value = 0;
        limit = maxLimit;
    }

    /**
     * Getter för value
     * @return
     */
    public int getValue() {
        return value;
    }

    /**
     * Den här metoden är en failsafe för klockan. Om ett ogiltigt värde (ex -1) skrivs in händer inget.
     * @param newValue
     */
    public void setValue(int newValue) {
        if (newValue < 0 && newValue > limit) {

        } else {
            this.value = newValue;
        } //Om värderna skulle vara -1 och neråt, samt 60 och uppåt gör inte klockan något
    }

    /**
     * Returnerar displayen, med designen XX:XX
     * @return
     */
    public String getDisplayValue() {
        String display = Integer.toString(value);
        if (value < 10) {
            display = "0" + display;
        }
        return display;
    }

    /**
     * Adderar minuter
     */
    public void increment() {
        value++;
        if (value == limit) {
            setValue(0);
        }
    }
}
