package com.icom.demo.controller;

import com.icom.demo.model.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    private List<Test> tests = new ArrayList<>();

    public TestController() {
        tests.add(new Test(7219,"นางสาว สิราพร นามสมติ","ME","Nov/2020", "FYC", "OL", 1122345, "SC", "1P05", 1250.50 ));
        tests.add(new Test(7219,"นางสาว สิราพร นามสมติ","ME","Nov/2020", "FYC", "SP", 1122355, "SC", "7B08", 1699.00 ));
        tests.add(new Test(7219,"นางสาว สิราพร นามสมติ","ME","Nov/2020", "RYC", "OL", 1122378, "BC", "1P05", 3249.87 ));
        tests.add(new Test(7219,"นางสาว สิราพร นามสมติ","ME","Nov/2020", "RYC", "OL", 1122904, "SC", "1P05", 405.60 ));
        tests.add(new Test(1,"นาย อิสรภาพ สกุลวงษ์","ME","Oct/2020", "RYC", "OL", 1122378, "BC", "1P05", 3249.87 ));
    }
    @GetMapping("/test")
    public List<Test> getTests() {
        return tests;
    }

}
