# Java Recursion Examples

This repository contains Java code examples demonstrating various recursive methods to perform operations on integers. Each class focuses on a specific operation: reversing digits, summing digits, and calculating the product of digits.

## Classes and Methods

### 1. Reverse_Recursion

This class contains a method to reverse an integer using recursion.

```java
public class Reverse_Recursion {
    public static void main(String[] args) {
        int n = 1234;
        Rev(n);
        System.out.println(num);
    }

    static int num = 0;

    public static void Rev(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        int N = n / 10;
        num = num * 10 + rem;
        Rev(N);
    }
}
