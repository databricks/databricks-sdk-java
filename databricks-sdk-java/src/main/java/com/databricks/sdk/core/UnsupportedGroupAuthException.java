package com.databricks.sdk.core;

import com.databricks.sdk.support.InternalApi;

/** Indicates that an authentication strategy cannot assume a group. */
@InternalApi
public class UnsupportedGroupAuthException extends DatabricksException {
  public UnsupportedGroupAuthException(String message) {
    super(message);
  }
}
