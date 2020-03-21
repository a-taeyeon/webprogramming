/* 컴퓨터학과 20180981 안태연 (크롬최적화) */
package jspbook.pr35;

public class Calculator {
	private int op1;
	private int op2;
	private String operator;
	
	public int getOp1() {
		return op1;
	}
	public void setOp1(int op1) {
		this.op1 = op1;
	}
	public int getOp2() {
		return op2;
	}
	public void setOp2(int op2) {
		this.op2 = op2;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	public int calc() {
		int result = 0;
		
		switch(operator) {
		case "+":
			result = add(op1, op2);
			break;
		case "-":
			result = sub(op1, op2);
			break;
		case "*":
			result = mult(op1, op2);
			break;
		case "/":
			result = div(op1, op2);
			break;
		}
		
		return result;
	}
	
	private int add(int a, int b) {
		return a + b;
	}
	private int sub(int a, int b) {
		return a - b;
	}
	private int mult(int a, int b) {
		return a * b;
	}
	private int div(int a, int b) {
		return a / b;
	}
}
