package interviewcode;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next().toString();
		SortNumber(s);
	}

	static void SortNumber(String s) {
		int length = s.length();
		if (length < 0)
			return;
		else {
			String[] arr = s.split(",");
			int[] num = new int[arr.length];
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < arr.length; i++)
				num[i] = Integer.parseInt(arr[i]);
			Arrays.sort(num);
			boolean[] show = new boolean[num.length];
			show[0] = true;
			show[arr.length - 1] = true;
			int old = num[0];
			for (int i = 1; i < num.length; i++) {
				if (old + 1 == num[i])
					show[i] = false;
				else {
					show[i] = true;
					show[i - 1] = true;
				}
				old = num[i];
			}
			for (int i = 0; i < num.length - 1; i++) {
				if (show[i] == true)
					sb.append(num[i] + ",");
			}
			sb.append(num[num.length - 1]);
			System.out.print(sb.reverse());
		}
	}
}
