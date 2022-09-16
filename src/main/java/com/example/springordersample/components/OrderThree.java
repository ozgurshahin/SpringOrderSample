package com.example.springordersample.components;

import com.example.springordersample.common.Priority;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(value = 3)
@Component
public class OrderThree implements Priority {
    @Override
    public String getOrder() {
        return this.getClass().getSimpleName();
    }
}
