package activities;


class CustomException extends Exception{
private String message;

public CustomException(String msg){
    this.message=msg;
}

    @Override
    public String getMessage() {
        return message;
    }
}
public class Activity8 {
    public static void main(String[] args) {
    try{
        Activity8.exceptionTest("Hello");
        Activity8.exceptionTest(null);
        Activity8.exceptionTest("let's check");



    }catch (CustomException me){
        System.out.println("Inside catch block"+me.getMessage());
}


        }
    static void exceptionTest(String str)throws  CustomException{
        if(str==null){
            throw new CustomException("String value is null");
        } else {
        System.out.println(str);
    }
    }

}
