public class Cycle {
	public static void main(String[] args) {
		
		//Выводим все числа от [0, 20]
		for(int i = 0; i <= 20; i++){
			System.out.println(i);
		}

		//Выводим все числа от [6, -6] с шагом 2
		int j = 6;
		while(j >= -6){
			System.out.println(j);
			j = j - 2;
		}

		//Выводим сумму нечетных чисел [10, 20]
		int k = 10;
		int sum = 0;
		do {
			if(k % 2 != 0) {
				sum = sum + k;
			}
			k++;
		}
		while(k <= 20);
		System.out.println(sum);
	}
}