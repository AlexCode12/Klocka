public class Clock {
private NumberDisplay hours;
private NumberDisplay minutes;
private String displayString;

    public Clock () {
        this.hours = new NumberDisplay(24);
        this.minutes = new NumberDisplay(60);
        updateDisplay();
    }

    public Clock(int hours, int minutes) {
        this();
        this.hours.setValue(0);
        this.minutes.setValue(0);
    }
    public void timeTick () {
        minutes.increment();
    } //Enbart struktur, måste aktiveras manuellt

    public void setTime(int hours, int minutes) {
        this.hours.setValue(hours);
        this.minutes.setValue(minutes);
    }
    public String getTime() {
        return displayString;
    }
    private void updateDisplay() {
    displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }

    public static void main(String[] args) {
        Clock c1 = new Clock();
        System.out.println(c1.getTime());
    }
    //PSVM-en skapar en ny klocka, för att sedan returnera getTime (displayStringen). Stuktur på den finns i updateDisplay
}
