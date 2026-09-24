public class DayoftheYear {
    static public void main(String[] args){
        SolutionDayoftheYear dayoftheYear = new SolutionDayoftheYear();
        System.out.println(dayoftheYear.dayOfYear("2019-01-09"));
    }
}

class SolutionDayoftheYear {
    public int dayOfYear(String date) {
        String[] split = date.split("-");
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1])-1;
        int day = Integer.parseInt(split[2]);

        if((year%4 == 0 && year%100 != 0) || (year%400 == 0)){
            int[] days = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int tdays = 0;
            for (int i = 0; i < month; i++) {
                tdays += days[i];
            }
            return tdays+day;
        }else{
            int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int tdays = 0;
            for (int i = 0; i < month; i++) {
                tdays += days[i];
            }
            return tdays+day;
        }
    }
}