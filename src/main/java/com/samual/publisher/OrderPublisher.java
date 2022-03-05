package com.samual.publisher;


import com.samual.config.Config;
import com.samual.dto.Order;
import com.samual.dto.OrderStatus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrderPublisher {

    @Autowired
    private RabbitTemplate template;

    @PostMapping("/{restaurantName}")
    public String bookOrder(@RequestBody Order order, @PathVariable String restaurantName){

        order.setOrderId(UUID.randomUUID().toString());
        OrderStatus orderStatus=new OrderStatus(order,"PROCESS","order successfully placed in "+restaurantName);

        template.convertAndSend(Config.EXCHANGE,Config.ROUTINGKEY,orderStatus);
        return  "successful !!";

    }
}
