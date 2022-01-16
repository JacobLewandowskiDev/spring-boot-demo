package com.example.springboot;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DataService {

    private final Map<Long, Data> allData = new HashMap<>();

    public DataService() {
        allData.put(1L, new Data(1, "Super name 1"));
        allData.put(2L, new Data(2, "Super name 2"));
    }

    public List<Data> getAllData() {
        return new ArrayList<>(allData.values());
    }

    public void addData(Data data) {
        allData.put(data.id, data);
    }
}
