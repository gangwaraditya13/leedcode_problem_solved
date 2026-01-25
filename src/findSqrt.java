public class findSqrt {
    static public void main(String[] args){
        System.out.println(mySqrt(4));
    }

    static int mySqrt(int x) {

        if (x < 2) return x;
        return (int) Math.exp(0.5 * Math.log(x));

    }

    static int mySqrt1(int x){
        if (x < 2) return x;

        int left = 1, right = x / 2;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square < x) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
