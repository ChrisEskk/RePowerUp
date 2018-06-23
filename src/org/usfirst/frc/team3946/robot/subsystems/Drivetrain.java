package org.usfirst.frc.team3946.robot.subsystems;

import org.usfirst.frc.team3946.robot.Robot;
import org.usfirst.frc.team3946.robot.RobotMap;
import org.usfirst.frc.team3946.robot.commands.DriveDJA;
import org.usfirst.frc.team3946.robot.commands.DriveTDJ;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Drivetrain extends Subsystem {

	public WPI_TalonSRX frontLeft = new WPI_TalonSRX(RobotMap.frontLeft);
	public WPI_TalonSRX frontRight = new WPI_TalonSRX(RobotMap.frontRight);
	public VictorSPX backLeft = new VictorSPX(RobotMap.backLeft);
	public VictorSPX backRight = new VictorSPX(RobotMap.backRight);
	
	public DifferentialDrive diffDrive = new DifferentialDrive(frontLeft, frontRight);

	public AnalogGyro gyro = new AnalogGyro(RobotMap.gyro);
	
	public void GyroStuff() {
		double gyroAngle = gyro.getAngle();
		SmartDashboard.putNumber("Gyro Angle", gyroAngle);
	}
	
	public void TankDrive(double speedLeft, double speedRight) {
		backLeft.follow(frontLeft);
		backRight.follow(frontRight);
		
		diffDrive.tankDrive(speedLeft, speedRight);
	}
	
	public void ArcadeDrive(double forward, double turn) {
		backLeft.follow(frontLeft);
		backRight.follow(frontRight);
		
		diffDrive.arcadeDrive(forward, turn);
	}
	
    public void initDefaultCommand() {
    	setDefaultCommand(new DriveDJA());
    }
}