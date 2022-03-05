package com.samual.repository;

import com.samual.dto.OrderStatus;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PyamentLogRepository extends MongoRepository<OrderStatus,String> {
}
