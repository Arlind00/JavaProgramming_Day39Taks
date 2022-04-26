package day42_ExceptionsContinue;

class ArlindException extends RuntimeException{


    public ArlindException(){
        System.out.println("default constructor");
    }

    public ArlindException(String message){
        super(message);

    }

}


public class CustomExceptions {

    public static void main(String[] args) {

       // throw new ArlindException("Custom unchecked exception");
        throw new ArlindException();
    }
}
