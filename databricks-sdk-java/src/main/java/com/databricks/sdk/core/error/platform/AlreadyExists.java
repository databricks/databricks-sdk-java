// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error.platform;

import com.databricks.sdk.core.error.details.ErrorDetails;
import com.databricks.sdk.support.Generated;

/** operation was rejected due a conflict with an existing resource */
@Generated
public class AlreadyExists extends ResourceConflict {
  public AlreadyExists(String message, ErrorDetails details) {
    super("ALREADY_EXISTS", message, details);
  }
}
