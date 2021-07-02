package composition;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("Lamp -> Turning On");
    }

    private String getStyle() {
        return style;
    }

    private boolean isBattery() {
        return battery;
    }

    private int getGlobRating() {
        return globRating;
    }
}
