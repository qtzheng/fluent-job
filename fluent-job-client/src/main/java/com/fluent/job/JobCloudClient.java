package com.fluent.job;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "",url = "",configuration = JobCloudFeignClientConfig.class)
public interface JobCloudClient extends MessageUp{
}
