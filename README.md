# BugTrack QA – Java Issue Tracking & Automated Testing

A Java-based issue tracking and quality engineering project exploring object-oriented programming, automated regression testing and software quality practices.

**Status:** Work in Progress

## Overview

BugTrack QA is a simplified issue-tracking application developed to practice Java programming, software testing and defect lifecycle management.

The application currently allows users to create issue objects, display their details and transition their status from OPEN to RESOLVED.

## Technologies

- Java 21
- Maven
- JUnit 5
- Git and GitHub

## Current Features

- Create an issue with an ID, title and priority.
- Automatically initialise new issues with OPEN status.
- Resolve an issue by updating its status to RESOLVED.
- Display issue details through the console.
- Execute two JUnit automated tests covering issue creation and resolution.

## Automated Testing

The project currently includes two regression tests:

1. `newIssueShouldBeOpen()` — verifies that a new issue starts in OPEN status.
2. `resolvedIssueShouldHaveResolvedStatus()` — verifies that resolving an issue changes its status to RESOLVED.

### Run the tests

```bash
mvn clean test
```

## Planned Enhancements

- Input validation and negative test cases.
- More comprehensive regression tests.
- Automated CI testing using GitHub Actions.
- REST API endpoints and API testing.
- Test reporting and additional issue management functionality.

## Development Status

This project is actively being developed as a hands-on exploration of Java software engineering, testing frameworks and automated quality assurance.
