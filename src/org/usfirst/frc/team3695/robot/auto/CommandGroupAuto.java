package org.usfirst.frc.team3695.robot.auto;

import org.usfirst.frc.team3695.robot.commands.*; // when the commands are ready, load each individually to decrease runtime
import org.usfirst.frc.team3695.robot.enumeration.Autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;


public class CommandGroupAuto extends CommandGroup {
		
	public CommandGroupAuto(Autonomous auto) {
		// make sure everything is in the right state/position here
		// EX: making sure flap is closed
		
		switch(auto) {
		case NOTHING:
			break;
		// add case for each auto option, put command sequence in each

		}
	}
}
