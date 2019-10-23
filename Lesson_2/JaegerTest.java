public class JaegerTest {
	public static void main(String[] args) {
		Jaeger сhernoAlpha = new Jaeger();
		
		сhernoAlpha.setModelName("Cherno Alpha");
		сhernoAlpha.setMark("Mark-1");
		сhernoAlpha.setOrigin("Russia");
		сhernoAlpha.setHeight(85.34f);
		сhernoAlpha.setWeight(2.412f);
		сhernoAlpha.setSpeed(3);
		сhernoAlpha.setStrength(10);
		сhernoAlpha.setArmor(10);

		System.out.println("Model Name: " + сhernoAlpha.getModelName() + "\nMark: " + сhernoAlpha.getMark() +
			"\nOrigin: " + сhernoAlpha.getOrigin());
		System.out.println(сhernoAlpha.getModelName() + ": " + сhernoAlpha.scanKaiju());

		if(сhernoAlpha.drift()) {
			System.out.println(сhernoAlpha.getModelName() + ": Control is synchronized");
		} else {
			сhernoAlpha.setSpeed(0);
			System.out.println(сhernoAlpha.getModelName() + ": Speed = " + сhernoAlpha.getSpeed());
		}

		System.out.println("");

		Jaeger coyoteTango = new Jaeger();

		coyoteTango.setModelName("Coyote Tango");
		coyoteTango.setMark("Mark-1");
		coyoteTango.setOrigin("Japan");
		coyoteTango.setHeight(85.34f);
		coyoteTango.setWeight(2.312f);
		coyoteTango.setSpeed(5);
		coyoteTango.setStrength(7);
		coyoteTango.setArmor(4);

		System.out.println("Model Name: " + coyoteTango.getModelName() + "\nMark: " + coyoteTango.getMark() +
			"\nOrigin: " + coyoteTango.getOrigin());
		System.out.println(coyoteTango.getModelName() + ": " + coyoteTango.scanKaiju());
	}
}