package ex2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class truc {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(8,13,17,54,-32,-4,0,2,6,-1,-27);
		List<Integer> l2 = l.stream().filter(e -> (e % 2)==0).map(e -> e * e ).limit(5).collect(Collectors.toList());
		l2.stream().forEach(System.out::println);
		System.out.println("--------------------------------------");
		l2.stream().forEach(e-> System.out.println(e +" et " + -e));
	}
}
