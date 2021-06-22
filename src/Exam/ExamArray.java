package Exam;

import java.util.ArrayList;
import java.util.List;

public class ExamArray {
	public static void main(String[] args) {
		// ArrayList 컬렉션 생성
		List<String> arr = new ArrayList<String>();
		
		// ArrayList 입력
		// add(추가 할 요소)
		arr.add("배유빈");
		// ArrayList 출력 - 단일 출력
		System.out.println(arr.get(0));
		
		arr.add("김지호");
		System.out.println(arr.get(1));
		
		// ArrayList 모든 데이터 출력 - arr가 소진될때까지 s로 넘긴다.
		for(String s : arr) {
			System.out.println(s);
		}
//		위의 출력문과 같은 결과값
//		for(int i=0;i<arr.size();i++) {
//			System.out.println(arr.get(i));
//		}
		
		// ArrayList 중간 데이터 입력 - 사이에 들어감
		// add(index값, 추가 할 요소)
		arr.add(1, "유시아");
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		// ArrayList 데이터 수정
		arr.set(1, "최아린");
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		// 객체 저장 여부 확인 - true or false
		System.out.println(arr.contains("배유빈")); // true
		System.out.println(arr.contains("유시아")); // false
		
		// 해당 인덱스에 어떤 객체가 저장되었는지 확인
		System.out.println(arr.get(1));
		
		// 컬렉션이 비어있는지 확인 - true or false
		System.out.println(arr.isEmpty()); // false
		
		// 객체생성만, 다른 추가하지 않음
		ArrayList<String> nothing = new ArrayList<>();
		System.out.println(nothing.isEmpty()); // true
		
		// 컬렉션에 저장된 객체 수 확인
		System.out.println(arr.size());
		
		// 해당 인덱스에 저장된 객체 삭제
		arr.remove(1);
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		// 해당 객체 삭제
		arr.remove("김지호");
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		// 컬렉션에 저장되어 있는 모든 객체 삭제
		arr.clear();
		
		for(String s : arr) {
			System.out.println(s);
		}
	}
}
