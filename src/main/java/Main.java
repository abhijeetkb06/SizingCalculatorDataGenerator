import lumberjackjson.processor.LumberjackJSONProcessor;
import sizingcalc.input.generator.SizingCalcJSONGenerator;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        SizingCalcJSONGenerator.generateDefaultSizingCalcJSON();
        LumberjackJSONProcessor.processLumberjackJSON();
    }
}
