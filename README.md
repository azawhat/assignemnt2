# Assignment 1
This is the first assignment of the Algorithms and Data Structure course. It consists of 10 tasks. 

## Main.java file  [Link](https://github.com/azawhat/alogrithms/blob/main/src/Main.java)
The Main file has solutions for first three tasks. Other tasks were done in different classes. 
### NOTE. 
All code for the first three problems were commented in the main part, this commit [A function that finds is number prime or composite](https://github.com/azawhat/alogrithms/commit/abb913c230cfd98529f33509e62aeb81630f4a3a)


## Problem 1. [Link](https://github.com/azawhat/alogrithms/commit/e5f498fddcf010805eeaa74791b73d1dc4beede3) 

**Description:** _A function that finds minimum_

**Explanation:** 
Here we have default class main and in the class main there is an array of 5 numbers `int[] arr = {10,7,32,3,5}`. After that there is a function to find minimum with 2 parametres. First parametr `int[] arr` is an array that we use and second is the length of this array `int n`. If `n=1` it returns `arr[0]`, otherwise it always compares element of array to the next element by using `Math.min`. 

Solution: 
```
public class Main {
    public static void main(String[] args) {
        int[] arr = {10,7,32,3,5};
        int min = findMin(arr, arr.length);
        System.out.println("The Minimum number is " + min);
    }
    
     public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        else {
            int min = findMin(arr, n-1);
            return Math.min(min, arr[n-1]);
        }
    }
}
```

## Problem 2 [Link](https://github.com/azawhat/alogrithms/commit/0de78344a93b935cc3e94d3812552c2b02caf5a1)

**Description:** _A function that returns average number_

**Explanation:** 
Function `findAvg` has 2 parametres. Parameters are the same with the first problem. In this case if `n==0` it returns the first element of array. Otherwise it uses formula `findAvg(arr,n-1)*(n-1)` and `sum+=arr[n-1]`. AFter that by the simple division of this sum to the length of an array we find average number. 

Solution: 
```
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {3,2,4,1};
        double avg = findAvg(arr1, arr1.length);
        System.out.println("The average number is "+ avg);
        }
        
    public static double findAvg(int[] arr, int n){
        if (n==0){
            return arr[0];
        }
        else {
            double sum = findAvg(arr, n-1)*(n-1);
            sum += arr[n-1];
            return sum/n;
        }
}
```


## Problem 3 [Link](https://github.com/azawhat/alogrithms/commit/abb913c230cfd98529f33509e62aeb81630f4a3a)
**Description:** _A function to check number. Is it prime or composite_

**Explanation:** 
Function `isPrime` checks number. This function has one parameter and it is a number that we need to divide. If it's divisible by 2 without any remains its prime, else it is composite number. 

```
public static void main(String[] args) {
        int n=10;
        System.out.println(isPrime(n));
    }

    public static String isPrime(int num){
        if (num%2 ==0)
            return("Prime");
        else
            return("Composite");
    }
```

## Problem 4 [Link](https://github.com/azawhat/alogrithms/commit/fcb8a8d88ba597097c0ef8b90634b3970329cfc1)
**Description:** _Factorial of num by using recursion_

**Explanation:** 
There is a new class factorialNum that uses to find factorial. Function has only 1 parameter and its number that we will use. If `n==0` it returns 1, because `0!=1. Otherwise it just multiplies 
number to number-1
```
public class factorialNum {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int n = 5;
        int factorial = factorialNum.factorial(n);
        System.out.println(factorial);
    }
}
```
## Problem 5 [Link](https://github.com/azawhat/alogrithms/commit/3003dac994e182056c02de626860a4d8ca307cc8)
**Description:** _N-th number of Fibonacci sequence by using recursion_

**Explanation:** 
There is a new class Fibonacci that has a function `fibonacci`. Function has only 1 parameter and its number that we will use. If `n==0` it returns 0, also if `n==1` it returns 1, because these are the values for fibonacci sequences respectively. Otherwise it just adds border numbers 
number to number-1

```
public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int fibonacci = Fibonacci.fibonacci(n);
        System.out.println(fibonacci);
    }
}

```
## Problem 6 [Link](https://github.com/azawhat/alogrithms/commit/0045a458826db6ea40b1bd778a8c093616f8fc5c)
**Description:** _Problem that finds a^n_

**Explanation:** 
New class PowerOfNum and it has function `power` with two parameters `double a` and `int n`. If `n==0` it returns 1, because `a^0=1`. Else if n is prime it finds number `half` until n/2 is composte and returns `a*power(a,n-1)`
```
public class PowerOfNum {
    public static double power(double a, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            double half = power(a, n/2);
            return half * half;
        } else {
            return a * power(a, n-1);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        double a = 2;
        int n = 10;
        double result = PowerOfNum.power(a, n);
        System.out.println(result);
    }
}
```
## Problem 7 [Link](https://github.com/azawhat/alogrithms/commit/fc47883f38cc055314037ca7c8c7cef2def7c8dd)
**Description:** _Reversed array_

**Explanation:** 
New class created which name is `ReverseArray` and there are 2 functions in this class. First `reverseArray`, second `reverse`. First array has only one parameter it is `int[] arr`. Second function has 3 parameters, `int[] arr, int start, int stop`. This function needed to only reverse an element. First function needed to reverse full array. 
```
import java.util.Arrays;
import java.util.Scanner;
public class ReverseArray {
    public static void reverseArray(int[] arr) {
        reverse(arr, 0, arr.length-1);
    }
    public static void reverse(int[] arr, int start, int stop) {
        if (start < stop) {
            int temp = arr[start];
            arr[start] = arr[stop];
            arr[stop] = temp; //swapping edge elements
            reverse(arr, ++start, --stop); //continue
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length ");
        int n = sc.nextInt();
        System.out.println("Write"+ " elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        ReverseArray.reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
```


## Problem 8 [Link](https://github.com/azawhat/alogrithms/commit/970e23fecc73ce5d6e397625d342d47121fba845)
**Description:** _Checking for digits_

**Explanation:** 
There is a new class named `CheckingForDigits`. It has 3 functions. Loop, recFunction and isNum. Second function has 3 parameters `String[] arr, int pos, int stop`, first function includes in return second function and has parameter `String letter`. The last one has parameter `isNum`. It is used to check is it number or not. 
```
public class CheckingForDigits {

    public static String loop(String letter) {
        return recFunction(letter.split(""), 0, letter.length());
    }
    static String recFunction(String[] arr, int pos,  int stop) {
        if (pos < stop) {
            if (isNum(arr[pos])) {
                return recFunction(arr, ++pos, stop);
            } else {
                return "No";
            }
        }
        return "Yes";
    }
    static boolean isNum(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        String n = sc.nextLine();
        System.out.println(CheckingForDigits.loop(n));
    }
}
```
## Problem 9 [Link](https://github.com/azawhat/alogrithms/commit/c3d9ca28d430ca0b1c3ff38b29106c382fa50cb1)
**Description:** _Binomial coefficient_

**Explanation:** 
There is a new class `BinomialCoeff`. It has 1 function with 2 parameters, there are `int n` and `int p`. If `n==p` or `p==0` it returns 1, because mathematical formula equalls to that. In the `else` statement in returns formula `func(n-1,p-1)+func(n-1,p)`. There is also input statement to input 2 numbers in that situation.
```

public class BinomialCoeff {
    public static int func(int n, int p) {
        if (n == p) {
            return 1;
        }
        else if (p==0){
            return 1;
        }
        else
            return func(n-1, p-1) + func(n-1, p);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int p =sc.nextInt();
        int ans = BinomialCoeff.func(c,p);
        System.out.println(ans);
    }
}
```
## Problem 10 [Link](https://github.com/azawhat/alogrithms/commit/321dba626a04afbd1a735006c5b8ff321d945019)
**Description:** _GCD by two numbers_

**Explanation:** 
There is a new class named `GCD` and it has only 1 function. `findGCD` function has 2 parameters `int a, int b`. According to formula if the second number equalls to 0 the `GCD=0`. Otherwise it returns formula `findGCD(b, a%b). 
```
public class GCD {
    public static int findGCD(int a,int b){
        if (b==0)
            return a;
        else
            return findGCD(b, a%b);
    }
}

public class Main {
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = GCD.findGCD(a,b);
        System.out.println(gcd);
    }
}
```
