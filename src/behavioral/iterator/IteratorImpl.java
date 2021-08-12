package behavioral.iterator;

import java.util.Arrays;
import java.util.LinkedList;

public class IteratorImpl {

	public String iteratorList() {
		StringBuilder buffer = new StringBuilder();
		Iterable<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		for (int i : numbers) {
			buffer.append(i);
		}
		return buffer.toString();
	}

	public String iteratorLinkedList() {
		StringBuilder buffer = new StringBuilder();
		LinkedList<Integer> numbers = new LinkedList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		for (int i : numbers) {
			buffer.append(i);
		}
		return buffer.toString();
	}
}
