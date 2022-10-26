package com.jade.es.domain;

import cn.easyes.annotation.IndexField;
import cn.easyes.annotation.IndexId;
import cn.easyes.annotation.IndexName;
import lombok.Data;

/**
 * @description:
 * @date: 2022/10/25
 **/
@Data
@IndexName("document")
public class Document {

    @IndexId
    private String id;

    private String title;

    // 场景一:标记es中不存在的字段
    @IndexField(exist = false)
    private String notExistsField;

    // 场景二:更新时,此字段非空字符串才会被更新
//    @IndexField(strategy = FieldStrategy.NOT_EMPTY)
//    private String creator;

    // 场景三: 指定fieldData
//    @IndexField(fieldType = FieldType.TEXT, fieldData = true)
//    private String filedData;

    // 场景四:自定义字段名
    @IndexField("wu-la")
    private String ula;

    // 场景五:支持日期字段在es索引中的format类型
//    @IndexField(fieldType = FieldType.DATE, dateFormat = "yyyy-MM-dd HH:mm:ss||yyyy-MM-dd||epoch_millis")
//    private String gmtCreate;

    // 场景六:支持指定字段在es索引中的分词器类型
//    @IndexField(fieldType = FieldType.TEXT, analyzer = Analyzer.IK_SMART, searchAnalyzer = Analyzer.IK_MAX_WORD)
    private String content;
}

