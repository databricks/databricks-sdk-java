package com.databricks.sdk.core.error;

import com.databricks.sdk.core.error.platform.PermissionDenied;
import java.util.List;

public class PrivateLinkValidationError extends PermissionDenied {
  public PrivateLinkValidationError(String message, List<ErrorDetail> details) {
    super("PRIVATE_LINK_VALIDATION_ERROR", message, details);
  }
}
