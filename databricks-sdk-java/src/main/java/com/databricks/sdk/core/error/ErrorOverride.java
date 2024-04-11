package com.databricks.sdk.core.error;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Response;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.regex.Pattern;

public class ErrorOverride<T extends DatabricksError> {
  private final String debugName;
  private final Pattern pathRegex;
  private final String verb;
  private final Pattern statusCodeMatcher;
  private final Pattern errorCodeMatcher;
  private final Pattern messageMatcher;
  private final Class<T> customError;

  public ErrorOverride(
      String debugName,
      String pathRegex,
      String verb,
      String statusCodeMatcher,
      String errorCodeMatcher,
      String messageMatcher,
      Class<T> customError) {
    this.debugName = debugName;
    this.pathRegex = ErrorOverride.compilePattern(pathRegex);
    this.verb = verb;
    this.statusCodeMatcher = ErrorOverride.compilePattern(statusCodeMatcher);
    this.errorCodeMatcher = ErrorOverride.compilePattern(errorCodeMatcher);
    this.messageMatcher = ErrorOverride.compilePattern(messageMatcher);
    this.customError = customError;
  }

  public boolean matches(ApiErrorBody body, Response resp) {
    if (!resp.getRequest().getMethod().equals(this.verb)) {
      return false;
    }

    if (this.pathRegex != null
        && !this.pathRegex.matcher(resp.getRequest().getUri().getPath()).matches()) {
      return false;
    }
    String statusCode = Integer.toString(resp.getStatusCode());
    if (this.statusCodeMatcher != null && !this.statusCodeMatcher.matcher(statusCode).matches()) {
      return false;
    }
    if (this.errorCodeMatcher != null
        && !this.errorCodeMatcher.matcher(body.getErrorCode()).matches()) {
      return false;
    }
    // Allow matching substring of the error message.
    if (this.messageMatcher != null && !this.messageMatcher.matcher(body.getMessage()).find()) {
      return false;
    }
    return true;
  }

  public String getDebugName() {
    return this.debugName;
  }

  public T makeError(ApiErrorBody body) {
    Constructor<?>[] constructors = this.customError.getConstructors();
    for (Constructor<?> constructor : constructors) {
      Class<?>[] parameterTypes = constructor.getParameterTypes();
      // All errors have a 2-argument constructor for the message and the error body.
      if (parameterTypes.length == 2
          && parameterTypes[0].equals(String.class)
          && parameterTypes[1].equals(List.class)) {
        try {
          return (T) constructor.newInstance(body.getMessage(), body.getErrorDetails());
        } catch (Exception e) {
          throw new DatabricksException(
              "Error creating custom error for error type " + this.customError.getName(), e);
        }
      }
    }
    throw new DatabricksException(
        "No suitable constructor found for error type " + this.customError.getName());
  }

  private static Pattern compilePattern(String pattern) {
    if (pattern == null || pattern.isEmpty()) {
      return null;
    }
    return Pattern.compile(pattern);
  }
}
