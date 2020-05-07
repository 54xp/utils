/**
 * @author xp
 * @create 2020-05-07 16:16
 */

public class test {
    public static void main(String[] args) {
		String phone = "13257308205"; // 此处可输入你的手机号码进行测试
	    String code = PhoneCode.getPhonemsg(phone);
		System.out.println("验证码：==="+code);
    }
}
