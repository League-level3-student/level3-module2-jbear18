package _02_More_Algorithms;

import java.util.List;

import _00_Sorting_Algorithms.SortingVisualizer;

public class Algorithms {
    public static int findBrokenEgg(List<String> eggs) {
        for(int i=0; i<eggs.size();i++) {
            if(eggs.get(i).equals("cracked")) {
            return i;    
            }
        }
        return 0;
    }

public static int countPearls(List<Boolean>oysters) {
    for(int i=0; i<oysters.size(); i++) {
        if(oysters.get(i)== true) {
        return i;
        }
    }
    return 0;
}

public static double findTallest(List<Double> peeps) {
    double tallest= 0;
    for(int i=0; i<peeps.size(); i++) {
        if(peeps.get(i)>tallest) {
            tallest=peeps.get(i);
        }
    }
    return tallest;    
}

public static Object findLongestWord(List<String> words) {
  String longestWord=null;
    for(String word: words) {
    	if(longestWord==null||word.length()>longestWord.length()) {
    		longestWord= word;
    		
    	}
    }
    return longestWord;
    }

public static boolean containsSOS(List<String> morseCode) {
for (int i = 0; i < morseCode.size(); i++) {
	if(morseCode.get(i).equals(" ... --- ... ")) {
		return true;
	}
}
	return false;
}

public static List<Double> sortScores(List<Double> results) {
        int n = results.size();  
       double temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(results.get(j-1)>results.get(j)){  
                                 //swap elements  
                                 temp = results.get(j-1);  
                                 results.set(j-1, results.get(j));
//                              results.add(j-1, results.get(j));
                                 results.set(j, temp);
//                                 results.add(j, temp);
                         }  
                          
                 }  
            
         }  
  return results;
    }  
}





