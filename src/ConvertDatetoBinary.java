public class ConvertDatetoBinary {
    static public void main(String[] args){
        SolutionConvertDatetoBinary convertDatetoBinary =  new SolutionConvertDatetoBinary();
        System.out.println(convertDatetoBinary.convertDateToBinary("2080-02-29"));
    }
}

class SolutionConvertDatetoBinary {
    public String convertDateToBinary(String date) {

        StringBuilder bDate = new StringBuilder();

        String[] split = date.split("-");

        for (int i = 0; i < split.length; i++) {
            int n = (Integer.parseInt(split[i]));
            StringBuilder binary = new StringBuilder();
            while (n != 0){
                binary.append(n&1);
                n = n >> 1;
            }
            bDate.append(binary.reverse());
            if(i<split.length-1) {
                bDate.append("-");
            }
        }

        return bDate.toString();

    }
}
