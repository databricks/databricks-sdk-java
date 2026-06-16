// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;

/**
 * Controls how the Data API exposes the OpenAPI documentation endpoint. Only IGNORE_PRIVILEGES and
 * DISABLED are supported today; "follow-privileges" is not implemented yet (it may be added later
 * as value 3 — adding new enum values is backward-compatible).
 */
@Generated
public enum OpenApiMode {
  OPEN_API_MODE_DISABLED,
  OPEN_API_MODE_IGNORE_PRIVILEGES,
}
