
package com.bugtrack;

public class App {

    public static void main(String[] args) {

        Issue bug1 = new Issue(
            101,
            "Login button not responding",
            "HIGH"
        );

        bug1.displayIssue();

        System.out.println("----- After fixing the bug -----");

        bug1.resolveIssue();
        bug1.displayIssue();
    }
}
