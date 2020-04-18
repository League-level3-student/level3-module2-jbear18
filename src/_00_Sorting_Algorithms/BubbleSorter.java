package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		        int n = array.length;  
		        int temp = 0;  
		         for(int i=0; i < n; i++){  
		                 for(int j=1; j < (n-i); j++){  
		                          if(array[j-1] > array[j]){  
		                                 //swap elements  
		                                 temp = array[j-1];  
		                                 array[j-1] = array[j];  
		                                 array[j] = temp;  
		                         }  
		                          
		                 }  
		                 display.updateDisplay();
		         }  
		  
		    }  
	
}
