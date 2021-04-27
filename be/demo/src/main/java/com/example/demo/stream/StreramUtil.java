package com.example.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreramUtil {
    public static List<String> returnList(){
        return Arrays.asList("a","b").stream().sorted().collect(Collectors.toList());
        
    }
}
