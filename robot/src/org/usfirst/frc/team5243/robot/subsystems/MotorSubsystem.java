package org.usfirst.frc.team5243.robot.subsystems;

import org.usfirst.frc.team5243.robot.OI;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class MotorSubsystem extends Subsystem {

	public Victor turner = new Victor(0);

	@Override
	protected void initDefaultCommand() {

	}

	public void moveUp(){
		turner.set(.4);
	}
	public void moveDown(){
		turner.set(-.4);
	}
	public void reset(){
		turner.set(0);
	}

}
