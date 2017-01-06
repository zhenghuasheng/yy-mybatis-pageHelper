package com.yy.sms.service;

import com.yy.sms.mapper.ConsumerMapper;
import com.yy.sms.model.Consumer;
import com.yy.sms.model.ConsumerExample;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhenghuasheng on 2017/1/6.10:51
 */
@Service
public class ConsumerService {

    @Autowired
    private ConsumerMapper consumerMapper;

    private static Logger logger = LoggerFactory.getLogger(ConsumerService.class);

    /**
     * 方式1：PageHelper.startPage(pageNum,pageSize)静态方法
     * http://www.oschina.net/news/79808/mybatis-page-helper-4-2-0
     * https://github.com/pagehelper/Mybatis-PageHelper
     * 利用pageHelper插件分页，page对象中包含总数和分页信息，但不能直接返回，需自定义对象接受数据
     * @param pageNum
     * @param pageSize
     * @return
     */
//    public List<Consumer> getConsumerList(Integer pageNum, Integer pageSize) {
//        Page<Consumer> page = PageHelper.startPage(pageNum,pageSize);
//       return consumerMapper.selectByExample(new ConsumerExample());
//    }


    /**
     * 方式2：RowBounds
     * 分页介绍：http://blog.csdn.net/u012562943/article/details/51838759
     * @param pageNum
     * @param pageSize
     * @return
     */
    public List<Consumer> getConsumerList(Integer pageNum, Integer pageSize) {
        return consumerMapper.selectByExample(new ConsumerExample(),new RowBounds(pageNum, pageSize));
    }
}
