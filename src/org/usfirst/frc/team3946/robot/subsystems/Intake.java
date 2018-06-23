package org.usfirst.frc.team3946.robot.subsystems;

import org.usfirst.frc.team3946.robot.Robot;
import org.usfirst.frc.team3946.robot.RobotMap;
import org.usfirst.frc.team3946.robot.commands.IntakeStop;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Intake extends Subsystem {
	
	public Spark intakeMotor1 = new Spark(RobotMap.sparkIntakeMotor1);
	public Spark intakeMotor2 = new Spark(RobotMap.sparkIntakeMotor2);
	public Solenoid solenoid1 = new Solenoid(RobotMap.solenoid1);
	public Solenoid solenoid2 = new Solenoid(RobotMap.solenoid2);
	public DigitalInput cubeSensorA = new DigitalInput(RobotMap.cubeSensorA);
	public DigitalInput cubeSensorB = new DigitalInput(RobotMap.cubeSensorB);

	public void OpenIntake() {
		solenoid1.set(true);
	}
	
	public void CloseIntake() {
		solenoid1.set(false);
	}
	
	public void Intake45Deg() {
		solenoid2.set(true);
	}
	
	public void Intake0Deg() {
		solenoid2.set(false);
	}
	
	public boolean CheckCube() {
		boolean cubeA = cubeSensorA.get();
		boolean cubeB = cubeSensorB.get();
		
		return cubeA && cubeB;
	}
	
	public void CubeIn() {
		intakeMotor1.set(1);
		intakeMotor2.set(-1);
	}
	
	public void CubeOut() {
		intakeMotor1.set(-1);
		intakeMotor2.set(1);
	}
	
    public void initDefaultCommand() {
    	setDefaultCommand(new IntakeStop());
    }
}
