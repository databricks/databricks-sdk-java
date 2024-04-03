// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error.platform;

import com.databricks.sdk.core.error.ErrorDetail;
import com.databricks.sdk.support.Generated;
import java.util.List;

/** operation was rejected due a conflict with an existing resource */
@Generated
public class AlreadyExists extends ResourceConflict {
  public AlreadyExists(String message, List<ErrorDetail> details) {
    super("ALREADY_EXISTS", message, details);
  }
}
