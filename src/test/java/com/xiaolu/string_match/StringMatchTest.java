package com.xiaolu.string_match;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringMatchTest {

    private static final String NEWS = "Starting with a sweep of the Atlantic provinces, the Liberals capitalized on what many Canadians saw as Mr. Harper’s heavy-handed style, and the party went on to capture 184 of the 338 seats in the next House of Commons. The unexpected rout occurred 47 years after Mr. Trudeau’s father, Pierre Elliott Trudeau, first swept to power.";

    @Test
    public void findMatchTest() throws Exception {
        String p = "unexpected";
        int find = StringMatch.findMatch(p, NEWS);
        assertEquals(1, find);
    }
}
