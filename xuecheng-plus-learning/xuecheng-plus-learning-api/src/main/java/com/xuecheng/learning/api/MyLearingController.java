package com.xuecheng.learning.api;


import com.xuecheng.base.model.RestResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "学习过程管理接口", tags = "学习过程管理接口")
@Slf4j
@RestController
public class MyLearingController {


    @ApiOperation("获取视频")
    @GetMapping("/open/learn/getvideo/{courseId}/{teachplanId}/{mediaId} ")
    public RestResponse<String> getvideo(@PathVariable("courseId")
    Long courseId, @PathVariable("courseId") Long teachplanId, @PathVariable("mediaId") String mediaId){
        return null;
    }
}
