package oop_day5.exception_0;

public class NumException extends Exception{
    public NumException() {
    }

    public NumException(String message) {
        super(message);
        System.out.println("自定义的异常");
    }
}
