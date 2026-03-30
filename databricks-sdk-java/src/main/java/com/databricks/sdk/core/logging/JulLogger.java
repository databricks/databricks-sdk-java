package com.databricks.sdk.core.logging;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/** Delegates logging calls to a {@code java.util.logging.Logger}, translating SLF4J conventions. */
class JulLogger extends Logger {

  private static final String LOGGING_PACKAGE = "com.databricks.sdk.core.logging.";

  private final java.util.logging.Logger delegate;

  JulLogger(java.util.logging.Logger delegate) {
    this.delegate = delegate;
  }

  @Override
  public void debug(String msg) {
    log(Level.FINE, msg, null);
  }

  @Override
  public void debug(String format, Object... args) {
    log(Level.FINE, format, args);
  }

  @Override
  public void debug(Supplier<String> msgSupplier) {
    if (delegate.isLoggable(Level.FINE)) {
      log(Level.FINE, msgSupplier.get(), null);
    }
  }

  @Override
  public void info(String msg) {
    log(Level.INFO, msg, null);
  }

  @Override
  public void info(String format, Object... args) {
    log(Level.INFO, format, args);
  }

  @Override
  public void info(Supplier<String> msgSupplier) {
    if (delegate.isLoggable(Level.INFO)) {
      log(Level.INFO, msgSupplier.get(), null);
    }
  }

  @Override
  public void warn(String msg) {
    log(Level.WARNING, msg, null);
  }

  @Override
  public void warn(String format, Object... args) {
    log(Level.WARNING, format, args);
  }

  @Override
  public void warn(Supplier<String> msgSupplier) {
    if (delegate.isLoggable(Level.WARNING)) {
      log(Level.WARNING, msgSupplier.get(), null);
    }
  }

  @Override
  public void error(String msg) {
    log(Level.SEVERE, msg, null);
  }

  @Override
  public void error(String format, Object... args) {
    log(Level.SEVERE, format, args);
  }

  @Override
  public void error(Supplier<String> msgSupplier) {
    if (delegate.isLoggable(Level.SEVERE)) {
      log(Level.SEVERE, msgSupplier.get(), null);
    }
  }

  private void log(Level level, String format, Object[] args) {
    if (!delegate.isLoggable(level)) {
      return;
    }
    Throwable thrown = (args != null) ? extractThrowable(format, args) : null;
    String message = (args != null) ? formatMessage(format, args) : format;
    LogRecord record = new LogRecord(level, message);
    record.setLoggerName(delegate.getName());
    if (thrown != null) {
      record.setThrown(thrown);
    }
    inferCaller(record);
    delegate.log(record);
  }

  /**
   * Sets the source class and method on a {@link LogRecord} by walking the call stack to find the
   * first frame outside this logging package.
   *
   * <p>JUL normally infers caller information automatically by scanning the stack for the first
   * frame after its own {@code java.util.logging.Logger} methods. Because {@code JulLogger} wraps
   * the JUL logger, that automatic inference stops at {@code JulLogger} or its helper methods
   * instead of reaching the actual SDK class that initiated the log call. Without this correction,
   * every log record would be attributed to {@code JulLogger}, making JUL output useless for
   * identifying the real call site.
   */
  private static void inferCaller(LogRecord record) {
    StackTraceElement[] stack = new Throwable().getStackTrace();
    for (StackTraceElement frame : stack) {
      if (!frame.getClassName().startsWith(LOGGING_PACKAGE)) {
        record.setSourceClassName(frame.getClassName());
        record.setSourceMethodName(frame.getMethodName());
        return;
      }
    }
  }

  /**
   * Replaces SLF4J-style {@code {}} placeholders with argument values, matching the semantics of
   * SLF4J's {@code MessageFormatter.arrayFormat}:
   *
   * <ul>
   *   <li>A trailing {@link Throwable} is unconditionally excluded from formatting.
   *   <li>A backslash before {@code {}} escapes it as a literal {@code {}}.
   *   <li>Array arguments are rendered with {@link Arrays#deepToString}.
   *   <li>A {@code null} format string returns {@code null}.
   * </ul>
   */
  static String formatMessage(String format, Object[] args) {
    if (format == null) {
      return null;
    }
    if (args == null || args.length == 0) {
      return format;
    }
    int usableArgs = args.length;
    if (args[usableArgs - 1] instanceof Throwable) {
      usableArgs--;
    }
    StringBuilder sb = new StringBuilder(format.length() + 32);
    int argIdx = 0;
    int i = 0;
    while (i < format.length()) {
      if (i + 1 < format.length() && format.charAt(i) == '{' && format.charAt(i + 1) == '}') {
        if (i > 0 && format.charAt(i - 1) == '\\') {
          sb.setLength(sb.length() - 1);
          sb.append("{}");
        } else if (argIdx < usableArgs) {
          sb.append(renderArg(args[argIdx++]));
        } else {
          sb.append("{}");
        }
        i += 2;
      } else {
        sb.append(format.charAt(i));
        i++;
      }
    }
    return sb.toString();
  }

  private static String renderArg(Object arg) {
    if (arg == null) {
      return "null";
    }
    if (arg instanceof Object[]) {
      return Arrays.deepToString((Object[]) arg);
    }
    if (arg.getClass().isArray()) {
      return primitiveArrayToString(arg);
    }
    return arg.toString();
  }

  private static String primitiveArrayToString(Object array) {
    if (array instanceof boolean[]) return Arrays.toString((boolean[]) array);
    if (array instanceof byte[]) return Arrays.toString((byte[]) array);
    if (array instanceof char[]) return Arrays.toString((char[]) array);
    if (array instanceof short[]) return Arrays.toString((short[]) array);
    if (array instanceof int[]) return Arrays.toString((int[]) array);
    if (array instanceof long[]) return Arrays.toString((long[]) array);
    if (array instanceof float[]) return Arrays.toString((float[]) array);
    if (array instanceof double[]) return Arrays.toString((double[]) array);
    return Arrays.deepToString(new Object[] {array});
  }

  /**
   * Returns the last argument if it is a {@link Throwable}, unconditionally. This matches SLF4J's
   * {@code NormalizedParameters.getThrowableCandidate}, which always extracts a trailing Throwable
   * regardless of how many {@code {}} placeholders the format string contains.
   */
  static Throwable extractThrowable(String format, Object[] args) {
    if (args == null || args.length == 0) {
      return null;
    }
    Object last = args[args.length - 1];
    if (last instanceof Throwable) {
      return (Throwable) last;
    }
    return null;
  }
}
