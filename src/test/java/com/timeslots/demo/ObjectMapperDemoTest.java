package com.timeslots.demo;

import com.timeslots.demo.jsonreader.ObjectMapperDemo;
import org.junit.jupiter.api.Test;

public class ObjectMapperDemoTest {
    @Test
    public void testReadJsonWithObjectMapper() throws Exception {
        ObjectMapperDemo obj= new ObjectMapperDemo();
        obj.readJsonWithObjectMapper();
    }
}
