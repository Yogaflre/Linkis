package com.webank.wedatasphere.linkis.udf.conf;

import com.webank.wedatasphere.linkis.udf.api.rpc.UdfChangedBroadcastListener;
import com.webank.wedatasphere.linkis.udf.service.UDFTreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class UDFSpringConfiguration {

    @Bean
    public UdfChangedBroadcastListener udfChangedBroadcastListener(@Autowired UDFTreeService udfTreeService) {
        return new UdfChangedBroadcastListener(udfTreeService);
    }

}
