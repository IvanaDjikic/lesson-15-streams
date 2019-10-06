package exercises;

import java.util.function.Consumer;

public class _1_SpiceWorld {
	/*
	 * Replace the anonymous inner class with a lambda expression.
	 */

	static Consumer<Integer> performMethod = (x) -> System.out.println("Do backflips");

	public static void main(String[] args) {
		SpiceGirl sporty = new SpiceGirl();
		sporty.setPerformingMethod(performMethod);
		sporty.perform();
	}
}

class SpiceGirl {
	private Consumer<Integer> performingMethod;

	void setPerformingMethod(Consumer<Integer> performingMethod) {
		this.performingMethod = performingMethod;
	}

	void perform() {
		performingMethod.accept(0);
	}
}
