package org.zkz.es.web;

import org.springframework.web.bind.annotation.*;
import org.zkz.es.dto.Message;
import org.zkz.es.entity.EsItem;
import org.zkz.es.service.ItemService;

import java.util.List;

/**
 * @Author Yoke
 * @Date 2018/12/13 下午12:10
 */
@RestController
@RequestMapping("/shopping-es")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/search")
    public Object searchByKey(@RequestParam("keyword") String key,
                               @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {

        return itemService.getByKey(key, page - 1, limit);
    }

    @PostMapping("/recommend")
    public Object recommend(@RequestParam Integer page, @RequestParam Integer limit,
                             @RequestBody List<String> itemIds) {
        return itemService.recommend(itemIds, page - 1, limit);
    }

    @RequestMapping("/sync")
    public Message syncData() {
        List<EsItem> list = itemService.syncData();
        return Message.success(list);
    }

}
