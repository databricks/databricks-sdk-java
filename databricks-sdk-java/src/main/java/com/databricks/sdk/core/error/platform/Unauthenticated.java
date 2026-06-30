// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error.platform;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.core.error.details.ErrorDetails;
import com.databricks.sdk.support.Generated;

/** the request does not have valid authentication (AuthN) credentials for the operation */
@Generated
public class Unauthenticated extends DatabricksError {
  public Unauthenticated(String message, ErrorDetails details) {
    super("UNAUTHENTICATED", message, 401, details);
  }

  public Unauthenticated(String errorCode, String message, ErrorDetails details) {
    super(errorCode, message, 401, details);
  }
}
