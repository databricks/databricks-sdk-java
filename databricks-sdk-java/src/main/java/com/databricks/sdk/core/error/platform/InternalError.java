// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error.platform;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.core.error.ErrorDetail;
import com.databricks.sdk.support.Generated;
import java.util.List;

/** some invariants expected by the underlying system have been broken */
@Generated
public class InternalError extends DatabricksError {
  public InternalError(String message, List<ErrorDetail> details) {
    super("INTERNAL_ERROR", message, 500, details);
  }

  public InternalError(String errorCode, String message, List<ErrorDetail> details) {
    super(errorCode, message, 500, details);
  }
}
