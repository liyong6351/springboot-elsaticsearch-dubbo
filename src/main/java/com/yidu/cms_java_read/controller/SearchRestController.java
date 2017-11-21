package com.yidu.cms_java_read.controller;

import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restful/search")
public class SearchRestController {
    @Autowired
    private TransportClient client;

    @RequestMapping(value = "/client/{articleId}")
    public GetResponse test(@PathVariable String articleId) {
        GetResponse response = client.prepareGet("menu", "food", "home_302049").get();
        return response;
    }
}
