package ex3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class transfo {
		public static void main(String[] args) {
			List<Integer> l = Arrays.asList(8,13,17,54,-32,-4,0,2,6,-1,-27);
			
			l.stream().forEach(e-> {
				if ((e % 2 ) != 0) {
					System.out.println("i"+e);
				}else {
					System.out.println("p"+e);
				}
			});
			System.out.println("----------------------------");

			List<String> l2 = Arrays.asList("oui oui oui","non non non","bilard baulard","feur","feur","feur","feur","feur","feur","feur","feur","feur","feur","feur","feur","feur");
			l2.stream().forEach(System.out::print);
			List<String> l3 = l2.stream().map(e -> e + "|").collect(Collectors.toList());
		}

}
