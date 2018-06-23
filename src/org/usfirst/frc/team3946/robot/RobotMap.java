/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3946.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
		//Drivetrain
		public static int frontLeft = 1;
		public static int frontRight = 2;
		public static int backLeft =3;
		public static int backRight = 4;
		public static int gyro = 1;

		//Operator Interface
		public static int leftJoystick = 0;
		public static int rightJoystick = 1;
		public static int driverController = 2;
		
		//Intake
		public static int sparkIntakeMotor1 = 1;
		public static int sparkIntakeMotor2 = 2;
		public static int cubeSensorA = 1;
		public static int cubeSensorB = 2;
		public static int solenoid1 = 1;
		public static int solenoid2 = 0;

}
