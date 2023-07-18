package class_;

class Person {
	private String name;  // 필드, 초기화 (null)
	private int age;   // 필드,  초기화 (0)
	
	public void setName(String n){  // 
		name = n;
		
	}
	public void setAge(int a){  // 
		age = a;
		
	}
	public void setDate(String n, int a) {
		name = n;
		age = a;
	}
	public void setDate() {
		
	}
	
	public String getName(){
		return name;
		
	}
	public int getAge(){
		return age;
	}
}
//-------------
public class PersonMain {
	public static void main(String[] args) {
		Person aa = new Person();
		aa.setName("손오공");   // 동전투입구
		aa.setAge(25);
		System.out.println("객체 aa = "+ aa);   // 나오는 곳
		System.out.println(aa.getName() + "\t" + aa.getAge());
		System.out.println();
		
		
		Person bb = new Person();		
		bb.setName("라이언");
		bb.setAge(30);	
		System.out.println("객체 bb = "+ bb);   // 나오는 곳
		System.out.println(bb.getName() + "\t" + bb.getAge());
		System.out.println();
		
		Person cc = new Person();
		cc.setDate("코난", 35);
		System.out.println("객체 cc = "+ cc);   // 나오는 곳
		System.out.println(cc.getName() + "\t" + cc.getAge());
		System.out.println();
		
		Person dd = new Person();
		dd.setDate();
		System.out.println("객체 dd = "+ dd);   // 나오는 곳
		System.out.println(dd.getName() + "\t" + dd.getAge());
		System.out.println();
		
	}
}
