package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class UseRobotLocationOpMode extends OpMode {

    RobotLocationPractise robotLocationPractise = new RobotLocationPractise(0);


    @Override
    public void init() {
        robotLocationPractise.setAngle(0);
        robotLocationPractise.setX(0);
        robotLocationPractise.setY(0);
    }

    @Override
    public void loop() {
        if (gamepad1.a) {
            robotLocationPractise.turnRobot(0.1);
        }
        else if (gamepad1.b) {
            robotLocationPractise.turnRobot(-0.1);
        }

        if (gamepad1.dpad_left) {
            robotLocationPractise.changeX(0.1);

        }
        else if (gamepad1.dpad_right) {
            robotLocationPractise.changeX(-0.1);

        }
        if (gamepad1.dpad_up) {
            robotLocationPractise.changeY(-0.1);
        }
        else if (gamepad1.dpad_down) {
            robotLocationPractise.changeY(0.1);
        }

        telemetry.addData("Heading",robotLocationPractise.getHeading());
        telemetry.addData("Get angle", robotLocationPractise.getAngle());
        telemetry.addData("X value",robotLocationPractise.getX());
        telemetry.addData("Y value", robotLocationPractise.getY());
    }
}
