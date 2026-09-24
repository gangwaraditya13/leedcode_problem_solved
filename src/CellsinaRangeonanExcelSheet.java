import java.util.ArrayList;
import java.util.List;

public class CellsinaRangeonanExcelSheet {
    static public void main(String[] args){
        SolutionCellsinaRangeonanExcelSheet cellsinaRangeonanExcelSheet = new SolutionCellsinaRangeonanExcelSheet();
        System.out.println(cellsinaRangeonanExcelSheet.cellsInRange("A1:F1"));
    }
}

class SolutionCellsinaRangeonanExcelSheet {
    public List<String> cellsInRange(String s) {
        char c1 = s.charAt(0);
        char c2 = s.charAt(3);
        int a = Integer.parseInt(Character.toString(s.charAt(1)));
        int b = Integer.parseInt(Character.toString(s.charAt(4)));

        List<String> output = new ArrayList<>();
        
        while (c1<=c2){
            for (int i = a; i <= b; i++) {
                output.add(Character.toString(c1)+i);
            }
            c1++;
        }

        return output;
    }
}