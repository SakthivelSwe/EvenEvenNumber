public class Main {
    public static void main(String[] args) {
        //First method
        int number = 2;
        int lastEvenNumber=20;
        while(number <= lastEvenNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even Number is = "+number);
        }

        //Second Method Total 5 Even number print
        System.out.println("**********************");
        number = 2;
        lastEvenNumber = 20;
        int evenNumbers = 0;
        while(number <= lastEvenNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number is = "+number);
            evenNumbers++;
            if(evenNumbers == 5) {
                break;
            }
        }
        System.out.println("Total even number is= "+evenNumbers);

    }

    public static boolean isEvenNumber(int number) {
        if((number % 2) == 0) {
            return true;
        }else {
            return false;
        }
    }
}
