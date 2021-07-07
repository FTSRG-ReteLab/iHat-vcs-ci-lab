package hu.bme.mit.train.sensor;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;

public class TrainSensorImpl implements TrainSensor {

	private TrainController controller;
	private int speedLimit = 10;

	public TrainSensorImpl(TrainController controller) {
		this.controller = controller;
	}

	@Override
	public int getSpeedLimit() {
		return speedLimit;
	}

	@Override
	public void overrideSpeedLimit(int speedLimit) {
		if (speedLimit > 500 ||
			speedLimit < 0 ||
			speedLimit < controller.getReferenceSpeed()*0.5) {
				user.setAlarmState(true);
		}
		if (speedLimit < 0) {
			speedLimit = 0;
		}
		this.speedLimit = speedLimit;
		controller.setSpeedLimit(speedLimit);
		
	}

}
