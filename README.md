# Groovy's containsKey() Exception Handling

This example demonstrates a potential issue with Groovy's `containsKey()` method. When using it with Maps that might be null or empty, it's crucial to handle the potential exceptions for robust code.

The `bug.groovy` file showcases the problem, while `bugSolution.groovy` provides a corrected version.

## Bug Report

The original code throws a `NullPointerException` when calling `containsKey()` on an empty map or a null map because  `containsKey()` tries to access a member of a null object.

## Solution

The solution employs a safer approach by checking for `null` or emptiness before using `containsKey()`.