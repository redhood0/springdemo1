package redhood.com.demo1.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redhood.com.demo1.model.Book;

/**
 * @PackgeName: redhood.com.demo1.web
 * @ClassName: HelloController
 * @Author: redhood
 * Date: 2020/3/9 9:25
 * project name: demo1
 * @Version:
 * @Description:
 */
@RestController
@RequestMapping("/")
public class HelloController {
    @Autowired
    Book book;
    @GetMapping("/hello")
    public String hello() {
        System.out.println(book);
        return "<h2>"+book+"</h2>";
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable(value = "name") String name) {
        return "Hello," + name;
    }

}
