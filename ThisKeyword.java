package learning.encapsiulation;
class Test{
	int i;
	void  setValue(int i) {
		this.i=i;   //this refers to current class object
		            //i=i;//default value print
	}
	void show() {
		System.out.println(i);
	}
}
class ThisKeyword {

	public static void main(String[] args) {
		Test t=new Test();
		t.setValue(34);
		t.show();
		

	}

}
