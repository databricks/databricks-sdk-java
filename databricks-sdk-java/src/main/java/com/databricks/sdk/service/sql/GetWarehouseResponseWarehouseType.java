// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;

/**
 * Warehouse type: `PRO` or `CLASSIC`. If you want to use serverless compute, you must set to `PRO`
 * and also set the field `enable_serverless_compute` to `true`.
 */
@Generated
public enum GetWarehouseResponseWarehouseType {
  CLASSIC,

  PRO,

  TYPE_UNSPECIFIED,
}
