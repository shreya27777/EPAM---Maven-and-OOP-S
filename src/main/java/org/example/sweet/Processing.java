package org.example.sweet;

import java.util.List;

public interface Processing {
    void sort(List<Sweet> list, String parameter);

    void pack();

    void print(List<Sweet> list);
}
