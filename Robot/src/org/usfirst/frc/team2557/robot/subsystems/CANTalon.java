package org.usfirst.frc.team2557.robot.subsystems;
import java.util.ArrayList;
import java.util.Collections;

import com.ctre.CANTalon;
import 

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CANTalon extends Subsystem {
	ArrayList <Double> distances = new ArrayList();
	public static double distance;
	public static double firstAngle;
	public static double firstDistance;
	public static double lastAngle;
	public static double lastDistance;
	public static boolean startCollection;
	
	
	public void vision() {
		if(distance < 40) {
			startCollection = true;
		}
		
		if(startCollection = true) {
			firstAngle = Lidar.getAngle();
			firstDistance = Lidar.getDistance(firstAngle);
		}
		while(startCollection = true) {
			
			distances.add(Lidar.getDistance(Lidar.getAngle());
			
			if(distance >= 40) {
				lastAngle = Lidar.getAngle();
				lastDistance = Lidar.getDistance(lastAngle);
				
				break;
			}
			break;
		}
		distances.indexOf(Collections.min(distances));
			
	
			
		}
		
	

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

