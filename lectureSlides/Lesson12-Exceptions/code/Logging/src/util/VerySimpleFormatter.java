package util;

import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

/**
 * A simple formatter to make log output as simple
 * as possible. This version just displays the Level
 * and the meassage.
 *
 */
public class VerySimpleFormatter extends SimpleFormatter {
	@Override
	public String format(LogRecord record) {
		String retVal = record.getLevel().toString() + ": " +
			record.getMessage() + "\r\n";
		return retVal;
	}
}
