package day42_Exceptions;

class FadyExceptions extends RuntimeException{ // custom unchecked exception

    public FadyExceptions(){
        super("Time for a short break");
    }
    public FadyExceptions(String message){
        super(message);
    }

}

class NoBreakException extends Exception{ // custom checked exception

}

public class CustomExceptions {

    public static void main(String[] args) {

        //throw new FadyExceptions("It's time for lunch break");


        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }

    }

}
