package org.example;

/* N number of people participated in a coding marathon where they were asked to solve some problems. Each problem carried 1 mark and at the end of the marathon, the total marks that each person achieved was calculated. As an organizer, you have the list of the total marks that each person achieved. You have to calculate the sum of the marks of top K scorers from the list.
Input Specification:
input1: N, Total number of participants
input2: Top scorers
input3: An array of length N with the scores of all N participants
Output Specification: Return S, sum of the marks of top K scorers from the list.

Example 1: input1: 4 input2: 2 input3: (4, 1, 2, 5)
Output: 9 Explanation: Top 2 scores are 5 and 4. Sum = 5+4=9.

Example 2: input1: 4 input2: 3 input3: {4, 3, 6, 1)
Output: 13 Explanation: Top 3 scores are 6, 4 and 3. Sum = 6+4+3=13.
*/

import java.util.Arrays;
import java.util.Scanner;

public class TopScores {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            if (!sc.hasNextInt()) return;
            int n = sc.nextInt();

            if (!sc.hasNextInt()) return;
            int k = sc.nextInt();

            long[] s = new long[n];
            for (int i = 0; i < n; i++) {
                if (sc.hasNextLong()) {
                    s[i] = sc.nextLong();
                }
            }

            Arrays.sort(s);

            long sum = 0;
            int count = 0;
            for (int i = n - 1; i >= 0 && count < k; i--) {
                sum += s[i];
                count++;
            }

            System.out.println(sum);
        }
}
