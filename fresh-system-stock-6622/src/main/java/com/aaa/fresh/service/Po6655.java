package com.aaa.fresh.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

@Service
@FeignClient(value = "fresh-system-po")
public interface Po6655 {

}
