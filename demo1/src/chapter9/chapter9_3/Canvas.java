package chapter9.chapter9_3;

import java.util.List;

public class Canvas {
	public void drawAll(List<?> shapes) {
		for(Object obj : shapes) {
			Shape s = (Shape)obj;
			s.draw(this);
		}
	}
}
