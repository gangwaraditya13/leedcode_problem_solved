public class CountOperationstoObtainZero {
    static public void main(String[] args){
        SolutionCountOperationstoObtainZero countOperationstoObtainZero = new SolutionCountOperationstoObtainZero();
        System.out.println(countOperationstoObtainZero.countOperations(2,3));
    }
}

class SolutionCountOperationstoObtainZero {
    public int countOperations(int num1, int num2) {
        return counter(num1,num2,0);
    }

    static public int counter(int num1, int num2, int counter){
        if (num2 == 0 || num1 == 0){
            return counter;
        }
        if(num1 >= num2){
            return counter(num1-num2,num2, ++counter);
        }
        else{
            return counter(num1,num2-num1, ++counter);
        }
    }
}