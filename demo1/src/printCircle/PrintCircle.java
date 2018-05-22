package printCircle;

import java.lang.Math;
public class PrintCircle {
    public static void main(String[] args) {
        paint(10); //半径10
    }
    public static void paint(int r) {
     //假定圆心在坐标(r,r);
        int y = r * 2; //y的坐标开始
        int x = 0;
        int c = 0; //中间空格数量
        int z = 2; //每行递减量
        for (int j = r * 2; j >= 0; j=j-z) {
            x = getX(r, y);
            System.out.print(getSpace(x) + "*");
            c = (r-x)*2;
            System.out.println(getSpace(c) + "*");
            y-=z;
        }
    }
    public static int getX(int r, int y) {
        //解圆标准方程的
        int x = y - r;       
        double t = Math.sqrt((r * r) - (x * x));
        return (int) Math.round(r-t);
    }
    public static String getSpace(int i) {
        String s = "";
        for (int j = 0; j < i; j++) {
            s += " ";
        }
        return s;
    }
}