
public class Test {

	public static void main(String[] args) {
		System.out.println(numberOfSteps(8));
	}
	
	static int step = 0;
    public static int numberOfSteps(int num) {
        if(num == 0){
        	return step;
        }
        if(num%2 == 0){
            step++;
            System.out.println(step);
            return numberOfSteps(num/2);
        }
        else{
            step++;
            return numberOfSteps(num-1);
        }
    }
}
