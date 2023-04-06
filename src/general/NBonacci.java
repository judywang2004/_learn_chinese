/**
 * ou are given two integers N and M, and print all the terms of the series up to M-terms of the N-bonacci Numbers. For example, when N = 2, the sequence becomes Fibonacci, when n = 3, sequence becomes Tribonacci.
 *
 * In general, in N-bonacci sequence, we use sum of preceding N numbers from the next term. For example, a 3-bonacci sequence is the following:
 * 0, 0, 1, 1, 2, 4, 7, 13, 24, 44, 81
 *
 * The Fibonacci sequence is a set of numbers that starts with one or zero, followed by a one, and proceeds based on the rule that each number is equal to the sum of preceding two numbers 0, 1, 1, 2, 3, 5, 8…..
 *
 * Examples :
 * Input : N = 3, M = 8
 * Output : 0, 0, 1, 1, 2, 4, 7, 13
 * We need to print first M terms.
 * First three terms are 0, 0 and 1.
 * Fourth term is 0 + 0 + 1 = 1
 * Fifth term is 0 + 1 + 1 = 2
 * Sixth terms is 1 + 1 + 2 = 4
 * Seventh term is 7 (1 + 2 + 4)
 * and eighth term is 13 (7 + 4 + 2).
 *
 * Input : N = 4, M = 10
 * Output : 0 0 0 1 1 2 4 8 15 29
 */

/**
 * Method 1 (Simple)
 *
 * Initialize first N-1 terms as 0 and N-th term as 1. Now to find terms from (N+1)-th to M-th, we simply compute sum of previous N terms.
 *
 * Example : N = 4, M = 10
 *
 * First three terms are 0, 0, 0
 *
 * Fourth term is 1.
 *
 * Remaining terms are computed by adding
 *
 * previous 4 terms.
 * 0 0 0 1
 * 0 0 0 1 1
 * 0 0 0 1 1 2
 * 0 0 0 1 1 2 4
 * 0 0 0 1 1 2 4 8
 * 0 0 0 1 1 2 4 8 15
 * 0 0 0 1 1 2 4 8 15 29
 */

public class NBonacci {
}
