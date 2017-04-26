package ie.gmit.sw;

import java.util.ArrayList;
import java.util.List;

public class Node {

	private Node parent;
	private Language language;
	private List<Node> children = new ArrayList<Node>();
	
	public Node(){}
	
	public Node(Node parent){
		this.parent = parent;
	}
	
	public Node(Language language){
		this.language = language;
	}
	
	public Node(Node parent, Language language){
		this(parent);
		this.language = language;
	}

	public boolean add(Node parent) {
		return children.add(parent);
	}
	
	public boolean isRoot(){
		return this.parent == null;
	}

	public void clear() {
		children.clear();
	}
	
	public void addChild(Node child){
		child.setParent(this);
		children.add(child);
	}

	public Node get(int index) {
		return children.get(index);
	}

	public boolean isEmpty() {
		return children.isEmpty();
	}

	public Node remove(int index) {
		return children.remove(index);
	}

	public Node getParent() {
		return parent;
	}
	
	public void setParent(Node parent) {
		this.parent = parent;
	}
	
	public boolean hasChildren(){
		return children.size() > 0;
	}
	
	public int countChildren(){
		return this.children.size();
	}
	
	public Language getLanguage() {
		return language;
	}
	
	public void setLanguage(Language language) {
		this.language = language;
	}
	
	public Node[] children(){
		return (Node[]) children.toArray(new Node[children.size()]);
	}
}