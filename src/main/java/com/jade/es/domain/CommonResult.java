package com.jade.es.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @date: 2022/10/26
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommonResult {

    private String msg;
    private Integer code;

}
