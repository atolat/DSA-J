package DijkstraInterpreter;

import java.util.Stack;

public class Algorithm {

	// Two Stacks
	// Operation Stack
	Stack<String> operationsStack = new Stack<>();

	// Value Stack
	Stack<Double> valueStack = new Stack<>();

	public void processExpression(String expression) {
		// split expression by spaces
		String[] tokenizedExpression = expression.split(" ");

		for (String s : tokenizedExpression) {
			if (s.equals("(")) {
				// do nothing
			} else if (s.equals("*")) {
				operationsStack.push(s);
			} else if (s.equals("+")) {
				operationsStack.push(s);
			}

			else if (s.equals(")")) {
				String operation = operationsStack.pop();
				if (operation.equals("+")) {
					valueStack.push(valueStack.pop() + valueStack.pop());
				} else if (operation.equals("*")) {
					valueStack.push(valueStack.pop() * valueStack.pop());
				}

			} else {
				valueStack.push((Double.parseDouble(s)));
			}
		}
	}

	public void getResult() {
		System.out.println("Result:: " + valueStack.pop());
	}

}
