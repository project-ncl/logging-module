package org.jboss.pnc.logging;

import java.util.logging.Filter;
import java.util.logging.LogRecord;
import java.util.regex.Pattern;

public class LoggerNamePrefixFilter implements Filter {
    private String prefix = "";

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public boolean isLoggable(LogRecord logRecord) {
        return logRecord.getLoggerName().startsWith(prefix);
    }
}
