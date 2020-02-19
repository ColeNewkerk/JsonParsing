package exceptions;

public class ParameterIsNotJsonStringException extends Throwable {

    public ParameterIsNotJsonStringException(String jsonString){

        System.out.println("Parameter is not Json String");

    }
}
