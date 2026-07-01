package org.firstinspires.ftc.teamcode.challengethess;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

import org.opencv.core.Mat;


@TeleOp(name = "fgc day 3")
public class PromitheusOpMode extends OpMode {

    public DcMotor leftDrive = null;
    public DcMotor rightDrive = null;
    public DcMotor intake = null;
    public DcMotor outake = null;
    public Servo servo1 = null;
    public Servo servo2 = null;

    private final double DEADZONE = 0.1;
    private final double NORMAL_MULTIPLIER = 0.7;
    private final double TURBO_MULTIPLIER = 1.0;
    private final double SLOW_MULTIPLIER = 0.5;

    @Override
    public void init() {
        leftDrive  = hardwareMap.get(DcMotor.class, "left_drive");
        rightDrive = hardwareMap.get(DcMotor.class, "right_drive");
        intake  = hardwareMap.get(DcMotor.class, "intake");
        outake = hardwareMap.get(DcMotor.class, "outake");
        servo1 = hardwareMap.get(Servo.class, "servo1");
        servo2 = hardwareMap.get(Servo.class, "servo2");

        leftDrive.setDirection(DcMotor.Direction.REVERSE);
        rightDrive.setDirection(DcMotor.Direction.FORWARD);
        intake.setDirection(DcMotorSimple.Direction.REVERSE);
        outake.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    @Override
    public void loop() {
        double forward = gamepad1.left_stick_y;
        double turn = -gamepad1.right_stick_x;

        double leftPower = 0.0;
        double rightPower = 0.0;

        if (Math.abs(forward) < DEADZONE) forward = 0;
        if (Math.abs(turn) < DEADZONE) turn = 0;

        leftPower = forward + turn;
        rightPower = forward - turn;

        double multiplier = NORMAL_MULTIPLIER;

        if (gamepad1.left_trigger > 0.1) {
            multiplier = SLOW_MULTIPLIER;
        } else if (gamepad1.right_trigger > 0.1) {
            multiplier = TURBO_MULTIPLIER;
        }

        leftPower *= multiplier;
        rightPower *= multiplier;

        leftDrive.setPower(leftPower);
        rightDrive.setPower(rightPower);

        intake.setPower(1.0);

        if (gamepad1.right_bumper) {
            outake.setPower(1.0);
        } else {
            outake.setPower(0.0);
        }

        if(gamepad1.a) {
            servo1.setPosition(1.0);
            servo2.setPosition(1.0);
        }

        if (gamepad1.b) {
            servo1.setPosition(-1.0);
            servo2.setPosition(-1.0);
        }

    }
}