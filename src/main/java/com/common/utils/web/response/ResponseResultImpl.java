package com.common.utils.web.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Data
@NoArgsConstructor
@ApiModel(value = "服务器返回状态")
public class ResponseResultImpl implements ResponseResultBase {

    //操作是否成功
    @ApiModelProperty(value = "操作是否成功")
    String flag = SUCCESS;

    //操作代码
    @ApiModelProperty(value = "操作代码")
    int code = SUCCESS_CODE;

    //提示信息
    @ApiModelProperty(value = "提示信息")
    String message = MSG_SUCCESS;

    /**
     * @Description: 使用枚举返回类型构建返回结果
     * @Param [resultCode]
     * @return
     * @Author xiexy.syky
     * @Date 2019/1/5 0005 11:58
     */
    public ResponseResultImpl(ResultCodeEnum resultCodeEnum){
        this.flag = resultCodeEnum.flag;
        this.code = resultCodeEnum.code;
        this.message = resultCodeEnum.message;
    }

    /**
     * @Description: 返回成功状态
     * @Param []
     * @return com.chen.model.web.ResultResponse
     * @Author xiexy.syky
     * @Date 2019/1/5 0005 12:03
     */
    public static ResponseResultImpl returnSuccess(){
        return new ResponseResultImpl(ResultCodeEnum.SUCCESS);
    }

    /**
     * @Description: 返回失败状态
     * @Param []
     * @return com.chen.model.web.ResultResponse
     * @Author xiexy.syky
     * @Date 2019/1/5 0005 12:03
     */
    public static ResponseResultImpl returnFail(){
        return new ResponseResultImpl(ResultCodeEnum.FAIL);
    }

}