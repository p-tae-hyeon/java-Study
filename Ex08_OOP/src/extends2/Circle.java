package extends2;

public class Circle extends Shape{
//	double x;
//	
//	public void getArea() {
//		System.out.println("현재 면적은 "+x+"입니다.");
//	}
	double radius;
	
	public Circle(double radius) {
		this.radius =radius;
	}
	@Override
	public void getArea() {
		x=radius*radius*Math.PI;
		super.getArea();
	}
	
}
