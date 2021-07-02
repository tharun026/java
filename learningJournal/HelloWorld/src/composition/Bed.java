package composition;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make() {
        System.out.println("Bed -> Making | ");
    }

    private String getStyle() {
        return style;
    }

    private int getPillows() {
        return pillows;
    }

    private int getHeight() {
        return height;
    }

    private int getSheets() {
        return sheets;
    }

    private int getQuilt() {
        return quilt;
    }
}
