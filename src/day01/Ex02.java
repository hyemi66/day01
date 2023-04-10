package day01;

public class Ex02 {
	public static void main(String[] args) {
		// escape문자
		// - 문자열 안에서 특수한 기능을 하는것
		// - 문자열은 " "(큰따옴표)로 묶여있는 값들
		// - \n : enter와 비슷
		// - \t : tab(스페이스바 8칸정도)만큼 오른쪽으로 이동
		// - \\ : \하나 표현
		// - \', \" : ', "하나 표현
		
		System.out.println("안\n녕\n하세요");
		System.out.println("1\t1234567\t12345678\t1");
		System.out.println("이름\t나이");
		System.out.println("홍길동\t20살");
		
		System.out.println("\\");
		System.out.println("\', \"");
	}
}
