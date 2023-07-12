// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * Warehouse type: `PRO` or `CLASSIC`. If you want to use serverless compute,
 * you must set to `PRO` and also set the field `enable_serverless_compute` to
 * `true`.
 */
@Generated
public enum EditWarehouseRequestWarehouseType{
  CLASSIC,
  PRO,
  TYPE_UNSPECIFIED,
  
}