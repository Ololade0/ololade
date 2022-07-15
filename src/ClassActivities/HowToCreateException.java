package ClassActivities;

public class HowToCreateException extends RuntimeException {
    public HowToCreateException(){
        // next step is to call the constructor of the superclass;

        super();

    }

    public  HowToCreateException(String message){

        super(message);
    }


    //next step is to call throwable name which is exception name;
    public HowToCreateException(Throwable ex){

        super(ex);
    }

    public HowToCreateException(String message, Throwable ex){
        super(message,ex);
    }
}
