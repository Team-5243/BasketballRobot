package org.usfirst.frc.team5243.robot.commands;

import org.usfirst.frc.team5243.robot.OI;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MoveReleased extends Command {
	boolean done;
    public MoveReleased() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	done = false;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	OI.ms.reset();
    	done = true;
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
