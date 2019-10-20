public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf = new Wolf();

		wolf.name = "Wolfy";
		wolf.sex = "male";
		wolf.weight = 40;
		wolf.height = 0.9f;
		wolf.color = "grey";

		wolf.toWalk();
		wolf.toSit();
		wolf.toRun();
		wolf.toHunt();

		System.out.println("Wolf name: " + wolf.name + "\nWolf sex: " + wolf.sex + 
			"\nWolf weight: " + wolf.weight + "\nWolf height: " + wolf.height +
			"\nWolf color: " + wolf.color);

		System.out.println("How does the " + wolf.name + " howl?\n" + wolf.name + ": " + wolf.toHowl());

	}
}