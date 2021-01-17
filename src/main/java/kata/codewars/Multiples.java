package kata.codewars;

public class Multiples {
    public int solution(int number) {
        //TODO: Code stuff here
        int sum = 0;
        number--;
        while (number  > 0) {

            if (number % 3 == 0 || number % 5 == 0) {
                sum+=number;
            }
            number--;
        }

        return sum;
    }
}
