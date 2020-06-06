package com.common.utils.web.response;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor

@ApiModel(value = "服务器返回数据信息")
public class ListResult<T> {

    private List<T> list;

    //数据总数
    @ApiModelProperty(value = "服务器返回数据列表长度")
    private long total;
}