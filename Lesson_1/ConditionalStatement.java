public class ConditionalStatement {
	public static void main(String[] args) {
		
		int age = 30;
		boolean man = true;
		float height = 1.81f;
		char firstNameLetter = 'К';

		if(age > 20){
			System.out.println("Отличный возраст, чтобы начать всё сначала: " + age + " лет.");
		}

		if(man) {
			System.out.println("МУЖИК!");
		}

		if(!man) {
			System.out.println("НЕ МУЖИК!");
		}

		if(height > 1.80){
			System.out.println("Высокий. Рост: " + heigth + "м");
		}
		else{
			System.out.println("Не очень высокий. Рост: " + heigth + "м");
		}

		if(firstNameLetter == 'M'){
			System.out.println("Первая буква имени: " + firstNameLetter);
		}
		else if(firstNameLetter == 'И'){
			System.out.println("Первая буква имени: " + firstNameLetter);
		}
		else{
			System.out.println("Первая буква имени: " + firstNameLetter);
		}
	}
}