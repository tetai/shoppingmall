package org.zkz.es.feign;

//import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.zkz.es.entity.EsItem;
import org.zkz.es.fallback.ItemFallback;

import java.util.List;

/**
 * @Author Yoke
 * @Date 2019/01/16 下午9:02
 */
@FeignClient(value = "shopping-wx-api:8082", fallback = ItemFallback.class)
public interface ItemFeign {

    @GetMapping("/wx/goods/queryAll")
    // 默认就是post,即使写的是get请求
    List<EsItem> fetch();

}
