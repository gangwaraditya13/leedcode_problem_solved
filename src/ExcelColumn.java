public class ExcelColumn {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Adjust because Excel columns are 1-indexed
            int remainder = columnNumber % 26;
            char c = (char) ('A' + remainder);
            sb.insert(0, c); // prepend the character
            columnNumber /= 26;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(1));   // Output: A
        System.out.println(convertToTitle(28));  // Output: AB
        System.out.println(convertToTitle(701)); // Output: ZY
    }
}
