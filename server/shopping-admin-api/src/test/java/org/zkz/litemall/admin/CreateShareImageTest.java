package org.zkz.litemall.admin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.zkz.litemall.core.qcode.QCodeService;
import org.zkz.litemall.db.domain.LitemallGoods;
import org.zkz.litemall.db.service.LitemallGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CreateShareImageTest {
    @Autowired
    QCodeService qCodeService;
    @Autowired
    LitemallGoodsService litemallGoodsService;

    @Test
    public void test() {
        LitemallGoods good = litemallGoodsService.findById(1181010);
        qCodeService.createGoodShareImage(good.getId().toString(), good.getPicUrl(), good.getName());
    }
}
