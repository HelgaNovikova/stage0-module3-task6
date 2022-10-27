package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int result;
        if ((numberToBeRounded - (int)numberToBeRounded)>=0.5){
            result = (int)Math.ceil(numberToBeRounded);
        }
        else {
            result = (int)Math.floor(numberToBeRounded);
        }
        System.out.println(result);
    }
}
