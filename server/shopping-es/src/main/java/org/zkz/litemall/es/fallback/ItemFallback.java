package org.zkz.litemall.es.fallback;

import org.springframework.stereotype.Component;
import org.zkz.litemall.es.entity.EsItem;
import org.zkz.litemall.es.feign.ItemFeign;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Yoke
 * @Date 2019/01/28 下午8:32
 */
@Component
public class ItemFallback implements ItemFeign {

    @Override
    public List<EsItem> fetch() {
        List<EsItem> list = new ArrayList<>();
        return list;
    }

}
