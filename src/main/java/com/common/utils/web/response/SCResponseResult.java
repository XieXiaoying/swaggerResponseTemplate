package com.common.utils.web.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString

@ApiModel(value = "接口格式")
public class SCResponseResult<T> extends ResponseResultImpl {
    @ApiModelProperty(value = "服务器返回数据集")
    ListResult<T> listResult;


    /**
     * @param resultCodeEnum
     * @return
     * @Description: 使用枚举返回类型构建返回list结果
     * @Param [resultCode]
     * @Author xiexy.syky
     * @Date 2019/1/5 0005 11:58
     */
    public SCResponseResult(ResultCodeEnum resultCodeEnum, ListResult<T> listResult) {
        super(resultCodeEnum);
        this.listResult = listResult;
    }
}
