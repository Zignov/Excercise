package arrayOfMultiples;


public class ArrayOfMultiples {
    public String program (int num, int length){
        Integer[] result = new Integer[length];

        for (int i = 1; i<1+length; i++){
            result[i-1] = num*i;
        }

        String konec = "";

        for(int i=0; i<length; i++){
                konec.concat(result[i].toString());
                konec.concat(", ");
        }

        return konec;
    }
}
