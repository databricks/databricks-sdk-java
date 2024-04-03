// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error.platform;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.core.error.ErrorDetail;
import com.databricks.sdk.support.Generated;
import java.util.List;

/** the request does not have valid authentication (AuthN) credentials for the operation */
@Generated
public class Unauthenticated extends DatabricksError {
  public Unauthenticated(String message, List<ErrorDetail> details) {
    super("UNAUTHENTICATED", message, 401, details);
  }

  public Unauthenticated(String errorCode, String message, List<ErrorDetail> details) {
    super(errorCode, message, 401, details);
  }
}
