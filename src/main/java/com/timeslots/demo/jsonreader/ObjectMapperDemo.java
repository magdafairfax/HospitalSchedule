package com.timeslots.demo.jsonreader;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.timeslots.demo.entity.Hospital;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.io.IOException;
public class ObjectMapperDemo {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    public Hospital readJsonWithObjectMapper() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Hospital hospital = objectMapper.readValue(new File("C:\\WorkArea\\Tutorials\\Practice\\timeslots\\src\\main\\resources\\hospital.json"), Hospital.class);
        logger.info(hospital.toString());
        System.out.println("Test hospital : " +hospital.toString());
        return hospital;
    }
}
