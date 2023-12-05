package Exceptions;

public class AgeLessThenZeroException extends Exception{

    public AgeLessThenZeroException(){}
    public AgeLessThenZeroException(String message){
        super(message);
    }


    public AgeLessThenZeroException (Throwable cause){
        super(cause);
    }

        public AgeLessThenZeroException(String message, Throwable cause){
        super(message, cause);
    }
}
