package ie.gmit.sw;

public interface Stackable<E> {
	public abstract int size();
	public abstract boolean isEmpty();
	public abstract boolean push(E o);
	public abstract E pop();
	public abstract E peek();
}