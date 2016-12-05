package nested_classes;

public class Apple {

    private AppleColor color;

    public AppleColor getColor() {
        return color;
    }

    public void setColor(AppleColor color) {
        this.color = color;
    }

    public Apple(AppleColor color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple: " + color.toString() + "\n";
    }

    public enum AppleColor {
        GREEN, RED, YELLOW
    }
}
