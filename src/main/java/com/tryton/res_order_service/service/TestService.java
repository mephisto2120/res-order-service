package com.tryton.res_order_service.service;

import com.tryton.res_order_service.mapper.TestMapper;
import com.tryton.res_order_service.mapper.XmlTestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    private final TestMapper testMapper;
    private final XmlTestMapper xmlTestMapper;

    @Autowired
    public TestService(TestMapper testMapper, XmlTestMapper xmlTestMapper) {
        this.testMapper = testMapper;
        this.xmlTestMapper = xmlTestMapper;
    }

    public int testCall() {
        return testMapper.testCall();
    }

    public int testCallXml() {
        return xmlTestMapper.testCall();
    }
}