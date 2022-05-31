package java_20220531_2;

public class Box<T> {
	private T t;
	public T get() {return t;}
	public void set(T t) {this.t = t;}
	
	public static void main(String[] args) {
		
		Box<String> box = new Box<String>();
		box.set("hello");
		
		String str = box.get()	;
		Box<Integer> box1 = new Box<>();
		box1.set(6);
		int v =box1.get();
		System.out.println(v);
		System.out.println(str);
	}

}
