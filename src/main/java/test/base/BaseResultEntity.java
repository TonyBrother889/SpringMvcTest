package test.base;

/**
 * 回调信息统一封装类
 * Created by zhangxiang on 2017/11/7.
 */
public class BaseResultEntity<T> {
    @Override
    public String toString() {
        return "BaseResultEntity{" +
                "result='" + result + '\'' +
                ", Code=" + Code +
                ", msg='" + msg + '\'' +
                ", line=" + line +
                ", data=" + data +
                '}';
    }

    /**
     * result : success
     * Code : 800
     * msg :
     * line : 77
     * debugInfo : {}
     * data : {"admin_name":"Tony.Zhang","admin_level":"2"}
     */

    private String result;
    private int Code;
    private String msg;
    private int line;
    //显示数据（用户需要关心的数据）
    private T data;

    public String getResult() {
        return result;
    }

    public BaseResultEntity setResult(String result) {
        this.result = result;
        return this;
    }

    public int getCode() {
        return Code;
    }

    public BaseResultEntity setCode(int Code) {
        this.Code = Code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public BaseResultEntity setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public int getLine() {
        return line;
    }

    public T getData() {
        return data;
    }

    public BaseResultEntity setLine(int line) {
        this.line = line;
        return this;
    }

    public BaseResultEntity setData(T data) {
        this.data = data;
        return this;
    }
}
