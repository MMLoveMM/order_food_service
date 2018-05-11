package cn.psimm.order.modules.order;

import com.thinkgem.jeesite.common.web.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 订餐Controller
 */
@Controller
@RequestMapping(value = "${frontPath}/order")
public class OrderController extends BaseController {
    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @RequestMapping(value = "/test")
    @ResponseBody
    public String test() {
        logger.info("test");

        return "Hello World";
    }
}
