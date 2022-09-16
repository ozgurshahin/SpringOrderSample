package com.example.springordersample.components;

import com.example.springordersample.common.Priority;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(Ordered.HIGHEST_PRECEDENCE)
@Component
public class OrderHighestPrecedence implements Priority {
    @Override
    public String getOrder() {
        return this.getClass().getSimpleName();
    }
}
