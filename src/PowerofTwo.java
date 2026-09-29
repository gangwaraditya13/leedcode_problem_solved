public class PowerofTwo {
    static public void main(String[] args){
        SolutionPowerofTwo powerofTwo = new SolutionPowerofTwo();
        System.out.println(powerofTwo.isPowerOfTwo(4));
    }
}

class SolutionPowerofTwo  {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        if (n % 2 != 0) {
            return false;
        }

        return isPowerOfTwo(n / 2);
    }
}