public class PowerofFour {
    static public void main(String[] args){
        SolutionPowerofFour powerofFour = new SolutionPowerofFour();
        System.out.println(powerofFour.isPowerOfFour(0));
    }
}

class SolutionPowerofFour {
    public boolean isPowerOfFour(int n) {
         if(n <= 0){
             return false;
         }
         if(n==1){
             return true;
         }
         if(n%4 != 0){
             return false;
         }
         return isPowerOfFour(n/4);
    }
}
