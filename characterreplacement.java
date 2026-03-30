import java.util.Scanner;

public class characterreplacement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for(int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            freq[ch - 'A']++;

            maxFreq = Math.max(maxFreq, freq[ch - 'A']);

            while((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println("Length = " + maxLen);
    }
}
