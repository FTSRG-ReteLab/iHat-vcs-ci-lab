package hu.bme.mit.train.sensor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainUser;

import static org.mockito.Mockito.*;

public class TrainSensorTest {

    TrainSensorImpl sensor;

    TrainUser mockUser;
    TrainController mockController;

    @Before
    public void before() {
        mockController = mock(TrainController.class);
        mockUser = mock(TrainUser.class);

        sensor = new TrainSensorImpl(mockController, mockUser);
    }

    // 1: 600 -> alarm
    // 2: -20 -> alarm
    // 3: 20 -> no alarm
    // 4: mock controller, return ref. speed 50, set speedlimit 20

    @Test
    public void TestSetHighSpeedLimit() {
        sensor.overrideSpeedLimit(600);
        Assert.assertEquals(sensor.getSpeedLimit(), 600);
        verify(mockUser, times(1)).setAlarmState(true);
    }


}
