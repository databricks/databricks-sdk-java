// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error.platform;

import com.databricks.sdk.core.error.ErrorDetail;
import com.databricks.sdk.support.Generated;
import java.util.List;

/** operation was performed on a resource that does not exist */
@Generated
public class ResourceDoesNotExist extends NotFound {
  public ResourceDoesNotExist(String message, List<ErrorDetail> details) {
    super("RESOURCE_DOES_NOT_EXIST", message, details);
  }
}
