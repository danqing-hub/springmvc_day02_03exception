package com.danqing.exception;

/**定义异常类
 * @author 丹青
 * @date 2019/10/2-20:29
 */
public class SysException extends Exception {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SysException(String message) {
        this.message = message;
    }
}
