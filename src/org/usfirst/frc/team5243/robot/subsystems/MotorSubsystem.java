package org.usfirst.frc.team5243.robot.subsystems;

import org.usfirst.frc.team5243.robot.OI;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

public class MotorSubsystem extends Subsystem {

	//public Jaguar frontLeft = new Jaguar(9);
	//public Jaguar frontRight = new Jaguar(8);
	//public Jaguar backLeft = new Jaguar(6);
	//public Jaguar backRight = new Jaguar(7);

	@Override
	protected void initDefaultCommand() {

	}

	public void Strafe() {
		/*frontLeft.set(OI.Leftjoy().getX());
		frontRight.set(-OI.Leftjoy().getX());
		backLeft.set(-OI.Leftjoy().getX());
		backRight.set(OI.Leftjoy().getX());*/
	}
	public void Vert(){
		/*frontLeft.set(OI.Leftjoy().getY());
		frontRight.set(OI.Leftjoy().getY());
		backLeft.set(OI.Leftjoy().getY());
		backRight.set(OI.Leftjoy().getY());
	*/}

	/*public Jaguar getfLeft() {
		return frontLeft;
	}

	public Jaguar getfRight() {
		return frontRight;
	}

	public Jaguar getbRight() {
		return backRight;
	}

	public Jaguar getbLeft() {
		return backLeft;
	}*/

}
