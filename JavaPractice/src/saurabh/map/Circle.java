package saurabh.map;



public class Circle {
	private int centerX, centerY;
	public Circle(int x, int y) {
		centerX = x;
		centerY = y;
	}
	public int getCenterX() {
		return centerX;
	}
	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}
	public int getCenterY() {
		return centerY;
	}
	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + centerX;
		result = prime * result + centerY;
		return result;
	}*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (centerX != other.centerX)
			return false;
		if (centerY != other.centerY)
			return false;
		return true;
	}
	
}