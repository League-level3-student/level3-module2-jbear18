package _02_More_Algorithms;

public class test {
public static boolean contains(char[]list, char c) {
	for (int i = 0; i < list.length; i++) {
		if(list[i]==c) {
			System.out.println(i);
		}
	}
	return false;
}
}
