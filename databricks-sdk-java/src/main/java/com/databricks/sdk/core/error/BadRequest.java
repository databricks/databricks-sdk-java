// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.support.Generated;
import java.util.List;

/** the request is invalid */
@Generated
public class BadRequest extends DatabricksError {
  public BadRequest(String message, List<ErrorDetail> details) {
    super("BAD_REQUEST", message, 400, details);
  }

  BadRequest(String errorCode, String message, int statusCode, List<ErrorDetail> details) {
    super(errorCode, message, statusCode, details);
  }
}
