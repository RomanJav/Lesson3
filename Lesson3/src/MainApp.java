
import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		ArrayList<Circle> circleList=new ArrayList<Circle>();
		circleList.add(new Circle());
		circleList.add(new Circle());
		Result a=new Result();
		a.maxSquare(circleList);
		a.minSquare(circleList);
	}

}
