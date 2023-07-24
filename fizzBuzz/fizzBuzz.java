package fizzBuzz;

public class fizzBuzz {
    public static String program(Integer num){


        if(num%15==0){
            return("FizzBuzz");
        }
        else if(num%5==0){
            return("Fizz");
        }
        else if(num%3==0){
            return("Buzz");
        }
        else{
            return(num.toString());
        }





    }
}
