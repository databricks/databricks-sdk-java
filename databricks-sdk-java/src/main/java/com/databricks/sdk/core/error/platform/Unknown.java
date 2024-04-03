// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error.platform;

import com.databricks.sdk.core.error.ErrorDetail;
import com.databricks.sdk.support.Generated;
import java.util.List;

/** this error is used as a fallback if the platform-side mapping is missing some reason */
@Generated
public class Unknown extends InternalError {
  public Unknown(String message, List<ErrorDetail> details) {
    super("UNKNOWN", message, details);
  }
}
