package chapter7_3;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//将弧度转化为角度
		System.out.println("Math.toDegress(1.57):"+Math.toDegrees(1.57));
		//将角度转化为弧度
		System.out.println("Math.toRadians(90):"+Math.toRadians(90));
		//计算反余弦,反正弦，反正切，余弦，双曲余弦，正弦，双曲正弦，正切，双曲正切
		System.out.println("Math.acos(1.2):"+Math.acos(1.2));
		System.out.println("Math.asin(0.8):"+Math.asin(0.8));
		System.out.println("Math.atan(1.2):"+Math.atan(2.3));
		System.out.println("Math.cos(1.57):"+Math.cos(1.57));
		System.out.println("Math.cosh(1.2):"+Math.cosh(1.2));
		System.out.println("Math.sin(1.57):"+Math.sin(1.57));
		System.out.println("Math.sinh(1.2):"+Math.sinh(1.2));
		System.out.println("Math.tan(0.8):"+Math.tan(0.8));
		System.out.println("Math.tanh(2.1):"+Math.tanh(2.1));
		//将矩形坐标(x,y)转换为极坐标(r,thet)
		System.out.println("Math.atan2(0.1,0.2):"+Math.atan2(0.1, 0.2));
		//取整，返回小于目标数的最大整数
		System.out.println("Math.floor(-1.2):"+Math.floor(-1.2));
		//取整，返回大于目标数的最小整数
		System.out.println("Math.ceil(1.2):"+Math.ceil(1.2));
		//四舍五入取整
		System.out.println("Math.round(2.3):"+Math.round(2.3));
		
	}

}
