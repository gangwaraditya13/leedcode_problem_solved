public class ExcelSheetColumnNumber {
    static public void main(String[] args){
        SolutionExcelSheetColumnNumber number = new SolutionExcelSheetColumnNumber();
        System.out.println(number.titleToNumber("A"));
    }
}

class SolutionExcelSheetColumnNumber {
        public int titleToNumber(String columnTitle) {
            int titleNumber = 0;

            for (int i = 0; i < columnTitle.length(); i++) {
                char c = columnTitle.charAt(i);
                titleNumber = titleNumber * 26 + (c - 'A' + 1);
            }

            return titleNumber;
        }
}