import java.util.Arrays;

public class DecodeXORedArray {
    public static void main(String[] args){
        System.out.println(4^6);
        SolutionDecodeXORedArray decodeXORedArray = new SolutionDecodeXORedArray();
        System.out.println(Arrays.toString(decodeXORedArray.decode(new int[]{6,2,7,3}, 4)));
    }
}

class SolutionDecodeXORedArray {
    public int[] decode(int[] encoded, int first) {
        int[]decoded = new int[encoded.length+1];
        decoded[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            decoded[i+1] = encoded[i]^ decoded[i];
        }
        return decoded;
    }
}