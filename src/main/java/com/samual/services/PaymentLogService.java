package com.samual.services;

import com.samual.dto.OrderStatus;
import com.samual.repository.PyamentLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentLogService {

    @Autowired
    private PyamentLogRepository pyamentLogRepository;

   public void savePaymentLogData(OrderStatus orderStatus){
       try{
           pyamentLogRepository.save(orderStatus);
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
   }
}
