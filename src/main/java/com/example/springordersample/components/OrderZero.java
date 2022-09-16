package com.example.springordersample.components;

import com.example.springordersample.common.Priority;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(value = 0)
@Component
public class OrderZero implements Priority {
    @Override
    public String getOrder() {
        return this.getClass().getSimpleName();
    }
}
