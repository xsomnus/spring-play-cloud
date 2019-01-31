package com.xsomnus.spring.elk.service;

import org.elasticsearch.client.ElasticsearchClient;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author somnus_xiawenye
 * @since 2019/1/31 0031 13:45
 */
public class ElasticAPIService {


    @Autowired
    ElasticsearchClient elasticsearchClient;

    public void createIndex() {

    }

}
