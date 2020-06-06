package com.common.utils.web.response;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class testController {

    @RequestMapping(value = "/test")
    public SCResponseResult test(){
        return new SCResponseResult(ResultCodeEnum.SUCCESS, new ListResult());
    }
}
