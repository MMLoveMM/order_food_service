package cn.psimm.order.modules.order.web.first;

import cn.psimm.order.modules.order.entity.first.Employee;
import cn.psimm.order.modules.order.service.first.EmployeeService;
import com.thinkgem.jeesite.common.web.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 订餐Controller
 */
@Controller
@RequestMapping(value = "${frontPath}/order")
public class OrderPubApiController extends BaseController {
    private static final Logger logger = LoggerFactory.getLogger(OrderPubApiController.class);

    @Autowired
    private EmployeeService employeeService;

    @ResponseBody
    @RequestMapping(value = "/test")
    public Employee test(@RequestParam("name") String name) {
        logger.info("开始查询姓名为: {} 是否存在", name);

        return employeeService.getEmployeeByName(name);
    }
}
