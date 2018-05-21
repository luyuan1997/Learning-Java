package demo1;
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		int classNum =3;
		int stuNum=4;
		double sum=0;
		double avg=0;
		Scanner input = new Scanner(System.in);//创建Scanner对象
		for (int i=1; i<= classNum; i++) {//外层循环控制班级的数量
			sum=0;
			System.out.println("***请输入第"+i+"个班级的成绩***");
			for(int j=1;j<=stuNum;j++) {//内层循环控制每个班级学生的数量
				System.out.println("请输入第"+j+"个学生的成绩：");
				int score=input.nextInt();//获取输入的成绩
				sum=sum+score;//成绩累加求和
			}
			avg=sum/stuNum;
			System.out.println("第"+i+"个班级学生的平均成绩为:"+avg);
		}
	}
}
//经验总结：
//1.通过分析，明确需求；
//2.整理相关知识点；
//3.梳理实现流程；
//4.借助“断点跟踪”解决问题；