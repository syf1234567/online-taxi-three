package com.mashibing.internalcommon.dto;

import com.mashibing.internalcommon.constant.CommonStatusEnum;
import com.sun.source.doctree.SerialDataTree;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 通用返回值处理类
 */
@Data
/**
 * chain的中文含义是链式的，设置为true，则setter方法返回为当前对象
 */
@Accessors(chain = true)
/**
 * 抑制所有异常
 */
@SuppressWarnings("all")
public class ResponseResult<T> implements Serializable {

    private int code;
    private String message;
    private T data;

    /**
     * 返回成功数据(state: 1)
     *
     * @param <T> 数据类型
     * @Param data 数据内容
     * @Return ResponseResult类型
     */
    public static <T> ResponseResult success(T data) {
        return new ResponseResult().setCode(CommonStatusEnum.SUCCESS.getCode()).setMessage("");
    }

    /**
     * 返回错误数据(status:500)
     *
     * @param data 错误内容
     * @param <T>  数据类型
     * @return ResponseResult实例
     */
    public static <T> ResponseResult fail(T data) {
        return  new ResponseResult().setCode(CommonStatusEnum.INTERNAL_SERVER_EXCEPTION.getCode()).setMessage("");
    }


}
