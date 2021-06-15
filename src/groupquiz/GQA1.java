package groupquiz;

import java.util.Scanner;

//1. ���� ȣ�� ���� ���α׷� ������
//2. ���� ���� ȣ�ڰ� ȣ�ڸ��� �ٸ� ���� ����, �� ȣ�ڿ� ���� ������ �Է��Ͽ� ������ �� �ֵ��� - ���� �Խ� ������ ����
//3. �Խǰ� ��Ƿ� �̷���� ������, �Խ��� �Ǿ� ������ �ٸ� ����� �Խ��� �� ����, ��ǵǾ� ��� �ִ� �濡�� ��� �� �� ����.
//4. �Խ��� ���� ��� ����, ��ǵ� ���� �Խ� ����.
//5. �޴��� �Ʒ��� ����.
//- �Խ� : �濡 �Խ��� ó��
//- ��� : �濡 ����� ó��
//- �˻� : �濡 �Խǰ� ��� ���� Ȯ��
//- ���� ������ : �Խ��� �հ� ����� ���� �˷��ִ� ���
//- ���α׷� ���� : ���α׷� ����
public class GQA1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // �� �Է¹ޱ�
		boolean room[];
		
		int checkin = 0; // �Խ��� ���� �����ϱ� ���� ����
		int checkout = 0; // ����� ���� �����ϱ� ���� ����
		int price = 0; // ������ ���� �����ϱ� ���� ����
		
		System.out.println("���� ȣ���� �� ���� �Է� : ");
		int roomNum = sc.nextInt();
		room = new boolean[roomNum]; // ���� ������ ����
		// ������ ������ ��, ������ �迭�� (������ ���� ����)
		
		System.out.println("�����ϴ� ���� ��ȣ �Է� : ");
		int startRoom = sc.nextInt();
		
		main:while(true ) {
			System.out.println("1.�Խ� 2.��� 3.�˻� 4.���� ������ 0.���α׷� ����");
			System.out.println("�޴� ���� : ");
			int select = sc.nextInt(); // �޴� ���� ����
			
			switch(select) {
			case 1:
				System.out.println("�Խ��� �� ��ȣ �Է� : ");
				roomNum = sc.nextInt(); // �� ��ȣ ����
				if(room[roomNum-startRoom] == true) {
					System.out.println("�Խ��Ͻ� �� �����ϴ�.");
				} else {
					System.out.println("�ԽǵǾ����ϴ�.");
					room[roomNum-startRoom] = true; // �Խ� ó��
					checkin++;
					price += 50000;
				}
				break;
			case 2:
				System.out.println("����� �� ��ȣ �Է� : ");
				roomNum = sc.nextInt(); // �� ��ȣ ����
				if(room[roomNum-startRoom] == false) {
					System.out.println("����Ͻ� �� �����ϴ�.");
				} else {
					System.out.println("��ǵǾ����ϴ�.");
					room[roomNum-startRoom] = false; // ��� ó��
					checkout++;
				}
				break;
			case 3:
				for(int i=0;i<room.length;i++) {
					if(room[i] == true) {
						System.out.println((startRoom+i) + "ȣ �Խ� �Ǿ� �ֽ��ϴ�.");
					} else {
						System.out.println((startRoom+i) + "ȣ ��� �ִ� ���Դϴ�.");
					}
				}
				break;
			case 4:
				System.out.println("### ���� ������ ###");
				System.out.println("�Խ� : " + checkin);
				System.out.println("��� : " + checkout);
				System.out.println("�� ���� : " + price);
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				break main;
			default:
				System.out.println("���õ� �޴��� �����ϴ�.");
			}
		}
	}
}
