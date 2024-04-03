// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error;

import com.databricks.sdk.support.Generated;
import java.util.List;

/** operation was rejected due a conflict with an existing resource */
@Generated
public class ResourceAlreadyExists extends ResourceConflict {
  public ResourceAlreadyExists(String message, List<ErrorDetail> details) {
    super("RESOURCE_ALREADY_EXISTS", message, details);
  }
}
