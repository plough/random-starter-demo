package com.plough.random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author plough
 * @date 2019/11/9
 */
public class RandomChoiceMachine {
    private List<String> list;
    private int num;

    public RandomChoiceMachine(List<String> list, int num) {
        this.list = new ArrayList<>(list);
        this.num = num;
        assert this.num <= this.list.size();
    }

    public List<String> next() {
        Collections.shuffle(list);
        return new ArrayList<>(list.subList(0, num));
    }
}
