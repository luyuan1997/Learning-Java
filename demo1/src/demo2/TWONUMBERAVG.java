package demo2;
import java.util.Arrays;
public class TWONUMBERAVG {
	public static void main(String[] args) {
		TWONUMBERAVG hello = new TWONUMBERAVG();
		int[] scores={79,52,98,81};
        
		//调用方法，传入成绩数组，并获取成绩的个数
		int count=scores.length;
        
		System.out.println("共有"+count+"个成绩信息！");
	}
    
	/*
	 * 功能：将考试成绩排序并输出，返回成绩的个数
	 * 定义一个包含整型数组参数的方法，传入成绩数组
	 * 使用Arrays类对成绩数组进行排序并输出
	 * 方法执行后返回数组中元素的个数
	 */
	public int sort(int scores[]){
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		
        //返回数组中元素的个数
        return scores.length;
	}
}
