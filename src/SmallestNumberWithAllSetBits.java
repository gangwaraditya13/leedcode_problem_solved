public class SmallestNumberWithAllSetBits {
    static public void main(String[] args){
//        System.out.println((1<<1)|1);
        SolutionSmallestNumberWithAllSetBits smallestNumberWithAllSetBits = new SolutionSmallestNumberWithAllSetBits();
        System.out.println(smallestNumberWithAllSetBits.smallestNumber(10));
    }
}

class SolutionSmallestNumberWithAllSetBits {
    public int smallestNumber(int n) {
        int i = 1;
        while (n != 0){
            n = n>>1;
            if(n!= 0) i = ((i<<1)|1);
        }
        return i;
    }
}
