package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedRGBA;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class TestBenchColor {

    private NormalizedColorSensor colorSensor;

    public enum DetectedColor {
        RED,
        BLUE,
        YELLOW,
        UNKNOWN
    }

    public void init(HardwareMap hwMap){
        colorSensor = hwMap.get(NormalizedColorSensor.class,"sensor_color_distance");
        colorSensor.setGain(8);
    }

    public DetectedColor getDetectedColor(Telemetry telemetry ) {
        NormalizedRGBA colors = colorSensor.getNormalizedColors();

        float normRed, normGreen, normBlue;
        normRed = colors.red / colors.alpha;
        normGreen = colors.green / colors.alpha;
        normBlue = colors.blue / colors.alpha;

        telemetry.addData("Red",normRed);
        telemetry.addData("Green",normGreen);
        telemetry.addData("Blue",normBlue);

        if(normRed > 0.35 && normGreen < 0.3 && normBlue < 0.3) {
            return DetectedColor.RED;
        }
        else{
            return DetectedColor.UNKNOWN;
        }

    }

}
