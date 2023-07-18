package class_;

public class Variable {
	// new 필요없음
	static int b;  // 필드, 초기화 <-클래스 꺼. 전역. 클래스 전체에서 사용가능
	static double c;
	int d;   // 얘를 찾으려면 ? new Variable(). 해줌
	
	public static void main(String[] args) {
	
		// 지역변수(local variable) <- 함수 안에 지정해서
		short a = 65;    // 0100 0001
		int b = 65;     // 
		
		System.out.println("지역변수 a = " + a);
		System.out.println("지역변수 b = " + b);
		
		System.out.println("필드 b = " + Variable.b);
		System.out.println("필드 c = " + c);
		// System.out.println("필드 d = " + new Variable().d);
		
		Variable v = new Variable();   // new 생성  <- 주소를 갖고있다. 객체
		System.out.println("객체 v = " +v);
		System.out.println("필드 d44 = " + v.d);
		
	}

}
