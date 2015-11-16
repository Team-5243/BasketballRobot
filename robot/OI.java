package org.usfirst.frc.team5243.robot;


import org.usfirst.frc.team5243.robot.subsystems.MotorSubsystem;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static Joystick Leftjoystick = new Joystick(1);
	public static Joystick Rightjoystick = new Joystick(0);
	public static MotorSubsystem ms = new MotorSubsystem();
	private static Button strafeButton;
	
	public OI(){
		
	}
	public static Joystick Leftjoy(){
		return Leftjoystick;
	}
	public static Joystick Rightjoy(){
		return Rightjoystick;
	}

}

