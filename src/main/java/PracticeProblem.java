import java.util.Arrays;

public class PracticeProblem {

	public static void main(String args[]) {
		String[] arr = { "a", "b", "D", "c", "help", "me", "you", "fool" };
		System.out.println(Arrays.toString(arr));

		bubbleSortString(arr);
	}

	public static void q1() {
		//Write question 1 code here
	}

	public static void q2() {
		//Write question 2 code here
	}

	public static void q3() {
		//Write question 3 code here
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}

	public static void bubbleSortString(String[] strings){
		//iterate the upper bound of times 

		for(int i = 0; i < strings.length; i++){

			//Single bubble sort iteration

			//has swapped flag
			boolean swap = false;

			for(int j = 0; j < strings.length-1;j++){
				
				//System.out.println("Squah");

				if(strings[j].toLowerCase().compareTo(strings[j+1].toLowerCase()) > 0){
					//System.out.println("hit");
					//if current comes later than current+1, swap the two
					
					String temp = strings[j+1];
					strings[j+1] = strings[j];
					strings[j] = temp;
					swap = true;
				}
			}

			if(!swap){
					//break loop if never swapped
					i = strings.length;
				}
		}
	}

}
