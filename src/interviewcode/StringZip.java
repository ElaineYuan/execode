package interviewcode;

/*通过键盘输入一串小写字母(a~z)组成的字符串。请编写一个字符串压缩程序，将字符串中连续出席的重复字母进行压缩，并输出压缩后的字符串。
 压缩规则：
 1、仅压缩连续重复出现的字符。比如字符串"abcbc"由于无连续重复字符，压缩后的字符串还是"abcbc"。
 2、压缩字段的格式为"字符重复的次数+字符"。例如：字符串"xxxyyyyyyz"压缩后就成为"3x6yz"。*/
import java.util.Scanner;

public class StringZip {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		String s = input.next().toString();
		System.out.print(Stringzip(s));
	}

	static String Stringzip(String s) {
		String output = null;
		s = s + "*";
		int length = s.length();
		StringBuffer sb = new StringBuffer();
		int count = 1;
		int temp = 0;

		char old = s.charAt(0);
		for (int i = 1; i < length; i++) {
			if (s.charAt(i) == old)
				count++;
			else {
				if (count > 1)
					sb.append(count + String.valueOf(s.charAt(temp)));
				else {
					sb.append(String.valueOf(s.charAt(temp)));
				}
				count = 1;
				temp = i;
				old = s.charAt(i);
			}
		}
		output = sb.toString();
		return output;
	}
}
