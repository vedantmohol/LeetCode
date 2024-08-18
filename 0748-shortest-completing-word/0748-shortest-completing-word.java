public class Solution {

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character, Integer> plateMap = createCharFrequencyMap(licensePlate.toLowerCase());

        String shortestWord = null;

        for (String word : words) {
            Map<Character, Integer> wordMap = createCharFrequencyMap(word.toLowerCase());

            if (isCompletingWord(plateMap, wordMap)) {
                if (shortestWord == null || word.length() < shortestWord.length()) {
                    shortestWord = word;
                }
            }
        }

        return shortestWord;
    }

    private static Map<Character, Integer> createCharFrequencyMap(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        return map;
    }

    private static boolean isCompletingWord(Map<Character, Integer> plateMap, Map<Character, Integer> wordMap) {
        for (Map.Entry<Character, Integer> entry : plateMap.entrySet()) {
            char letter = entry.getKey();
            int requiredCount = entry.getValue();
            if (wordMap.getOrDefault(letter, 0) < requiredCount) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the license plate: ");
        String licensePlate = scanner.nextLine();

        System.out.print("Enter the number of words: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] words = new String[n];
        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }

        String result = shortestCompletingWord(licensePlate, words);
        System.out.println("Shortest Completing Word: " + result);

        scanner.close();
    }
}
