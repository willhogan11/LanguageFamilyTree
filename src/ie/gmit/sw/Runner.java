package ie.gmit.sw;

public class Runner {
	
	private Stack<Node> stack = new Stack<Node>();
	private InitialiseTree initialiseTree;
	
	public static void main(String[] args) {
		new Runner();
	}

	public Runner() {
		Node root = new Node();
		initialiseTree = new InitialiseTree();
		initialiseTree.init(root);
		depthFirstSearch(root, 0);
		System.out.println();
		stackDFS(root);
	}
	

	public void stackDFS(Node root){
		
		stack.push(root);
		
		while(!stack.isEmpty()){
			Node node = stack.pop();
			System.out.println(node.getLanguage().getLanguage());
			
			Node[] children = node.children();
			for (int i = 0; i < children.length; i++) {
				stack.push(children[i]);
			}
		}
	}
	
	
	public void depthFirstSearch(Node node, int index){
		for (int i = 1; i <= index; i++){
			System.out.print("\t"); 
		}
		System.out.println(node.getLanguage().getLanguage());
		
		Node[] children = node.children();
		for (int i = 0; i < children.length; i++) {
			Node next = children[i];
			depthFirstSearch(next, index + 1);
		}
	}
}