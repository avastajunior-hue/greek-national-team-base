package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.openftc.easyopencv.OpenCvCameraBase;

public class RumbleTest extends OpMode {
    double endGameStart;
    boolean isEndGame;

    @Override
    public void init() {

    }

    @Override
    public void start() {
        endGameStart = getRuntime() + 90;
    }

    @Override
    public void loop() {
        if (endGameStart >= getRuntime() && !isEndGame) {
            gamepad1.rumbleBlips(3);
            isEndGame = true;
        }

    }
}



/*        isA = gamepad1.a;
        if (isA && !wasA){
            gamepad1.rumble(100);
        }
        wasA = isA;*/