package com.databricks.sdk.client;

import com.databricks.sdk.client.http.Response;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApiErrors {
  private static final Logger LOG = LoggerFactory.getLogger(ApiErrors.class);
  private static final ObjectMapper MAPPER = new ObjectMapper();
  private static final Pattern HTML_ERROR_REGEX = Pattern.compile("<pre>(.*)</pre>");

  private static final List<String> TRANSIENT_ERROR_STRING_MATCHES = Arrays.asList(
      "com.databricks.backend.manager.util.UnknownWorkerEnvironmentException",
      "does not have any associated worker environments",
      "There is no worker environment with id",
      "Unknown worker environment",
      "ClusterNotReadyException",
      "connection reset by peer",
      "TLS handshake timeout",
      "connection refused",
      "Unexpected error",
      "i/o timeout"
  );


  public static CheckForRetryResult checkForRetry(Response response, IOException respErr, byte[] body) {
    if (respErr != null) {
      DatabricksApiException apiError = new DatabricksApiException("IO_ERROR", 523, respErr);
      return new CheckForRetryResult(apiError.isRetriable(), apiError);
    }
    if (response == null) {
      return new CheckForRetryResult(false);
    }
    if (response.getStatusCode() == 429) {
      DatabricksApiException apiError = new DatabricksApiException("TOO_MANY_REQUESTS", "Current request has to be retried", 429);
      return new CheckForRetryResult(true, apiError);
    }
    if (response.getStatusCode() >= 400) {
      DatabricksApiException apiError = parseErrorFromResponse(response, body);
      return new CheckForRetryResult(apiError.isRetriable(), apiError);
    }
    return new CheckForRetryResult(false);
  }

  public static class CheckForRetryResult {
    private boolean shouldRetry;
    private Throwable error;

    public CheckForRetryResult(boolean shouldRetry, Throwable error) {
      this.shouldRetry = shouldRetry;
      this.error = error;
    }

    public CheckForRetryResult(boolean shouldRetry) {
      this(shouldRetry, null);
    }

    public boolean shouldRetry() {
      return shouldRetry;
    }

    public Throwable getError() {
      return error;
    }
  }

  private static DatabricksApiException parseErrorFromResponse(Response response, byte[] body) {
    ApiErrorBody errorBody;
    try {
      errorBody = MAPPER.readValue(body, ApiErrorBody.class);
    } catch (IOException e) {
      errorBody = parseUnknownError(response, e);
    }
    if (errorBody.getApi12Error() != null && !errorBody.getApi12Error().isEmpty()) {
      errorBody.setMessage(errorBody.getApi12Error());
    }
    if (errorBody.getMessage() == null || errorBody.getMessage().isEmpty()) {
      if (errorBody.getScimDetail() != null && !errorBody.getScimDetail().equals("null")) {
        errorBody.setMessage(errorBody.getScimDetail());
      } else {
        errorBody.setMessage("SCIM API Internal Error");
      }
      String message = errorBody.getScimType() + errorBody.getMessage();
      errorBody.setMessage(message.trim());
      errorBody.setErrorCode("SCIM_%s" + errorBody.getScimStatus());
    }
    return new DatabricksApiException(errorBody.getErrorCode(), errorBody.getMessage(), response.getStatusCode());
  }

  private static ApiErrorBody parseUnknownError(Response response, IOException err) {
    ApiErrorBody errorBody = new ApiErrorBody();
    String[] statusParts = response.getStatus().split(" ", 2);
    if (statusParts.length < 2) {
      errorBody.setErrorCode("UNKNOWN");
    } else {
      String errorCode = statusParts[1].replaceAll("^[ .]+|[ .]+$", "");
      errorBody.setErrorCode(errorCode.replaceAll(" ", "_").toUpperCase());
    }

    Matcher messageMatcher = HTML_ERROR_REGEX.matcher(response.getBody());
    if (messageMatcher.find()) {
      errorBody.setMessage(messageMatcher.group(1).replaceAll("^[ .]+|[ .]+$", ""));
    } else {
      errorBody.setMessage(String.format("Response from server (%s) %s: %s",
          response.getStatus(), response.getBody(), err.getMessage()));
    }
    return errorBody;
  }
}
