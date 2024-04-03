// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error.platform;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.core.error.ErrorDetail;
import com.databricks.sdk.support.Generated;
import java.util.List;

/** the operation is not implemented or is not supported/enabled in this service */
@Generated
public class NotImplemented extends DatabricksError {
  public NotImplemented(String message, List<ErrorDetail> details) {
    super("NOT_IMPLEMENTED", message, 501, details);
  }

  public NotImplemented(String errorCode, String message, List<ErrorDetail> details) {
    super(errorCode, message, 501, details);
  }
}
