// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error.platform;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.core.error.ErrorDetail;
import com.databricks.sdk.support.Generated;
import java.util.List;

/** the operation was explicitly canceled by the caller */
@Generated
public class Cancelled extends DatabricksError {
  public Cancelled(String message, List<ErrorDetail> details) {
    super("CANCELLED", message, 499, details);
  }

  public Cancelled(String errorCode, String message, List<ErrorDetail> details) {
    super(errorCode, message, 499, details);
  }
}
