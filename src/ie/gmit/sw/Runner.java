package ie.gmit.sw;

public class Runner {
	
	private Searches searches;
	private InitialiseTree initialiseTree;
	
	public static void main(String[] args) {
		new Runner();
	}

	public Runner() {
		
		Node root = new Node();
		searches = new Searches();
		initialiseTree = new InitialiseTree();
		initialiseTree.init(root);
		
		System.out.println("*****The Language Family Tree*****");
		searches.depthFirstSearch(root, 0);
		System.out.println();
		
		System.out.println("*****The DFS ordering******");
		searches.stackDFS(root);
	}
}