package p20190129;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

/** 
* 统计文件中的字符数 ,获取输入流并将其分析为“标记”，允许一次读取一个标记。 
*/  
public class StreamTokenDemo {
	public static void main(String[] args) throws IOException {
		String fileName = "F:/ptest3.txt";
		StreamTokenDemo.statis(fileName);
	}
	private static long statis(String fileName) throws IOException {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(fileName);
			//创建分析给定字符流的标记生成器 
			StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(fileReader));
			//ordinaryChar方法指定字符参数在此标记生成器中是“普通”字符
			streamTokenizer.ordinaryChar('\'');
			streamTokenizer.ordinaryChar('\"');
			streamTokenizer.ordinaryChar('/');
			
			String s;
			int numberSum = 0;
			int wordSum = 0;
			int symbolSum = 0;
			int total = 0;
			//nextToken方法读取下一个Token
			//TT_EOF指示已读到流末尾的常量
			while(streamTokenizer.nextToken() != StreamTokenizer.TT_EOF) {
				//在调用 nextToken 方法之后，ttype字段将包含刚读取的标记的类型
				switch(streamTokenizer.ttype) {
				//TT_EOL指示已读到行末尾的常量
				case StreamTokenizer.TT_EOL:
					break;
				//TT_NUMBER指示已读到一个数字标记的常量
				case StreamTokenizer.TT_NUMBER:
					s = String.valueOf(streamTokenizer.nval);
					System.out.println("数字有："+s);
					numberSum++;
					break;
					
				//TT_WORD指示已读到一个文字标记的常量  
                case StreamTokenizer.TT_WORD:  
                    //如果当前标记是一个文字标记，sval字段包含一个给出该文字标记的字符的字符串  
                    s = streamTokenizer.sval;  
                    System.out.println("单词有： "+s);  
                    wordSum ++;  
                    break;  
                
                default:  
                    //如果以上3中类型都不是，则为英文的标点符号  
                    s = String.valueOf((char) streamTokenizer.ttype);  
                    System.out.println("标点有： "+s);  
                    symbolSum ++;  
				}
			}
			System.out.println("数字有 " + numberSum+"个");  
            System.out.println("单词有 " + wordSum+"个");  
            System.out.println("标点符号有： " + symbolSum+"个");  
            total = symbolSum + numberSum +wordSum;  
            System.out.println("Total = " + total);  
            return total; 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return -1;
		} finally {
			if(fileReader != null) {
				fileReader.close();
			}
		}
	}
}
