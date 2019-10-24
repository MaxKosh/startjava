public class JaegerTest {
	public static void main(String[] args) {
		Jaeger сhernoAlpha = new Jaeger("Cherno Alpha", "Mark-1", "Russia", 85.34f, 2.412f, 3, 10, 10);
				
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

		Jaeger coyoteTango = new Jaeger("Coyote Tango", "Mark-1", "Japan", 85.34f, 2.312f, 5, 7, 4);

		System.out.println("Model Name: " + coyoteTango.getModelName() + "\nMark: " + coyoteTango.getMark() +
			"\nOrigin: " + coyoteTango.getOrigin());
		System.out.println(coyoteTango.getModelName() + ": " + coyoteTango.scanKaiju());
	}
}