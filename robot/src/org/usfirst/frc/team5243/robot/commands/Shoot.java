package org.usfirst.frc.team5243.robot.commands;

import org.usfirst.frc.team5243.robot.subsystems.SolenoidShooter;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Shoot extends Command {

	public SolenoidShooter bob = new SolenoidShooter();
	public boolean done;
    public Shoot() {
        // Use requires() here to declare subsystem dependencies
    	System.out.println("Shoot");
        requires(bob);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	//System.out.println("hello");
    	System.out.println("Bob's state: " + bob.getState());
    }

    // Called repeatedly when this Command is scheduled to run    
    // Ben here. I think the possible issue would be that this method is being called
    // multiple times each time the Shoot Command is executed as... well, the comment
    // above this one states that execute() is "called repeatedly" when the Command is
    // scheduled to run. Perhaps we should implement a way to make execute only run once
    // each time you execute the Shoot command see if that fixes it
    protected void execute() {
    	bob.turnOn();
    	try {
			wait(5000);//make 50
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	bob.turnOff();
    	done = true;
    	System.out.println("gratata");
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return done;
    }

    // Called once after isFinished returns true
    protected void end() {
    	done = false;
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }

}
