package org.zkz.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.modelmapper.ModelMapper;

/**
 * @Author Yoke
 * @Date 2018/12/07 上午9:28
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class ElasticSearchApplication {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

    public static void main(String[] args) {
        SpringApplication.run(ElasticSearchApplication.class, args);
    }

}
