// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * The current state of enablement for the system schema. An empty string means the system schema is
 * available and ready for opt-in.
 */
@Generated
public enum SystemSchemaInfoState {
  AVAILABLE,
  DISABLE_INITIALIZED,
  ENABLE_COMPLETED,
  ENABLE_INITIALIZED,
  UNAVAILABLE,
}
