package TenTraning;

import java.util.*;

public class MobileTest {

	private static String mobile;

	public static void judgeMobile() {
		if (mobile.length() < 11 && mobile.length() > 0) {
			// �׳�ҵ���쳣
			throw new MobileExeption("�ֻ�λ������!");
		} else if (mobile == null || mobile.length() <= 0)// �ֻ����벻��Ϊ��
		{
			throw new MobileExeption("�ֻ��Ų���Ϊ��!");
		} else if(mobile.matches("^[a-zA-Z]+$"))
		{
			throw new MobileExeption("�ֻ��ű���Ϊ����!");
		}
		else if (mobile.matches("^[0-9]*$"))// �ֻ����������Ϊ���֡���������
		{
			System.out.println("������ȷ!");
			System.out.println("�ֻ�����Ϊ: " + mobile);  //����ֻ�����

		} else {
			throw new MobileExeption("�ֻ��ű���Ϊ����!");
		}

	}

	public static void main(String[] args) {

		System.out.println("�������ֻ�����: ");
		Scanner sc = new Scanner(System.in);
		//
		mobile = sc.nextLine();

		try {
			judgeMobile();
		} catch (MobileExeption ce) {
			System.out.println(ce.getMessage());
		}

	}

}
