public class Person {
	String name = "Max";
	String sex = "man";
	float height = 1.81f;
	int weight = 82;
	int age = 31;

	public void toWalk() {

	}

	public void toSit() {

	}

	public void toRun() {

	}

	public String toTalk() {
		return "I'm ready to talk with you, man.";
	}

	public void toLearnJava() {

	}

	public static void main(String[] args) {
		Person manOne = new Person();

		System.out.println(manOne.toTalk());
	}
}