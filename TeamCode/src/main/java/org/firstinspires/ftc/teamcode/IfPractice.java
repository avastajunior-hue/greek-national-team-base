package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class IfPractice extends OpMode {

    @Override
    public void init() {


    }

    @Override
    public void loop() {
       double motorSpeed = gamepad1.left_stick_y;
       boolean aButton = gamepad1.a;

       if (!aButton) {
           motorSpeed *= motorSpeed*0.5;
        }
       else {
           motorSpeed *= motorSpeed*1;
       }

        telemetry.addData("Left Stick Value",motorSpeed);
    }

}

