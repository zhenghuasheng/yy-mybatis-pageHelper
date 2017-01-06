package com.yy.sms.controller;

import com.yy.sms.model.Consumer;
import com.yy.sms.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zhenghuasheng on 2017/1/6.11:00
 */
@Controller
@RequestMapping("consumer")
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Consumer> getConsumerList(Integer pageNum, Integer pageSize) {
        return consumerService.getConsumerList(pageNum, pageSize);
    }

}
