package sensorval;

import java.util.List;

public class SensorValidator {
	private static boolean checkIfSensorExceedsMaxDeflectionForTwoConsecutiveReadings(double value, double nextValue,
			double maxDelta) {
		if (nextValue - value > maxDelta) {
			return false;
		}
		return true;
	}

	public static boolean validateSensorReadings(List<Double> values) {
		if (validateInputValues(values)) {
			int lastButOneIndex = getLastButOneIndex(values);
			return checkIfTheSensorIsGoodOrNoisy(values, lastButOneIndex);
		}
		return false;
	}

	private static boolean validateInputValues(List<Double> values) {
		return null != values && values.size() > 0;
	}

	private static int getLastButOneIndex(List<Double> values) {
		return values.size() - 1;
	}

	private static boolean checkIfTheSensorIsGoodOrNoisy(List<Double> valuesToCheck, int lastButOneIndex) {
		for (int i = 0; i < lastButOneIndex; i++) {
			if (!checkIfSensorExceedsMaxDeflectionForTwoConsecutiveReadings(valuesToCheck.get(i),
					valuesToCheck.get(i + 1), 0.05)) {
				return false;
			}
		}
		return true;
	}
}
