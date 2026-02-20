package com.databricks.sdk.core.error;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.error.details.ErrorDetails;
import com.databricks.sdk.core.http.Response;
import com.databricks.sdk.support.InternalApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.api.client.util.Strings;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.IOUtils;

/** Helper methods for inspecting the response and errors thrown during API requests. */
@InternalApi
public class ApiErrors {
  private static final ObjectMapper MAPPER = new ObjectMapper();
  private static final Pattern HTML_ERROR_REGEX = Pattern.compile("<pre>(.*)</pre>");
  private static final ErrorMapper ERROR_MAPPER = new ErrorMapper();
  private static final String SCIM_NULL_DETAILS = "null";

  // Empty error details used to normalize errors with no error details.
  private static final ErrorDetails DEFAULT_ERROR_DETAILS = ErrorDetails.builder().build();

  public static DatabricksError getDatabricksError(Response response) {
    // Private link error handling depends purely on the response URL without
    // looking at the error body.
    if (PrivateLinkInfo.isPrivateLinkRedirect(response)) {
      return ERROR_MAPPER.apply(response, new ApiErrorBody());
    }

    Optional<ApiErrorBody> optionalErrorBody = parseApiError(response);
    if (!optionalErrorBody.isPresent()) {
      // Purely infer the error based on its status code.
      return ERROR_MAPPER.apply(response, new ApiErrorBody());
    }

    ApiErrorBody errorBody = optionalErrorBody.get();

    // TODO: normalization should ideally happen at API call level,
    // allowing each method to control its own normalization.
    normalizeError(errorBody);

    return ERROR_MAPPER.apply(response, errorBody);
  }

  private static void normalizeError(ApiErrorBody errorBody) {
    // Guarantee that all errors have an ErrorDetails container even
    // if it does not contains any specific error details.
    if (errorBody.getErrorDetails() == null) {
      errorBody.setErrorDetails(DEFAULT_ERROR_DETAILS);
    }

    // Error messages from older APIs used a different field to pass the
    // error message. We keep this code for backward compatibility until
    // these APIs are fully deprecated.
    if (!Strings.isNullOrEmpty(errorBody.getApi12Error())) {
      errorBody.setMessage(errorBody.getApi12Error());
      return;
    }

    if (!Strings.isNullOrEmpty(errorBody.getMessage())) {
      return;
    }

    // SCIM error handling.
    //
    // TODO: This code is brittle and should likely be refactored to a more
    // robust solution to detect SCIM errors. This will likely involve
    // parsing the SCIM error at the API call level rather than normalizing.
    if (Strings.isNullOrEmpty(errorBody.getScimDetail())) {
      return;
    }
    if (SCIM_NULL_DETAILS.equals(errorBody.getScimDetail())) {
      errorBody.setMessage("SCIM API Internal Error");
    } else {
      errorBody.setMessage(errorBody.getScimDetail());
    }
    if (!Strings.isNullOrEmpty(errorBody.getScimType())) {
      String message = errorBody.getScimType() + " " + errorBody.getMessage();
      errorBody.setMessage(message.trim());
    }
    if (!Strings.isNullOrEmpty(errorBody.getScimStatus())) {
      errorBody.setErrorCode("SCIM_" + errorBody.getScimStatus());
    }
  }

  /**
   * The response is either a JSON response or a webpage. In the JSON case, it is parsed normally;
   * in the webpage case, the relevant error metadata is extracted from the response using a
   * heuristic-based approach.
   */
  private static Optional<ApiErrorBody> parseApiError(Response response) {
    InputStream in = response.getBody();
    if (in == null) {
      return Optional.empty();
    }

    // Read the body now, so we can try to parse as JSON and then
    // fallback to old error handling logic.
    String body;
    try {
      body = IOUtils.toString(in, StandardCharsets.UTF_8);
    } catch (IOException e) {
      throw new DatabricksException("Unable to read response body", e);
    }

    if (Strings.isNullOrEmpty(body)) {
      return Optional.empty();
    }

    try {
      return Optional.of(MAPPER.readValue(body, ApiErrorBody.class));
    } catch (IOException e) {
      return Optional.of(parseUnknownError(response, body, e));
    }
  }

  private static ApiErrorBody parseUnknownError(Response response, String body, IOException err) {
    ApiErrorBody errorBody = new ApiErrorBody();
    String[] statusParts = response.getStatus().split(" ", 2);
    if (statusParts.length < 2) {
      errorBody.setErrorCode("UNKNOWN");
    } else {
      String errorCode = statusParts[1].replaceAll("^[ .]+|[ .]+$", "");
      errorBody.setErrorCode(errorCode.replaceAll(" ", "_").toUpperCase());
    }

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
}
