package com.stephen.persionnal.spring.transaction.service.impl;

import com.stephen.persionnal.spring.transaction.service.BookShopService;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;

public class BookShopServiceImpl implements BookShopService {

    //@Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public void purchase(int uid) {

    }
}
