package com.xinggq.mq;

import com.xinggq.mq.test.MessageProcesser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author xinggq
 * @date 2020/3/18 17:07
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MqApplication.class)
public class MQTest {

  @Autowired
  private MessageProcesser messageProcesser;

  @Test
  public void testPublish(){
    messageProcesser.publisher(String.format("当前时间：%s",System.currentTimeMillis()));
  }

}
