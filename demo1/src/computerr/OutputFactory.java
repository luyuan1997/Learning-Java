package computerr;

import Lee.Output;
import printer.Printer;

public class OutputFactory {
	public Output getOutput() {
		return new Printer();
	}
	public static void main(String[] args) {
		OutputFactory of = new OutputFactory();
		Computer c = new Computer(of.getOutput());
		c.keyIn("轻量级java ee企业应用实战");
		c.keyIn("疯狂java讲义");
		c.print();
	}
}
