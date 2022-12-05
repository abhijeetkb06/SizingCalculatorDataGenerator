package lumberjackjson.processor;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lumberjack.output.pojo.Response;

import java.io.File;
import java.io.IOException;

public class LumberjackJSONProcessor {

    public static void processLumberjackJSON() throws IOException {
        // Creating the ObjectMapper object
        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        String home = System.getProperty("user.home");
        File json = new File(home+"/Downloads/" + "lumberjackoutput.json");
        Response response = mapper.readValue(json, Response.class);
        System.out.println("Response = " + response);

        System.out.println("response.getData() = " + response.getData().toString());
    }
}
