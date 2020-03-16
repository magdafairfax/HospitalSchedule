package com.timeslots.demo.entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlPattern {
    public static void main(String[] args) {
        String inputString = "<Comment> 1 2<img>This should be removed</img> 4 </Comment><Link>5 <img>This should be removed</img> " +
                "6</Link> <Comment> 7 <img>This should be removed</img> 8 </Comment>";
        String outputString = inputString.replaceAll("(?s)<img>.*?</img>", "");

        System.out.println( outputString);
    }
}
