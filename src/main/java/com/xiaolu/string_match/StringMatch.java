package com.xiaolu.string_match;

public class StringMatch {

    /**
     * @param p name
     * @param t article
     * @return -1 no match. 1 match.
     */
    public static int findMatch(String p, String t) {
        char[] pA = p.toCharArray();
        char[] tA = t.toCharArray();

        int i, j; // i is the offset counter for t, j is the match counter

        int m = pA.length;
        int n = tA.length;

        for (i = 0; i < n - m; i++) {
            j = 0;
            while ((j < m) && tA[i+j] == pA[j])
                j++;
            if (j == m)
                return 1;
        }

        return -1;
    }
}
