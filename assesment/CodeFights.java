
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Character;
import java.util.Arrays;

class CodeFights {

    public static void main(String[] args){
        System.out.println("Hello World!!!");

        String[] response = new String[2];
        response[0] = "2 + 4";
        response[1] = "1 + 3";
        System.out.println(" response array: " + Arrays.toString(response));
    }

    String[] newNumeralSystem(char number) {
    //String newNumeralSystem(char number) {
        int[] integerArray = new int[26];
        for(int i = 0 ; i < 26 ; i++){
            integerArray[i] = i;
        }    

        System.out.println(" numeric array complete!");
        System.out.println(" the third value is: " + integerArray[2]);
        System.out.println(" the last value is: " + integerArray[25]);


        Integer input = convertToInteger(number);

        ArrayList<Pair> successPairs = new ArrayList<Pair>();

        //COMPARE ALL COMBINATIONS, IGNORE DUPLICATES, ADD TO successPairs ARRAYLIST
        for(int j = 0; j <= input; j++) {
            for(int k=j; k <= input; k++) {
                Pair pair = new Pair(j, k);
                if(pair.sum == input)
                    successPairs.add(pair);
            }
        } 

        String[] result = new String[successPairs.size()];

        for(int j=0; j<result.length; j++){
            result[j] = successPairs.get(j).toString();
        }

        return result;
}

    class Pair {
        public int first;
        public int second;
        public int sum;

        public Pair(int first, int second){
            this.first = first;
            this.second = second;
            this.sum = this.first + this.second;
        }

        public Pair(int first){
            this.first = first;
        }

        public void setSecond(int second){
            this.second = second;
            this.sum = this.first + this.second;
        }

        @Override
        public boolean equals(Object o){
            Pair pair1 = (Pair) o;
            if(this.first == pair1.first && this.second == pair1.second)
                return true;
            if(this.first == pair1.second && this.second == pair1.first)
                return true;
            return false;
        }

        @Override
        public String toString(){
            return convertToChar(first) + " + " + convertToChar(second);
        }
    }

    public Integer convertToInteger(char number){
        HashMap<Character, Integer> numericSystem = new HashMap();
        numericSystem.put('A', 0);
        numericSystem.put('B', 1);
        numericSystem.put('C', 2);
        numericSystem.put('D', 3);
        numericSystem.put('E', 4);
        numericSystem.put('F', 5);
        numericSystem.put('G', 6);
        numericSystem.put('H', 7);
        numericSystem.put('I', 8);
        numericSystem.put('J', 9);
        numericSystem.put('K', 10);
        numericSystem.put('L', 11);
        numericSystem.put('M', 12);
        numericSystem.put('N', 13);
        numericSystem.put('O', 14);
        numericSystem.put('P', 15);
        numericSystem.put('Q', 16);
        numericSystem.put('R', 17);
        numericSystem.put('S', 18);
        numericSystem.put('T', 19);
        numericSystem.put('U', 20);
        numericSystem.put('V', 21);
        numericSystem.put('W', 22);
        numericSystem.put('X', 23);
        numericSystem.put('Y', 24);
        numericSystem.put('Z', 25);

        //VALIDATE USER INPUT
        if(!numericSystem.containsKey(number)){
            System.out.println(" ERROR, the charecter is not a valid input: " + number);
            System.exit(0);
        }

        System.out.println("Received user input: " + number);
        Integer converted = numericSystem.get(number);
        System.out.println("Converted user input: " + converted);

        return converted;
    }

    public Character convertToChar(Integer number){
        HashMap<Integer, Character> numericSystem = new HashMap();
        numericSystem.put(0, 'A');
        numericSystem.put(1, 'B');
        numericSystem.put(2, 'C');
        numericSystem.put(3, 'D');
        numericSystem.put(4, 'E');
        numericSystem.put(5, 'F');
        numericSystem.put(6, 'G');
        numericSystem.put(7, 'H');
        numericSystem.put(8, 'I');
        numericSystem.put(9, 'J');
        numericSystem.put(10, 'K');
        numericSystem.put(11, 'L');
        numericSystem.put(12, 'M');
        numericSystem.put(13, 'N');
        numericSystem.put(14, 'O');
        numericSystem.put(15, 'P');
        numericSystem.put(16, 'Q');
        numericSystem.put(17, 'R');
        numericSystem.put(18, 'S');
        numericSystem.put(19, 'T');
        numericSystem.put(20, 'U');
        numericSystem.put(21, 'V');
        numericSystem.put(22, 'W');
        numericSystem.put(23, 'X');
        numericSystem.put(24, 'Y');
        numericSystem.put(25, 'Z');

        //VALIDATE USER INPUT
        if(!numericSystem.containsKey(number)){
            System.out.println(" ERROR, the charecter is not a valid input: " + number);
            System.exit(0);
        }

        System.out.println("Received user input: " + number);
        Character converted = numericSystem.get(number);
        System.out.println("Converted user input: " + converted);

        return converted;
    }


}


