import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Result {
	/*/ Не раотает ошибка в трактовке задачи, искал касаются ли окружности друг-друга :р
	public void checkTouch(ArrayList<Circle> circles) {
		ArrayList<Map<Double,Double>> circlePoints = new ArrayList<Map<Double,Double>>();
		for (Circle circle : circles) {
			Map<Double, Double> points = new HashMap<Double, Double>();
			for (double i = 0; i < 360; i+=1) {
				double x = circle.getRadius() * Math.sin(i) + circle.getX();
				double y = circle.getRadius() * Math.cos(i) + circle.getY();
				points.put(x, y);
			}
			circlePoints.add(points);
		}
		
	}*/

	public void minSquare(ArrayList<Circle> circles) {
		double i = circles.get(0).getSquare();

		for (Circle circle : circles) {
			if (circle.getSquare() < i) {
				i = circle.getSquare();
			}
		}
		for (Circle circle : circles) {
			if (circle.getSquare() == i) {
				int index = circles.indexOf(circle) + 1;
				System.out.println("Минимальная площадь у окружности " + index);
				break;
			}
		}

	}

	public void maxSquare(ArrayList<Circle> circles) {
		double i = circles.get(0).getSquare();
		for (Circle circle : circles) {
			if (circle.getSquare() > i) {
				i = circle.getSquare();
			}
		}
		for (Circle circle : circles) {
			if (circle.getSquare() == i) {
				int index = circles.indexOf(circle) + 1;
				System.out.println("Максимальная площадь у окружности " + index);
				break;
			}
		}
	}
}
