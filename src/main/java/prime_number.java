
public class prime_number {

    public boolean checkPrime(int i) {
        int j = 2;
        boolean flag=false;
        if (i == 0) {
            System.out.println("You entered zero....invalid input");
            flag =false;
        }
        else {
            for (j = 2; j < i; j++) {
                int k = i % j;
                if (k == 0) {
                    System.out.println("Not Prime !");
                    flag =false;
                    break;
                }
            }
            if (j == i) {
                System.out.println("Prime Number");
                flag =true;
            }
        }

        return flag;
    }
}
