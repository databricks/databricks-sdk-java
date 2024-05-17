package com.databricks.sdk.core.error;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.core.http.Response;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

abstract class AbstractErrorMapper {
  private static final Logger LOG = LoggerFactory.getLogger(AbstractErrorMapper.class);

  @FunctionalInterface
  protected interface ErrorCodeRule {
    DatabricksError create(String message, List<ErrorDetail> details);
  }

  @FunctionalInterface
  protected interface StatusCodeRule {
    DatabricksError create(String errorCode, String message, List<ErrorDetail> details);
  }

  public DatabricksError apply(Response resp, ApiErrorBody errorBody) {
    for (ErrorOverride<?> override : ErrorOverrides.ALL_OVERRIDES) {
      if (override.matches(errorBody, resp)) {
        LOG.debug(
            "Overriding error with {} (original status code: {}, original error code: {})",
            override.getDebugName(),
            resp.getStatusCode(),
            errorBody.getErrorCode());
        return override.makeError(errorBody);
      }
    }
    int code = resp.getStatusCode();
    String message = errorBody.getMessage();
    String errorCode = errorBody.getErrorCode();
    List<ErrorDetail> details = errorBody.getErrorDetails();
    if (errorCodeMapping.containsKey(errorCode)) {
      return errorCodeMapping.get(errorCode).create(message, details);
    }
    if (statusCodeMapping.containsKey(code)) {
      return statusCodeMapping.get(code).create(errorCode, message, details);
    }
    if (PrivateLinkInfo.isPrivateLinkRedirect(resp)) {
      return PrivateLinkInfo.createPrivateLinkValidationError(resp);
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
