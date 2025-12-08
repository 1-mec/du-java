package ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class tableau {
	public static void main(String[] args) {
		Point t[] = { new Point(1, 2), new Point(1, 2), new Point(-1, 4), new Point(3, 2), new Point(-1, 2)};
		
		Stream.of(t).filter(e -> e.getX() > 0).forEach(System.out::println);
		System.out.println("----------------------------");
		List<Integer> p = Arrays.asList(1,5,-9,12,8) ;
		p.stream().map(e -> new Point(e , e*2)).forEach(System.out::println);
		
		
		}
		
}
