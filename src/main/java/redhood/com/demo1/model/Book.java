package redhood.com.demo1.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @PackgeName: redhood.com.demo1.model
 * @ClassName: Book
 * @Author: redhood
 * Date: 2020/3/11 9:06
 * project name: demo1
 * @Version:
 * @Description:
 */
@Data
@ToString
@Component
@ConfigurationProperties(prefix = "book")

public class Book {
    @Value(value = "${book.name}")
    private String name;
    @Value(value = "${book.author}")
    private String author;
    @Value(value = "${book.price}")
    private Float price;
    @Value(value = "${book.describe}")
    private String desc;

}
