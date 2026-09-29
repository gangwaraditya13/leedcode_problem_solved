public class FibonacciNumber {
    static public void main(String[] args){
        SolutionFibonacciNumber fibonacciNumber = new SolutionFibonacciNumber();
        System.out.println(fibonacciNumber.fib(4));
    }
}


class SolutionFibonacciNumber {
    public int fib(int n) {
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return fib(n-2)+fib(n-1);
        }
    }
}