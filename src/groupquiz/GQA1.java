package groupquiz;

import java.util.Scanner;

//1. 나는 호텔 관리 프로그램 개발자
//2. 여러 개의 호텔과 호텔마다 다른 방의 갯수, 각 호텔에 방의 갯수를 입력하여 관리할 수 있도록 - 방의 입실 가격은 자유
//3. 입실과 퇴실로 이루어져 있으며, 입실이 되어 있으면 다른 사람이 입실할 수 없고, 퇴실되어 비어 있는 방에는 퇴실 할 수 있음.
//4. 입실한 방은 퇴실 가능, 퇴실된 방은 입실 가능.
//5. 메뉴는 아래와 같음.
//- 입실 : 방에 입실을 처리
//- 퇴실 : 방에 퇴실을 처리
//- 검색 : 방에 입실과 퇴실 여부 확인
//- 관리 페이지 : 입실의 합과 퇴실의 합을 알려주는 기능
//- 프로그램 종료 : 프로그램 종료
public class GQA1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 값 입력받기
		boolean room[];
		
		int checkin = 0; // 입실의 합을 저장하기 위해 설정
		int checkout = 0; // 퇴실의 합을 저장하기 위해 설정
		int price = 0; // 사용료의 합을 저장하기 위해 설정
		
		System.out.println("현재 호텔의 방 갯수 입력 : ");
		int roomNum = sc.nextInt();
		room = new boolean[roomNum]; // 방의 갯수를 지정
		// 층까지 구분할 시, 이차원 배열로 (행으로 층을 구분)
		
		System.out.println("시작하는 방의 번호 입력 : ");
		int startRoom = sc.nextInt();
		
		main:while(true ) {
			System.out.println("1.입실 2.퇴실 3.검색 4.관리 페이지 0.프로그램 종료");
			System.out.println("메뉴 선택 : ");
			int select = sc.nextInt(); // 메뉴 선택 저장
			
			switch(select) {
			case 1:
				System.out.println("입실할 방 번호 입력 : ");
				roomNum = sc.nextInt(); // 방 번호 저장
				if(room[roomNum-startRoom] == true) {
					System.out.println("입실하실 수 없습니다.");
				} else {
					System.out.println("입실되었습니다.");
					room[roomNum-startRoom] = true; // 입실 처리
					checkin++;
					price += 50000;
				}
				break;
			case 2:
				System.out.println("퇴실할 방 번호 입력 : ");
				roomNum = sc.nextInt(); // 방 번호 저장
				if(room[roomNum-startRoom] == false) {
					System.out.println("퇴실하실 수 없습니다.");
				} else {
					System.out.println("퇴실되었습니다.");
					room[roomNum-startRoom] = false; // 퇴실 처리
					checkout++;
				}
				break;
			case 3:
				for(int i=0;i<room.length;i++) {
					if(room[i] == true) {
						System.out.println((startRoom+i) + "호 입실 되어 있습니다.");
					} else {
						System.out.println((startRoom+i) + "호 비어 있는 방입니다.");
					}
				}
				break;
			case 4:
				System.out.println("### 관리 페이지 ###");
				System.out.println("입실 : " + checkin);
				System.out.println("퇴실 : " + checkout);
				System.out.println("총 매출 : " + price);
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break main;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
		}
	}
}
