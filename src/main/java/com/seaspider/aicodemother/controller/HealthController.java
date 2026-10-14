package com.seaspider.aicodemother.controller;

import com.seaspider.aicodemother.common.BaseResponse;
import com.seaspider.aicodemother.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping("/")
    public BaseResponse healthCheck() {
        return ResultUtils.success("ok");
    }
}
