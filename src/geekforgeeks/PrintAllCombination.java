package geekforgeeks;

import java.util.List;

class PrintAllCombination {
	public static void main(String[] args) {
		new PrintAllCombination().run();
	}
	
	int N = 5;
	int[] arr = {2, 3, 5, 7};
	int[] vals = new int[N];
	
	void run(){
		printCombinations(N, 0, 0);
	}
	
	// from : consider numbers in arr from index "from"
	// index: add new number in array vals at index "index"
	void printCombinations(int target, int from, int index){
		//System.out.println(target);
		if(target==0){
			for(int i=0; i<index; i++){
				System.out.print(vals[i] + " ");
			}
			System.out.println();
		}else if(target<0 || from>=arr.length){
			return;
		}else {
			vals[index] = arr[from];
			// take arr[from] in set
			printCombinations(target-arr[from], from, index+1);
			
			// dont take arr[from] in set
			printCombinations(target, from+1, index);
		}
	}
}