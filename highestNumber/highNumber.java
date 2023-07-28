package highestNumber;


public class highNumber{
    public static int result(Integer input){
        
        String inputString = input.toString();
        Character[] stringList = new Character[inputString.length()];
        Integer[] list = new Integer[inputString.length()];
        int bigNumber = 0;
        

        for(int i = 0; i<inputString.length(); i++){
            stringList[i] = inputString.charAt(i);
        }

        

        for(int i = 0; i<inputString.length(); i++){
            list[i] = Character.getNumericValue(stringList[i]);

            if(i == 0){
                bigNumber = list[0];
            }
            else{
                if (bigNumber<list[i]){
                    bigNumber = list[i];
                };
            }
        }

        return bigNumber;
    }
}