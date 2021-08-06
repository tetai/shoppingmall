package org.zkz.litemall.admin.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.zkz.litemall.admin.annotation.RequiresPermissionsDesc;
import org.zkz.litemall.core.util.ResponseUtil;
import org.zkz.litemall.core.validator.Order;
import org.zkz.litemall.core.validator.Sort;
import org.zkz.litemall.db.domain.LitemallAddress;
import org.zkz.litemall.db.service.LitemallAddressService;
import org.zkz.litemall.db.service.LitemallRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/address")
@Validated
public class AdminAddressController {
    private final Log logger = LogFactory.getLog(AdminAddressController.class);

    @Autowired
    private LitemallAddressService addressService;
    @Autowired
    private LitemallRegionService regionService;

    @RequiresPermissions("admin:address:list")
    @RequiresPermissionsDesc(menu = {"用户管理", "收货地址"}, button = "查询")
    @GetMapping("/list")
    public Object list(Integer userId, String name,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
                       @Sort @RequestParam(defaultValue = "add_time") String sort,
                       @Order @RequestParam(defaultValue = "desc") String order) {

        List<LitemallAddress> addressList = addressService.querySelective(userId, name, page, limit, sort, order);
        return ResponseUtil.okList(addressList);
    }
}
