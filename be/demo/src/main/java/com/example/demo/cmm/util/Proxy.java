package com.example.demo.cmm.util;

import java.util.function.Consumer;
import java.util.function.Function;

public class Proxy {
    public static Consumer<String> println = System.out::println;
}
