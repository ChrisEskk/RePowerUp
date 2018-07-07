package org.usfirst.frc.team3946.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Autonomous extends CommandGroup {

    public Autonomous() {
        addSequential(new AutoStraight());
        addParallel(new Intake45Deg());
        addSequential(new IntakeCubeOut());
    }
}
