
public class Array {

	public static void main(String[] args) {

		int[][] array = new int[5][10];

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {
				
				array[i][j] = j + i + 1;
				
				System.out.print(array[i][j]);	
			}
			
			System.out.println();
		}	
	}
	
}

