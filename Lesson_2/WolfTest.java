public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf = new Wolf();

		wolf.setName("Wolfy");
		wolf.setSex("male");
		wolf.setWeight(40);
		wolf.setAge(10);
		wolf.setColor("grey");

		wolf.walk();
		wolf.sit();
		wolf.run();
		wolf.hunt();

		System.out.println("Wolf name: " + wolf.getName() + "\nWolf sex: " + wolf.getSex() + 
			"\nWolf weight: " + wolf.getWeight() + "\nWolf age: " + wolf.getAge() +
			"\nWolf color: " + wolf.getColor());

		System.out.println("How does " + wolf.getName() + " howl?\n" + wolf.getName() + ": " + wolf.howl());

	}
}