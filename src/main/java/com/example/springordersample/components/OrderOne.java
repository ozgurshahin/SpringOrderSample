package com.example.springordersample.components;

import com.example.springordersample.common.Priority;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(value = 1)
@Component
public class OrderOne implements Priority {
    @Override
    public String getOrder() {
        return this.getClass().getSimpleName();
    }
}
