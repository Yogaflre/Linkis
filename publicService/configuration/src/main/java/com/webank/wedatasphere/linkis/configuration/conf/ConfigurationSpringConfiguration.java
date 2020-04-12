package com.webank.wedatasphere.linkis.configuration.conf;

import com.webank.wedatasphere.linkis.configuration.service.ConfigChangedBroadcastListener;
import com.webank.wedatasphere.linkis.configuration.service.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * configuration配置
 * wangxy
 */
@Configuration
public class ConfigurationSpringConfiguration {

    @Bean
    public ConfigChangedBroadcastListener configChangedBroadcastListener(@Autowired ConfigurationService configurationService) {
        return new ConfigChangedBroadcastListener(configurationService);
    }
}
