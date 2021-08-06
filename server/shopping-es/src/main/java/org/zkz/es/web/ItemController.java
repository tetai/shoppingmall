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

    @GetMapping("/search/{key}/{page}/{limit}")
    public Message searchByKey(@PathVariable("key") String key,
                               @PathVariable("page") Integer page, @PathVariable("limit") Integer limit) {
        return Message.success(itemService.getByKey(key, page - 1, limit));
    }

    @PostMapping("/recommend/{page}/{limit}")
    public Message recommend(@PathVariable Integer page, @PathVariable Integer limit,
                             @RequestBody List<String> itemIds) {
        return Message.success(itemService.recommend(itemIds, page - 1, limit));
    }

    @RequestMapping("/sync")
    public Message syncData() {
        List<EsItem> list = itemService.syncData();
        return Message.success(list);
    }

}
