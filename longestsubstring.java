import java.util.*;

public class longestsubstring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLen = 0;

        for(int right = 0; right < s.length(); right++) {

            while(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println("Length = " + maxLen);
    }
}
