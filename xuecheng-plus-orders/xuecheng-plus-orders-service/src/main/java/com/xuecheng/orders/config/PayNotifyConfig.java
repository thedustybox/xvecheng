package com.xuecheng.orders.config;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class PayNotifyConfig {

  //交换机
  public static final String PAYNOTIFY_EXCHANGE_FANOUT = "paynotify_exchange_fanout";

  //支付结果处理反馈队列
  public static final String PAYNOTIFY_REPLY_QUEUE = "paynotify_reply_queue";


  //声明交换机
  @Bean(PAYNOTIFY_EXCHANGE_FANOUT)
  public FanoutExchange paynotify_exchange_fanout(){
     // 三个参数：交换机名称、是否持久化、当没有queue与其绑定时是否自动删除
     return new FanoutExchange(PAYNOTIFY_EXCHANGE_FANOUT, true, false);
  }


  //支付结果回复队列
  @Bean(PAYNOTIFY_REPLY_QUEUE)
  public Queue msgnotify_result_queue(){
      return QueueBuilder.durable(PAYNOTIFY_REPLY_QUEUE).build();
  }

}
