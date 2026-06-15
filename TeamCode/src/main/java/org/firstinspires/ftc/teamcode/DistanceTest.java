package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.mechanisms.TestBenchDistance;

public class DistanceTest extends OpMode {
    TestBenchDistance bench = new TestBenchDistance();
    @Override
    public void init() {
        bench.init(hardwareMap);

    }

    @Override
    public void loop() {
        telemetry.addData("Distance",bench.getDistance());
        if(bench.getDistance() < 10 ) {
            telemetry.addLine("too close!");
        }

    }
}
