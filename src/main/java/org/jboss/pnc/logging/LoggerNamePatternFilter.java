package org.jboss.pnc.logging;

import java.util.logging.Filter;
import java.util.logging.LogRecord;
import java.util.regex.Pattern;

public class LoggerNamePatternFilter implements Filter {
    private Pattern pattern = Pattern.compile(".*");

    public String getPattern() {
        return pattern.toString();
    }

    public void setPattern(String pattern) {
        this.pattern = Pattern.compile(pattern);
    }

    @Override
    public boolean isLoggable(LogRecord logRecord) {
        return pattern.matcher(logRecord.getLoggerName()).matches();
    }
}
