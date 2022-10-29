package com.jade.es.contrtoller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.jade.es.domain.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @date: 2022/10/26
 **/
@RestController
@RequestMapping("/rateLimit")
public class RateLimitController {

    /**
     * 按资源名称限流，需要指定限流处理逻辑
     * {
     * "msg": "com.alibaba.csp.sentinel.slots.block.flow.FlowException",
     * "code": 200
     * }
     */
    @GetMapping("/byResource")
    @SentinelResource(value = "byResource", blockHandler = "handleException")
    public CommonResult<?> byResource() {
        return new CommonResult<>("按资源名称限流", 200);
    }

    /**
     * 按URL限流，有默认的限流处理逻辑
     * Blocked by Sentinel (flow limiting)
     */
    @GetMapping("/byUrl")
    @SentinelResource(value = "byUrl")
    public CommonResult<?> byUrl() {
        return new CommonResult<>("按url限流", 200);
    }

    public CommonResult<?> handleException(BlockException exception) {
        return new CommonResult<>(exception.getClass().getCanonicalName(), 200);
    }

}
