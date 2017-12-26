package TenTraning;

import java.util.*;

public class MobileTest {

	private static String mobile;

	public static void judgeMobile() {
		if (mobile.length() < 11 && mobile.length() > 0) {
			// 抛出业务异常
			throw new MobileExeption("手机位数不对!");
		} else if (mobile == null || mobile.length() <= 0)// 手机号码不能为空
		{
			throw new MobileExeption("手机号不能为空!");
		} else if(mobile.matches("^[a-zA-Z]+$"))
		{
			throw new MobileExeption("手机号必须为数字!");
		}
		else if (mobile.matches("^[0-9]*$"))// 手机号码里必须为数字。。。。。
		{
			System.out.println("输入正确!");
			System.out.println("手机号码为: " + mobile);  //输出手机号码

		} else {
			throw new MobileExeption("手机号必须为数字!");
		}

	}

	public static void main(String[] args) {

		System.out.println("请输入手机号码: ");
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
