package com.example.springordersample.components;

import com.example.springordersample.common.Priority;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class A_OrderOnlyTransactionalPrecedence implements Priority {
    @Override
    public String getOrder() {
        return this.getClass().getSimpleName();
    }
}
