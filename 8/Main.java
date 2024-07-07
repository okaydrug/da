/*
В тексте определить все согласные буквы, встречающиеся не более чем в двух словах.
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String text = "ВСЁ ЖИВОЕ БОИТСЯ МУЧЕНИЯ, ВСЁ ЖИВОЕ БОИТСЯ СМЕРТИ; ПОЙМИ САМОГО СЕБЯ ВО ВСЯКОМ ЖИВОМ СУЩЕСТВЕ, НЕ МУЧАЙ И НЕ УБИВАЙ, НЕ ПРИЧИНЯЙ СТРАДАНИЙ И СМЕРТИ.";
        Map<Character, Set<String>> consonantToWordsMap = new HashMap<>();
        String consonants = "бвгджзйклмнпрстфхцчшщ";
        String[] words = text.toLowerCase().split("\\s+");
        for (String word : words) {
            Set<Character> uniqueConsonantsInWord = new HashSet<>();
            for (char ch : word.toCharArray()) {
                if (consonants.indexOf(ch) != -1) {
                    uniqueConsonantsInWord.add(ch);
                }
            }
            for (char consonant : uniqueConsonantsInWord) {
                consonantToWordsMap.computeIfAbsent(consonant, k -> new HashSet<>()).add(word);
            }
        }
        consonantToWordsMap.forEach((consonant, wordsSet) -> {
            if (wordsSet.size() <= 2) {
                System.out.println("Согласная буква \"" + consonant + "\" встречается не более чем в двух словах: " + wordsSet);
            }
        });
    }
}




