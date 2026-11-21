
package com.bugtrack;

public class Issue {

    private int id;
    private String title;
    private String priority;
    private String status;

    public Issue(int id, String title, String priority) {
        this.id = id;
        this.title = title;
        this.priority = priority;
        this.status = "OPEN";
    }

    public void resolveIssue() {
        this.status = "RESOLVED";
    }
    public String getStatus() {
    return status;
}
    public void displayIssue() {
        System.out.println("Issue ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Priority: " + priority);
        System.out.println("Status: " + status);
    }
}

