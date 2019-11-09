package com.plough.random;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author plough
 * @date 2019/11/9
 */
@ConfigurationProperties(prefix="demo.random.choice")
public class RandomChoiceProperties {

    private List<String> items = new ArrayList<>();
    private int num = 1;

    public List<String> getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = Arrays.asList(items.split(","));
    }

    public int getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = Integer.parseInt(num);
    }
}
