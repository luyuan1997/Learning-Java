package chapter9.chapter9_3;

import java.util.List;

public class Canvas {
	public void drawAll(List<Shape> shapes) {
		for(Shape s : shapes) {
			s.draw(this);
		}
	}
}
