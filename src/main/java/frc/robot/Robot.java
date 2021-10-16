package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends TimedRobot {
  private final double defaultShootSpeed = 0.7;
  private final double defaultDriveSpeed = 0.4;
  private final double defaultTurnSpeed = 0.2;

  @Override
  public void robotInit() {
    SmartDashboard.putNumber("avian/drive_speed", defaultDriveSpeed);
    SmartDashboard.putNumber("avian/turn_speed", defaultTurnSpeed);
    SmartDashboard.putNumber("avian/shoot_speed", defaultShootSpeed);
  }

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {
    double driveSpeed = SmartDashboard.getNumber("avian/drive_speed", defaultDriveSpeed);
    double turnSpeed = SmartDashboard.getNumber("avian/turn_speed", defaultTurnSpeed);
    double shootSpeed = SmartDashboard.getNumber("avian/shoot_speed", defaultShootSpeed);

    boolean leftPinch = SmartDashboard.getBoolean("avian/left_pinch", false);
    boolean rightPinch = SmartDashboard.getBoolean("avian/right_pinch", false);
    boolean leftIndex = SmartDashboard.getBoolean("avian/left_index_finger", false);
    boolean rightIndex = SmartDashboard.getBoolean("avian/right_index_finger", false);
    boolean leftMiddle = SmartDashboard.getBoolean("avian/left_middle_finger", false);
    boolean rightMiddle = SmartDashboard.getBoolean("avian/right_middle_finger", false);

    if (leftPinch && rightPinch) {
      System.out.println("Left and right pinch");
    }
  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}
}
