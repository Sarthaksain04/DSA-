package RecursionandBacktracking.Recursion;


//  Recursion = a function calling itself to solve a smaller version of the same problem.
public class RecursionDemo {
    public static void main(String[] args) {
        RecursionDemo r1 = new RecursionDemo();


        System.out.println("Factorial : "+ factorial(5));
        System.out.println();

        System.out.println("sum of Natural no : "+Naturalsum(5));
        System.out.println();

        r1.OnetoN(5);
        System.out.println();

        print(1);
        System.out.println();

        r1.message(5);
        System.out.println(Fibonacci(4));

    }

    // Factorial

    public  static  int factorial(int n ){
        if (n == 1){
            return 1;
        }
       return n * factorial(n - 1);   // 5 * 4

    }


    //Natural Sum

    public static int Naturalsum(int N){
           if(N == 1){
               return 1 ;
           }
           return N + Naturalsum(N - 1) ;
    }


    // one to N
    public void OnetoN(int n){
         if(n == 0 ) return ;

         OnetoN(n -  1);
        System.out.println(n);

    }


    // print message 5 times
    public void message(int n){
         if (n ==0 ) return ;

         message(n - 1);
        System.out.println("Hello World");
    }


    static void print(int n ){
        if (n == 5){ // Base condition
            System.out.println(n);
            return;
        }


        System.out.println(n);
        print(n + 1);
    }

    //Fibonacci

    public static int Fibonacci(int N){
        if(N <= 1 ){
            return N ;
        }
        return  Fibonacci(N - 1) + Fibonacci(N - 2) ;
    }
}
