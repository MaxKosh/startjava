public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 30;
		if(age > 20) {
			System.out.println("Отличный возраст, чтобы начать всё сначала: " + age + " лет.");
		}

		boolean isMan = true;
		if(isMan) {
			System.out.println("МУЖИК!");
		}
		if(!isMan) {
			System.out.println("НЕ МУЖИК!");
		}

		float height = 1.81f;
		if(height > 1.80) {
			System.out.println("Высокий. Рост: " + height + "м");
		} else {
			System.out.println("Не очень высокий. Рост: " + height + "м");
		}

		char firstNameLetter = 'К';
		if(firstNameLetter == 'M') {
			System.out.println("Первая буква имени: " + firstNameLetter);
		} else if(firstNameLetter == 'И') {
			System.out.println("Первая буква имени: " + firstNameLetter);
		} else {
			System.out.println("Первая буква имени: " + firstNameLetter);
		}
	}
}