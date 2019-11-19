public class Clock {
private NumberDisplay hours;
private NumberDisplay minutes;
private String displayString;

    /**
     * Konstruktor som anropas varje gång klockan skapas
     */
    public Clock () {
        this.hours = new NumberDisplay(24);
        this.minutes = new NumberDisplay(60);
        updateDisplay();
    }

    /**
     * Sätter värdena till 00:00
     * @param hours räknar timmarna
     * @param minutes räknar minuterna
     */
    public Clock(int hours, int minutes) {
        this();
        this.hours.setValue(0);
        this.minutes.setValue(0);
    }

    /**
     * Denna metod adderar minuterna
     */
    public void timeTick () {
        minutes.increment();
    } //Enbart struktur, måste aktiveras manuellt

    /**
     * Setter för tiden, se Clock för mer info
     * @param hours
     * @param minutes
     */
    public void setTime(int hours, int minutes) {
        this.hours.setValue(hours);
        this.minutes.setValue(minutes);
    }

    /**
     * Getter för displayStringen
     * @return
     */
    public String getTime() {
        return displayString;
    }

    /**
     * Uppdaterar displayen.
     */
    private void updateDisplay() {
    displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }

    /**
     * Testprogram för att se att allt funkar
     * @param args
     */
    public static void main(String[] args) {
        Clock c1 = new Clock();
        System.out.println(c1.getTime());
    }
    //PSVM-en skapar en ny klocka, för att sedan returnera getTime (displayStringen). Stuktur på den finns i updateDisplay
}
