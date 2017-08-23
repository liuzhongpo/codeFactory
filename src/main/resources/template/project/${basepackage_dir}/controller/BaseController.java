package ${basepackage}.controller;

import com.alibaba.fastjson.JSONObject;

public class BaseController {

    public JSONObject renderJson(){
        return renderJson(null);
    }

    public JSONObject renderJson(Object data){
        JSONObject result=new JSONObject();
        result.put("rtnCode",0);
        result.put("rtnMsg","");

        if(data!=null){
            result.put("data",data);
        }

        return result;
    }

    public JSONObject renderError(Integer errCode,String errMsg){
        JSONObject result=new JSONObject();
        result.put("rtnCode",errCode);
        result.put("rtnMsg",errMsg);

        return result;
    }

}
