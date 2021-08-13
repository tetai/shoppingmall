package org.zkz.litemall.es.web;

import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.zkz.litemall.core.util.ResponseUtil;
import org.zkz.litemall.core.validator.Order;
import org.zkz.litemall.core.validator.Sort;
import org.zkz.litemall.db.domain.LitemallGoods;
import org.zkz.litemall.db.domain.LitemallSearchHistory;
import org.zkz.litemall.es.dto.Message;
import org.zkz.litemall.es.entity.EsItem;
import org.zkz.litemall.es.service.ItemService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Yoke
 * @Date 2018/12/13 下午12:10
 */
@RestController
@RequestMapping("/shopping-es")
@Validated
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/search")
    public Object searchByKey(@RequestParam("keyword") String key,
                               @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
        Page<EsItem> pagedList = itemService.getByKey(key, page - 1, limit);

        Map<String, Object> entity = new HashMap<>();
        entity.put("list", pagedList.getContent());
        entity.put("total", pagedList.getTotalElements());
        entity.put("page", pagedList.getNumber() + 1);
        entity.put("limit", pagedList.getSize());
        entity.put("pages", pagedList.getTotalPages());

        // 因为这里需要返回额外的filterCategoryList参数，因此不能方便使用ResponseUtil.okList
        return ResponseUtil.ok(entity);
    }

//    @PostMapping("/recommend")
//    public Object recommend(@RequestParam Integer page, @RequestParam Integer limit,
//                             @RequestBody List<String> itemIds) {
//        return itemService.recommend(itemIds, page - 1, limit);
//    }

    @RequestMapping("/sync")
    public Message syncData() {
        List<EsItem> list = itemService.syncData();
        return Message.success(list);
    }

}
