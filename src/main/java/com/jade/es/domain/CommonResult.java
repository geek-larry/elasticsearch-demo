package com.jade.es.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @description:
 * @date: 2022/10/29
 **/
@Data
@AllArgsConstructor
public class CommonResult<T> {

    private String message;
    private Integer code;


}
