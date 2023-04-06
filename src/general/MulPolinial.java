//https://www.geeksforgeeks.org/multiply-two-polynomials-2/
/**
Given two polynomials represented by two arrays, write a function that multiplies given two polynomials.

        Example:

        Input:  A[] = {5, 0, 10, 6}
        B[] = {1, 2, 4}
        Output: prod[] = {5, 10, 30, 26, 52, 24}

        The first input array represents "5 + 0x^1 + 10x^2 + 6x^3"
        The second array represents "1 + 2x^1 + 4x^2"
        And Output is "5 + 10x^1 + 30x^2 + 26x^3 + 52x^4 + 24x^5"
*/

/**
 * A simple solution is to one by one consider every term of the first polynomial and multiply it with every term of the second polynomial. Following is the algorithm of this simple method.
 *
 * multiply(A[0..m-1], B[0..n01])
 * 1) Create a product array prod[] of size m+n-1.
 * 2) Initialize all entries in prod[] as 0.
 * 3) Traverse array A[] and do following for every element A[i]
 * ...(3.a) Traverse array B[] and do following for every element B[j]
 *           prod[i+j] = prod[i+j] + A[i] * B[j]
 * 4) Return prod[].
 */



public class MulPolinial {
    // A[] represents coefficients
    // of first polynomial
    // B[] represents coefficients
    // of second polynomial
    // m and n are sizes of A[] and B[] respectively

    static void printPoly(int poly[],int n){
        for(int i=0;i<n;i++){
            System.out.print(poly[i]);
            if(i != 0){
                System.out.print("x^"+i);
            }
            if(i!= n-1){
                System.out.print(" + ");
            }

        }
        System.out.println();
    }

    static int[] multiply(int A[],int B[], int m, int n){
        int[] prod = new  int [m+n-1];
        //initialize the product polynial
        for(int i=0;i<m+n-1;i++){
            prod[i]=0;
        }
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                prod[i+j] = prod[i+j]+A[i]*B[j];
            }
        }

        return prod;
    }

    public static void main(String[] args) {
    // The following array represents polynomial 5 + 10x^2 + 6x^3
        int A[] ={5,0,10,6};
        // The following array represents  polynomial 1 + 2x + 4x^2
        int B[] ={1,2,4};
        int m= A.length;
        int n =B.length;

        System.out.println("First polynomial is:");
        printPoly(A, m);
        System.out.println(" Second polynomial is:");
        printPoly(B, n);

        int[] prod = multiply(A,B,m,n);
        printPoly(prod,m+n-1);
    }
}