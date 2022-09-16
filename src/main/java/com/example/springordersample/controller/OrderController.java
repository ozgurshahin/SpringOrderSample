package com.example.springordersample.controller;

import com.example.springordersample.common.Priority;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController("OrderController")
@RequestMapping("/order")
@RequiredArgsConstructor(onConstructor = @__({@Autowired, @NotNull}))
public class OrderController {
    private final List<Priority> priorityList;


    @GetMapping("/getPriorityList")
    public List<Priority> getPriorityList() {
        return priorityList;
    }
}
