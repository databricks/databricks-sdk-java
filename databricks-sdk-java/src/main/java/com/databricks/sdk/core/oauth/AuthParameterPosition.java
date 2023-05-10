package com.databricks.sdk.core.oauth;

/** Options for where authentication parameters can be provided in a request. */
public enum AuthParameterPosition {
  /** The parameter should be passed as part of the Authorization header. */
  HEADER,

  /** The parameter should be passed as a form field. */
  BODY,
}
