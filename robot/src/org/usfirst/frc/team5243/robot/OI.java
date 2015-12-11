package org.usfirst.frc.team5243.robot;


import org.usfirst.frc.team5243.robot.commands.MoveDown;
import org.usfirst.frc.team5243.robot.commands.MoveReleased;
import org.usfirst.frc.team5243.robot.commands.MoveUp;
import org.usfirst.frc.team5243.robot.commands.Shoot;
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
	Shoot shooter = new Shoot();
	MoveUp mu = new MoveUp();
	MoveDown md = new MoveDown();
	MoveReleased mr = new MoveReleased();
	
	public static Joystick Leftjoystick = new Joystick(1);
	public static Joystick Rightjoystick = new Joystick(0);
	public static MotorSubsystem ms = new MotorSubsystem();
	//private static Button strafeButton;
	public static Button shoot;
	public static Button moveUp;
	public static Button moveDown;
	
	
	public OI(){
		{
			shoot = new JoystickButton(Leftjoystick, 1);
			moveUp= new JoystickButton(Rightjoystick, 2);
			moveDown = new JoystickButton(Rightjoystick, 3);
		}
    	shoot.whenPressed(shooter);
		moveUp.whileActive(mu);
		moveDown.whileActive(md);
		moveUp.whenReleased(mr);
		moveDown.whenReleased(mr);
		//shoot.whenPressed(fire);
	}
	public static Joystick Leftjoy(){
		return Leftjoystick;
	}
	public static Joystick Rightjoy(){
		return Rightjoystick;
	}
	public static Button Shooter(){
		return shoot;
	}

}

