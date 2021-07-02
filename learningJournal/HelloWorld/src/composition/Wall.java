package composition;

public class Wall {
    private String direction;

    public Wall(String direction) {
        this.direction = direction;
    }

    private String getDirection() {
        return direction;
    }
}
