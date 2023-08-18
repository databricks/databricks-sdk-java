package com.databricks.sdk.core.error;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Helper methods for inspecting the response and errors thrown during API requests. */
public class ApiErrors {
  private static final ObjectMapper MAPPER = new ObjectMapper();
  private static final Pattern HTML_ERROR_REGEX = Pattern.compile("<pre>(.*)</pre>");

  public static DatabricksError checkForRetry(Response out, Exception error) {
    if (error != null) {
      // If the endpoint did not respond to the request, interpret the exception.
      return new DatabricksError("IO_ERROR", 523, error);
    } else if (out.getStatusCode() == 429) {
      return new DatabricksError("TOO_MANY_REQUESTS", "Current request has to be retried", 429);
    } else if (out.getStatusCode() >= 400) {
      return readErrorFromResponse(out);
    } else {
      // The request succeeded; do not retry.
      return new DatabricksError(out.getStatusCode());
    }
  }

  private static DatabricksError readErrorFromResponse(Response response) {
    ApiErrorBody errorBody = parseApiError(response);

    // Condense API v1.2 and SCIM error string and code into the message and errorCode fields of
    // DatabricksApiException.
    if (errorBody.getApi12Error() != null && !errorBody.getApi12Error().isEmpty()) {
      errorBody.setMessage(errorBody.getApi12Error());
    }
    if (errorBody.getMessage() == null || errorBody.getMessage().isEmpty()) {
      if (errorBody.getScimDetail() != null && !"null".equals(errorBody.getScimDetail())) {
        errorBody.setMessage(errorBody.getScimDetail());
      } else {
        errorBody.setMessage("SCIM API Internal Error");
      }
      String message = errorBody.getScimType() + " " + errorBody.getMessage();
      errorBody.setMessage(message.trim());
      errorBody.setErrorCode("SCIM_" + errorBody.getScimStatus());
    }
    return new DatabricksError(
        errorBody.getErrorCode(), errorBody.getMessage(), response.getStatusCode());
  }

  /**
   * The response is either a JSON response or a webpage. In the JSON case, it is parsed normally;
   * in the webpage case, the relevant error metadata is extracted from the response using a
   * heuristic-based approach.
   */
  private static ApiErrorBody parseApiError(Response response) {
    try {
      return MAPPER.readValue(response.getBody(), ApiErrorBody.class);
    } catch (IOException e) {
      return parseUnknownError(response, e);
    }
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

    String body = convert(response.getBody());
    Matcher messageMatcher = HTML_ERROR_REGEX.matcher(body);
    if (messageMatcher.find()) {
      errorBody.setMessage(messageMatcher.group(1).replaceAll("^[ .]+|[ .]+$", ""));
    } else {
      errorBody.setMessage(
          String.format(
              "Response from server (%s) %s: %s", response.getStatus(), body, err.getMessage()));
    }
    return errorBody;
  }

  private static String convert(InputStream in) {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    while (true) {
      try {
        int data = in.read();
        if (data == -1) {
          break;
        }
        out.write(data);
      } catch (IOException e) {
        throw new DatabricksException("failed to read response body", e);
      }
    }
    return new String(out.toByteArray(), StandardCharsets.UTF_8);
  }
}
