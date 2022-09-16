package com.example.springordersample.components;

import com.example.springordersample.common.Priority;
import org.springframework.stereotype.Component;

@Component
public class OrderNone implements Priority {
    @Override
    public String getOrder() {
        return this.getClass().getSimpleName();
    }
}
