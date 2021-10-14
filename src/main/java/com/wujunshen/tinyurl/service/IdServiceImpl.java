package com.wujunshen.tinyurl.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lufengxiang
 * @since 2021/10/14
 **/
//@Service
public class IdServiceImpl implements IdService {

    @Resource
    SnowFlake snowFlake;

    @Override
    public long genId() {
        return snowFlake.nextId();
    }
}
