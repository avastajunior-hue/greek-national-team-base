package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.mechanisms.TestBenchServo;

@TeleOp
public class ServoExamples extends OpMode {

    TestBenchServo bench = new TestBenchServo();
    double leftTrigger , rightTrigger;

    @Override
    public void init() {
        bench.init(hardwareMap);
        leftTrigger = 0.0;
        rightTrigger = 0.0;

    }

    @Override
    public void loop() {
        rightTrigger = gamepad1.right_trigger;
        leftTrigger = gamepad1.left_trigger;
        bench.setServoRot(rightTrigger);
        bench.setServoPos(leftTrigger);

    }

}
/*        if(gamepad1.a) {
            bench.setServoPos(0);
        }
        else {
            bench.setServoPos(1);
        }

        if (gamepad1.b) {
            bench.setServoRot(1.0);
        }
        else {
            bench.setServoRot(0);
        }*/
