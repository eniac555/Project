package com.atguigu.eduservice.client;

import com.atguigu.commonutils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component//交给spring管理
@FeignClient("service-vod")//被调用的服务的名字，具体名字在application.properties文件里
public interface VodClient {

    //定义要调用方法的路径

    //根据视频id删除阿里云中的视频
    @DeleteMapping("/eduvod/video/removeAlyVideo/{id}")//路径写全
    public R removeAlyVideo(@PathVariable("id") String id);
    //@PathVariable注解一定要指定参数名称，否则出错

}