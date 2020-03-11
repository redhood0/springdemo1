package redhood.com.demo1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @PackgeName: redhood.com.demo1.web
 * @ClassName: OldHelloController
 * @Author: redhood
 * Date: 2020/3/9 10:16
 * project name: demo1
 * @Version:
 * @Description:
 */
@Controller
@ResponseBody
@RequestMapping("/old")
public class OldHelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "<h2>Hello,old</h2>";
    }
}
