package saurabh.map;

public class ColoredCircle extends Circle{
	private final String color;

    public ColoredCircle(int centerX, int centerY, String color) {
        super(centerX, centerY);
        this.color = color;
    }

	@Override 
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj instanceof ColoredCircle) {
            ColoredCircle that = (ColoredCircle) obj;
            result = (this.color.equals(that.color) && super.equals(that));
        }
        return result;
    }
}
