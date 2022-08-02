package learning.encapsiulation;
class A{
	int  i=90;
}

public class SuperKeyword extends A{
	int i=89;
	void show(int i ){
		//System.out.println(this.i);this---refer to current class object.
		System.out.println(super.i); //super---refer to parent class object .
		
	}

	public static void main(String[] args) {
		SuperKeyword k=new SuperKeyword();
		k.show(89);
		
		 
	}

}
