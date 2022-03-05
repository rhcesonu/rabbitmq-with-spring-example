package com.samual.consumer;

import com.samual.config.Config;
import com.samual.dto.OrderStatus;
import com.samual.services.PaymentLogService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// # ref : SearchJobEventObserverV3

@Component
public class User {

    @Autowired
    private PaymentLogService paymentLogService;

    @RabbitListener(queues = Config.QUEUE)
    public void consumeMessageFromQueue(OrderStatus orderStatus){
        paymentLogService.savePaymentLogData(orderStatus);

    }
}
