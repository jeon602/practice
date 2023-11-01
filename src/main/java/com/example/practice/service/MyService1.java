package com.example.practice.service;

import com.example.practice.dao.MyDao6;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class MyService1 {

    /**
     *
     */
    private final MyDao6 myDao6;

    public void tx1() {
        myDao6.update1();

        int c = 1 / 0; // runtimeException

        myDao6.update2();
    }
}