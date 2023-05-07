import java.util.ArrayList;
import java.util.List;

public class LeetCode17 {
    /*
      LeetCode 17 - Backtracking - Letter Combinations of a Phone Number
      https://leetcode.com/problems/letter-combinations-of-a-phone-number/
     */
    public static void main(String[] args) {
        letterCombinations("22");
    }

    public static List<String> letterCombinations(String digits) {
        if (digits == null || digits.equals(""))
            return new ArrayList<>();

        List<String> result = new ArrayList<>();

        String[] letters = new String[digits.length()];
        for (int i = 0; i < digits.length(); i++) {
            String number = String.valueOf(digits.charAt(i));
            String temp = getLetters(Integer.valueOf(number));
            letters[i] = temp;
        }

        backtrack(result, new ArrayList<>(), letters, 0, digits.length());
        return result;
    }

    private static void backtrack(List<String> result,
                                  List<String> selected,
                                  String[] letters,
                                  int level,
                                  int size) {
        if (level == size) {
            result.add(selected.toString()
                    .replace(",","")
                    .replace(" ", "")
                    .replace("[", "")
                    .replace("]",""));
            return;
        }

        for (int i = 0; i < letters[level].length(); i++) {
            // a b c
            String temp = String.valueOf(letters[level].charAt(i));
            selected.add(temp);
            backtrack(result, selected, letters, level + 1, size);
            selected.remove(selected.size() - 1);
        }
    }

    private static String getLetters(int number) {
        switch (number) {
            case 2 -> {
                return "abc";
            }
            case 3 -> {
                return "def";
            }
            case 4 -> {
                return "ghi";
            }
            case 5 -> {
                return "jkl";
            }
            case 6 -> {
                return "mno";
            }
            case 7 -> {
                return "pqrs";
            }
            case 8 -> {
                return "tuv";
            }
            case 9 -> {
                return "wxyz";
            }
        }

        return null;
    }
}
