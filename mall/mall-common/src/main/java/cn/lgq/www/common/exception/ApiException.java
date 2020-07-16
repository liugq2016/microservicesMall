package cn.lgq.www.common.exception;

import cn.lgq.www.common.api.IErrorCode;

/**
 * 自定义API异常
 */
public class ApiException extends RuntimeException {

    private IErrorCode errorCode;

    public ApiException(IErrorCode iErrorCode){
        super(iErrorCode.getMessage());
        this.errorCode = iErrorCode;
    }

    public ApiException(String message){
        super(message);
    }

    public ApiException(Throwable cause){
        super(cause);
    }

    public ApiException(String message,Throwable cause){
        super(message,cause);
    }

    public IErrorCode getErrorCode(){
        return errorCode;
    }

}
