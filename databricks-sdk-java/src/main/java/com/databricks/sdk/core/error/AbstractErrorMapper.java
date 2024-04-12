package com.databricks.sdk.core.error;

import com.databricks.sdk.core.DatabricksError;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract class AbstractErrorMapper {
  @FunctionalInterface
  protected interface ErrorCodeRule {
    DatabricksError create(String message, List<ErrorDetail> details);
  }

  @FunctionalInterface
  protected interface StatusCodeRule {
    DatabricksError create(String errorCode, String message, List<ErrorDetail> details);
  }

  public DatabricksError apply(int code, ApiErrorBody errorBody) {
    String message = errorBody.getMessage();
    String errorCode = errorBody.getErrorCode();
    List<ErrorDetail> details = errorBody.getErrorDetails();
    if (errorCodeMapping.containsKey(errorCode)) {
      return errorCodeMapping.get(errorCode).create(message, details);
    }
    if (statusCodeMapping.containsKey(code)) {
      return statusCodeMapping.get(code).create(errorCode, message, details);
    }
    return new DatabricksError(errorCode, message, code, details);
  }

  private final Map<Integer, StatusCodeRule> statusCodeMapping = new HashMap<>();
  private final Map<String, ErrorCodeRule> errorCodeMapping = new HashMap<>();

  protected void statusCode(int code, StatusCodeRule rule) {
    statusCodeMapping.put(code, rule);
  }

  protected void errorCode(String errorCode, ErrorCodeRule rule) {
    errorCodeMapping.put(errorCode, rule);
  }
}
