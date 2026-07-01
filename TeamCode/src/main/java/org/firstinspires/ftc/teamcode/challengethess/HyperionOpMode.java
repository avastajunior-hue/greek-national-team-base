package org.firstinspires.ftc.teamcode.challengethess;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "fgc day 2")
public class HyperionOpMode extends OpMode {

    DrivetrainPovDrive drive = new DrivetrainPovDrive();
    double throttle;
    double spin;

    @Override
    public void init() {
        drive.init(hardwareMap);

    }

    @Override
    public void loop() {
        if (gamepad1.right_trigger_pressed) {
            throttle = -gamepad1.left_stick_y;
            spin = gamepad1.right_stick_x;

            drive.drive(throttle,spin);
        }
        else {
            throttle = -gamepad1.left_stick_y;
            spin = gamepad1.right_stick_x;

            drive.drive(throttle * 0.5, spin * 0.5);
        }
        telemetry.addData("SPIN",spin);
        telemetry.addData("throttle",throttle);
    }
}
