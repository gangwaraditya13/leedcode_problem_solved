public class NumberofStepstoReduceaNumbertoZero {
    static public void main(String[] args){
        SolutionNumberofStepstoReduceaNumbertoZero numberofStepstoReduceaNumbertoZero = new SolutionNumberofStepstoReduceaNumbertoZero();
        System.out.println(numberofStepstoReduceaNumbertoZero.numberOfSteps(14));
    }
}

class SolutionNumberofStepstoReduceaNumbertoZero {
    public int numberOfSteps(int num) {
        return count(num,0);
    }

    static private int count(int num , int count){
        if(num == 0){
            return count;
        } else if (num % 2 == 0) {
            return count(num/2,++count);
        }else{
            return count(num-1, ++count);
        }
    }
}