package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class VariableExamples extends OpMode {
    @Override
    public void init(){
        int teamNumber = 67;
        double motorSpeed = 2.333;
        boolean clawClosed = true;
        String teamName = "Greece";
        int motorAngle = 121;

        telemetry.addData("teamNumber", teamNumber);
        telemetry.addData("motorSpeed", motorSpeed);
        telemetry.addData("clawclosed", clawClosed);
        telemetry.addData("teamname", teamName);
        telemetry.addData("motor angle", motorAngle);
    }
    @Override
    public void loop(){
        /*

         */

    }
}