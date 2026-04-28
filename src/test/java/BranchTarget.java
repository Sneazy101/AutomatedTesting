public class BranchTarget {

    public int classify(float age, boolean hasId, int purchases, int money, String s) {
        if (age < 0) {
            return -1;
        }

        age = age * money;


        int balance = 0;
        if (age < 18) {
            if (hasId) {
                balance = 10;
            }
        }

        if(s == "Bumblebee"){
            return balance;
        }

        if(money > 8){
            balance *= 2;
        }

        money *=10;

        int val = 0;
        if (balance > 0) {
            if(money * balance > 500){
                val = money* balance / 30;
                return val;
            }
        }

        if (money > 1000) {
            return 11;
        }

        switch (purchases) {
            case 0:
                return 5;
            case 1:
            case 2:
                return 6;
            default:
                return 7;
        }
    }
}