package interviewcode;

//通过键盘输入一串小写字母(a~z)组成的字符串。请编写一个字符串过滤程序，若字符串中出现多个相同的字符，将非首次出现的字符过滤掉。
//比如字符串“abacacde”过滤结果为“abcde”。
import java.util.Scanner;

public class StringFilter {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		String s = input.next().toString();
		Stringfilter(s);
	}

	static void Stringfilter(String s) {
		if (s.length() == 0)
			return;
		StringBuffer sb = new StringBuffer();
		int length = s.length();
		boolean[] show = new boolean[26];
		for (int i = 0; i < 26; i++) {
			show[i] = false;
		}
		for (int i = 0; i < length; i++) {
			char c = s.charAt(i);
			if (show[c - 'a'] == false) {
				sb.append(s.charAt(i));
				show[c - 'a'] = true;
			}
		}
		System.out.print(sb);
	}
}
