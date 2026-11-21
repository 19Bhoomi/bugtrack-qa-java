
package com.bugtrack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void newIssueShouldBeOpen() {

        Issue bug = new Issue(
            101,
            "Login button not responding",
            "HIGH"
        );

        assertEquals("OPEN", bug.getStatus());
    }

    @Test
    void resolvedIssueShouldHaveResolvedStatus() {

        Issue bug = new Issue(
            102,
            "Application crashes on startup",
            "HIGH"
        );

        bug.resolveIssue();

        assertEquals("RESOLVED", bug.getStatus());
    }
}
