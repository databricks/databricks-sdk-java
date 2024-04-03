// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error.platform;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.core.error.ErrorDetail;
import com.databricks.sdk.support.Generated;
import java.util.List;

/** the request is invalid */
@Generated
public class BadRequest extends DatabricksError {
  public BadRequest(String message, List<ErrorDetail> details) {
    super("BAD_REQUEST", message, 400, details);
  }

  public BadRequest(String errorCode, String message, List<ErrorDetail> details) {
    super(errorCode, message, 400, details);
  }
}
