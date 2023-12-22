package com.databricks.sdk.core.error;

import com.databricks.sdk.core.DatabricksError;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract class AbstractErrorMapper {
  @FunctionalInterface
  protected interface Rule {
    DatabricksError create(String message, List<ErrorDetail> details);
  }

  public DatabricksError apply(int code, ApiErrorBody errorBody) {
    String message = errorBody.getMessage();
    String errorCode = errorBody.getErrorCode();
    List<ErrorDetail> details = errorBody.getErrorDetails();
    if (statusCodeMapping.containsKey(code)) {
      return statusCodeMapping.get(code).create(message, details);
    }
    if (errorCodeMapping.containsKey(errorCode)) {
      return errorCodeMapping.get(errorCode).create(message, details);
    }
    return new DatabricksError(errorCode, message, code, details);
  }

  private final Map<Integer, Rule> statusCodeMapping = new HashMap<>();
  private final Map<String, Rule> errorCodeMapping = new HashMap<>();

  protected void statusCode(int code, Rule rule) {
    statusCodeMapping.put(code, rule);
  }

  protected void errorCode(String errorCode, Rule rule) {
    errorCodeMapping.put(errorCode, rule);
  }
}
