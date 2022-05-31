package java_20220531_2;

public class Test<T,M> {
	private T kind;
	private M model;
	
	public T getKind() {return this.kind;}
	public M getModel() {return this.model;}
	
	public void setKind(T kind) {this.kind = kind;}
	public void setModel(M model) {this.model = model;}
	
	
	public static void main(String[] args) {
		
		
		Test<Tv, String> test = new Test<Tv,String>();
		
		
		
	}

}
