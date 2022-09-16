package com.example.springordersample.components;

import com.example.springordersample.common.Priority;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Order(Ordered.HIGHEST_PRECEDENCE)
@Component
@Transactional
public class OrderHighestWithTransactionalPrecedence implements Priority {
    @Override
    public String getOrder() {
        return this.getClass().getSimpleName();
    }
}
