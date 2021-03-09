package fizzBuzz;

public class Main {

    public static void main(String[] args) {

        //For loop to go through numbers 1-100 with empty outPut variable.
        for(var i = 1; i <= 100; i++){
        var outPut = "";
        //If statements to add "Fizz", "Buzz" or both i they are multiples of 3 or 5.
            //can be modified for any multiple.
        if(i % 3 == 0) {outPut += "Fizz";}
        if(i % 5 == 0) {outPut += "Buzz";}
        //Final if to print out a number instead of the "Fizz" or "Buzz" changed to a String Value for the final print.
        if (outPut =="")  {outPut = String.valueOf(i);}

            System.out.println(outPut);
        }
    }


}
