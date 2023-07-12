// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * The file type of log delivery.
 * 
 * * If `log_type` is `BILLABLE_USAGE`, this value must be `CSV`. Only the CSV
 * (comma-separated values) format is supported. For the schema, see the [View
 * billable usage] * If `log_type` is `AUDIT_LOGS`, this value must be `JSON`.
 * Only the JSON (JavaScript Object Notation) format is supported. For the
 * schema, see the [Configuring audit logs].
 * 
 * [Configuring audit logs]: https://docs.databricks.com/administration-guide/account-settings/audit-logs.html
 * [View billable usage]: https://docs.databricks.com/administration-guide/account-settings/usage.html
 */
@Generated
public enum OutputFormat{
  CSV,
  JSON,
  
}