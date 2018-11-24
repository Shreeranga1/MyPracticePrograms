package Practice;

import java.util.function.Predicate;

public class PredicatePractice {

	public static void main(String[] args) {
		Predicate<String> p=(s)->s.startsWith("R");
		Predicate<String> p1=(s)->s.endsWith("A");
		System.out.println(p.and(p1).test("RangaA"));

	}

}
