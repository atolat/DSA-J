package DijkstraInterpreter;

public class Main {

	public static void main(String[] args) {
		Algorithm myAlgo = new Algorithm();
		
		myAlgo.processExpression("( ( 1 + 2 ) * ( 2 + 3 ) )");
		myAlgo.getResult();
	}
}
