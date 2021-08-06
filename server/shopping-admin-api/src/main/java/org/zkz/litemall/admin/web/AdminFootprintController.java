package org.zkz.litemall.admin.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.zkz.litemall.admin.annotation.RequiresPermissionsDesc;
import org.zkz.litemall.core.util.ResponseUtil;
import org.zkz.litemall.core.validator.Order;
import org.zkz.litemall.core.validator.Sort;
import org.zkz.litemall.db.domain.LitemallFootprint;
import org.zkz.litemall.db.service.LitemallFootprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/footprint")
@Validated
public class AdminFootprintController {
    private final Log logger = LogFactory.getLog(AdminFootprintController.class);

    @Autowired
    private LitemallFootprintService footprintService;

    @RequiresPermissions("admin:footprint:list")
    @RequiresPermissionsDesc(menu = {"用户管理", "用户足迹"}, button = "查询")
    @GetMapping("/list")
    public Object list(String userId, String goodsId,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
                       @Sort @RequestParam(defaultValue = "add_time") String sort,
                       @Order @RequestParam(defaultValue = "desc") String order) {
        List<LitemallFootprint> footprintList = footprintService.querySelective(userId, goodsId, page, limit, sort,
                order);
        return ResponseUtil.okList(footprintList);
    }
}
