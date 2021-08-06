package org.zkz.es.fallback;

import org.springframework.stereotype.Component;
import org.zkz.es.entity.EsItem;
import org.zkz.es.feign.ItemFeign;

import java.util.ArrayList;
import java.util.Collections;
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
        EsItem item = new EsItem();
        item.setcId(1234l);
        item.setName("小米游戏本");
        item.setSale(121);
        item.setSellPoint("让你在游戏的世界里恣意闯荡，亦可在游戏之外更加专注极致地创作，这是我们的初衷。为此，我们邀请多\n" +
                "领域的业内专家，从配置、散热，到键盘、屏幕、音效等进行了系统级的重塑，历经两年，终于将这款小米\n" +
                "游戏本呈现给你。");
        list.add(item);
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        return list;
    }

}
