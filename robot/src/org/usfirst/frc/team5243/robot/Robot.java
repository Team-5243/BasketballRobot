
package org.usfirst.frc.team5243.robot;

import org.usfirst.frc.team5243.robot.commands.Shoot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	RobotDrive drive;
	OI oi = new OI();

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		drive = new RobotDrive(RobotMap.frontLeft,RobotMap.backLeft,RobotMap.frontRight,RobotMap.backRight);
		Scheduler.getInstance().run();
		System.out.println("Robot init");
    }
	
	public void disabledPeriodic() {
		//Scheduler.getInstance().run();
	}

    public void autonomousInit() {

    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    // 
    public void teleopInit() {
    	Scheduler.getInstance().run();
    	
    	// This piece of code is passing an instance of the shoot command
    	// to the "shoot" JoyStick button from OI
    	System.out.println("teleopInit");
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){
    	
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
       Scheduler.getInstance().run();
       drive.mecanumDrive_Cartesian(OI.Leftjoy().getX(), -1*OI.Rightjoy().getX(), -1*OI.Leftjoy().getY(), 0); 
       //System.out.println("Teleop Periodic");
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
