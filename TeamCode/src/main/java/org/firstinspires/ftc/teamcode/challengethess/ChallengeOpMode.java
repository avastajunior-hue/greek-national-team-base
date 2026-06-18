package org.firstinspires.ftc.teamcode.challengethess;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class ChallengeOpMode extends OpMode {

    BenchDrive drive = new BenchDrive();
    double throttle;
    double spin;

    @Override
    public void init() {
        drive.init(hardwareMap);

    }

    @Override
    public void loop() {
        throttle = -gamepad1.left_stick_y;
        spin = gamepad1.left_stick_x;

        drive.drive(throttle, spin);
    }
}
