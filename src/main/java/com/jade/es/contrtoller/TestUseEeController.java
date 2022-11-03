package com.jade.es.contrtoller;

import cn.easyes.core.conditions.LambdaEsQueryWrapper;
import com.jade.es.domain.Document;
import com.jade.es.mapper.DocumentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @date: 2022/10/25
 **/
@RestController("es")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TestUseEeController {
    private final DocumentMapper documentMapper;

    @GetMapping("/insert")
    public Integer insert() {
        // 初始化-> 新增数据
        Document document = new Document();
        document.setTitle("larry");
        document.setContent("larry is cool");
        document.setUla("ula");
        return documentMapper.insert(document);
    }

    @GetMapping("/search")
    public Long search() {
        LambdaEsQueryWrapper<Document> wrapper = new LambdaEsQueryWrapper<>();
//        wrapper.eq(Document::getTitle, "老汉");
        return documentMapper.selectCount(wrapper);
    }
}

