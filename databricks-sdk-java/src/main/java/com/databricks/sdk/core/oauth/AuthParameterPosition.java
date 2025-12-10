package com.databricks.sdk.core.oauth;

import com.databricks.sdk.support.InternalApi;

/** Options for where authentication parameters can be provided in a request. */
@InternalApi
public enum AuthParameterPosition {
  /** The parameter should be passed as part of the Authorization header. */
  HEADER,

  /** The parameter should be passed as a form field. */
  BODY,
}
