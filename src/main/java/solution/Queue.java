package solution;

public interface Queue {
	void enqueue(Object elem);
	Object dequeue();
	boolean empty();
}