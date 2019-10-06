package exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class AlgorithmsUsingStreams {

	public static long countGoodEggs(List<String> eggs) {
		return eggs.stream()				// 1. create stream
		.filter(egg -> egg.equals("whole")) // 2. intermediate filter operation
		.count();							// 3. terminal operation: reduce to an int
	}

	public static Object findTallest(List<Double> peeps) {
//		return Collections.max(peeps);
		return peeps.stream().sorted(Comparator.reverseOrder()).findFirst().get();
	}

	public static long addStringOfNumbers(String numbers) {
		return numbers
		 	.chars()		
		 	.mapToObj(c -> Character.toString(c))	
			.mapToInt(num -> Integer.parseInt(num))
			.sum();
	}
	public static long countPearls(List<Boolean> oysters) {
		return oysters.stream().filter(pearl-> pearl.equals(true)).count();
	}
	
	public static String findLongestWord(List<String> words) {
		//Collections.sort(words, (w1, w2) -> w2.length() - w1.length());
		//return words.stream().findFirst().get();
		return words.stream().sorted((w1, w2) -> w2.length() - w1.length())
		        .findFirst().get();
	}
	
	public static List<Double> sortScores(List<Double> results) {
	    //Collections.sort(results, (r1, r2) -> (int) (r1 * 100) - (int) (r2 * 100));
		//return results;
		return results.stream().sorted((r1, r2) -> (int) (r1 * 100) - (int) (r2 * 100))
		        .collect(Collectors.toList());
	}
	
	public static List<String> sortDNA(List<String> unsortedSequences) {
	//	 Collections.sort(unsortedSequences, (dna1, dna2) -> dna1.length() - dna2.length());
	//	return unsortedSequences;
		return unsortedSequences.stream().sorted((dna1, dna2) -> dna1.length() - dna2.length())
		        .collect(Collectors.toList());
	}
	
	public static List<String> sortWords(List<String> words) {
		 //Collections.sort(words, (p1, p2) -> p1.compareTo(p2));
		//return words;
		return words.stream().sorted((p1, p2) -> p1.compareTo(p2))
				.collect(Collectors.toList());
				}
		
	
	
	public static List<String> getDistinctSpellsInAlphabeticalOrder(List<String> spellsCastThisWeek) {
		return spellsCastThisWeek.stream().sorted((p1, p2) -> p1.compareTo(p2)).distinct()
        .collect(Collectors.toList());
		}
				
	
	public static String  getBatPhrases(String[] batmanScript) {
		return Arrays.deepToString(Arrays.stream(batmanScript).filter(p1 -> p1.contains("Bam") || p1.contains("Pow")).map(String::toUpperCase).map(s->s.replace(" ", "")).toArray(String[]::new));
        
		}
	public static long  countXs(String xString) {
		
		return xString.chars().mapToObj(c -> Character.toString(c)).filter(ch-> ch.equals("x")).count();
        
		}
   public static long  addEven(String numbers ) {
		
		return numbers.chars().mapToObj(c -> Character.toString(c)).mapToInt(num -> Integer.parseInt(num)).filter(ch-> ch%2==0).sum();
        
		}
   public static double  getAverage(int[] numbers) {
		
		return  Arrays.stream(numbers).average().getAsDouble();
       
		}
   public static long  countOccurrences(String[] strArr,String occ) {
		
		return Arrays.stream(strArr).filter(w-> w.equals(occ)).count();
       
		}
   
   
}
