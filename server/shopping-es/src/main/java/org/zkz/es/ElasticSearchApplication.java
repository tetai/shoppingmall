package org.zkz.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author Yoke
 * @Date 2018/12/07 上午9:28
 */
//@EnableFeignClients
@SpringBootApplication
public class ElasticSearchApplication {

//	@Bean
//	public ModelMapper modelMapper() {
//		return new ModelMapper();
//	}

    public static void main(String[] args) {
        SpringApplication.run(ElasticSearchApplication.class, args);
    }

}
