public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaegerChernoAlpha = new Jaeger();
		Jaeger jaegerCoyoteTango = new Jaeger();

		jaegerChernoAlpha.setModelName("Cherno Alpha");
		jaegerChernoAlpha.setMark("Mark-1");
		jaegerChernoAlpha.setOrigin("Russia");
		jaegerChernoAlpha.setHeight(85.34f);
		jaegerChernoAlpha.setWeight(2.412f);
		jaegerChernoAlpha.setSpeed(3);
		jaegerChernoAlpha.setStrength(10);
		jaegerChernoAlpha.setArmor(10);

		jaegerCoyoteTango.setModelName("Coyote Tango");
		jaegerCoyoteTango.setMark("Mark-1");
		jaegerCoyoteTango.setOrigin("Japan");
		jaegerCoyoteTango.setHeight(85.34f);
		jaegerCoyoteTango.setWeight(2.312f);
		jaegerCoyoteTango.setSpeed(5);
		jaegerCoyoteTango.setStrength(7);
		jaegerCoyoteTango.setArmor(4);

		System.out.println("Model Name: " + jaegerChernoAlpha.getModelName() + "\nMark: " + jaegerChernoAlpha.getMark() +
			"\nOrigin: " + jaegerChernoAlpha.getOrigin() + "\n");
		System.out.println("Model Name: " + jaegerCoyoteTango.getModelName() + "\nMark: " + jaegerCoyoteTango.getMark() +
			"\nOrigin: " + jaegerCoyoteTango.getOrigin() + "\n");

		System.out.println(jaegerCoyoteTango.getModelName() + ": " + jaegerCoyoteTango.scanKaiju());
		System.out.println(jaegerChernoAlpha.getModelName() + ": " + jaegerChernoAlpha.scanKaiju());

		if(jaegerChernoAlpha.drift()) {
			System.out.println(jaegerChernoAlpha.getModelName() + ": Control is synchronized");
		} else {
			jaegerChernoAlpha.setSpeed(0);
			System.out.println(jaegerChernoAlpha.getModelName() + ": Speed = " + jaegerChernoAlpha.getSpeed());
		}
	}
}