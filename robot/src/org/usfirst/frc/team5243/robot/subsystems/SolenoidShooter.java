package org.usfirst.frc.team5243.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class SolenoidShooter extends Subsystem {
    
    public Solenoid solly = new Solenoid(0,0);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void turnOn() {
    	solly.set(true);
    }
    public void turnOff() {
    	solly.set(false);
    }
    public boolean getState() {
    	return solly.get();
    }
}

