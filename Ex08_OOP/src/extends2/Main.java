package extends2;

public class Main {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(10, 1);
		rec.getArea();
		
		Circle cir = new Circle(5);
		cir.getArea();
		
		
		//업캐스팅
		Shape shap1 = rec;
		Object shap2 = cir;
		//단순 객체생성
		Shape shap3 = new Shape();
		//다운캐스팅
		Circle cir2 = (Circle)shap2;
		//다운캐스팅의 잘못된 사례
		Circle cir3 = (Circle)shap3;
		
		shap1.getArea();
		//shap2.getArea();
		
		
		Shape[] shapes = {rec,cir};
	}

}
