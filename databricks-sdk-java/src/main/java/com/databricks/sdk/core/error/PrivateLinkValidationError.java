package com.databricks.sdk.core.error;

import com.databricks.sdk.core.error.details.ErrorDetails;
import com.databricks.sdk.core.error.platform.PermissionDenied;

public class PrivateLinkValidationError extends PermissionDenied {
  public PrivateLinkValidationError(String message, ErrorDetails details) {
    super("PRIVATE_LINK_VALIDATION_ERROR", message, details);
  }
}
