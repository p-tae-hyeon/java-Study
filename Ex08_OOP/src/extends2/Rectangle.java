package extends2;

public class Rectangle extends Shape{
	//double x;
	double height;
	double width;
	//사각형 면적 : 가로 곱하기 세로.
	
	//객체를 생성할때, 가로와 세로를 받아놓기.
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	@Override
	public void getArea() {
		x= height*width;
		super.getArea();
	}


}
