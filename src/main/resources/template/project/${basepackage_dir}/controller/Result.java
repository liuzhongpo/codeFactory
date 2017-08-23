package ${basepackage}.controller;

public class Result {

    private Integer statusCode;

    private String message;

    private Object data;

    public static Result Result401=new Result(401,"操作未授权");

    public Result(Integer statusCode,String message){
        this.statusCode=statusCode;
        this.message=message;
    }

    public Result(Object data){
        this.statusCode=0;
        this.message="";
        this.data=data;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
