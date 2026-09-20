public class BinaryNumberwithAlternatingBits {
    static public void main(String[] args){
        SolutionBinaryNumberwithAlternatingBits binaryNumberwithAlternatingBits = new SolutionBinaryNumberwithAlternatingBits();
        System.out.println(binaryNumberwithAlternatingBits.hasAlternatingBits(42));
    }
}

class SolutionBinaryNumberwithAlternatingBits {

    /// Calculate n ^ (n >> 1).
    ///
    /// Take that result and add 1.
    ///
    /// AND it with the original result.
    ///
    /// If the result is 0, all its bits were 1.
    public boolean hasAlternatingBits(int n) {

        if((((n^(n>>1))+1) & (n>>1)) == 0){
            return true;
        }
        return false;

    }
}