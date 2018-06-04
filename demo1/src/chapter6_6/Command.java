package chapter6_6;

public interface Command {
	//接口里定义的process方法用于封装“处理行为”
	void process(int[] target);
}
