package Problem3;

public interface MyCollection <T>
{
	boolean isEmpty();
	
	boolean add(T t);
	boolean remove(T t);

	boolean contains(T t);
	
	boolean equals(Object o);
	int hashCode();
	
	int size();
	
 	void clear();
}