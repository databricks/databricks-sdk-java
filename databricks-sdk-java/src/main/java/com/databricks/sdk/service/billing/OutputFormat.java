// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

/**
 * The file type of log delivery.
 *
 * <p>* If `log_type` is `BILLABLE_USAGE`, this value must be `CSV`. Only the CSV (comma-separated
 * values) format is supported. For the schema, see the [View billable usage] * If `log_type` is
 * `AUDIT_LOGS`, this value must be `JSON`. Only the JSON (JavaScript Object Notation) format is
 * supported. For the schema, see the [Configuring audit logs].
 *
 * <p>[Configuring audit logs]:
 * https://docs.databricks.com/administration-guide/account-settings/audit-logs.html [View billable
 * usage]: https://docs.databricks.com/administration-guide/account-settings/usage.html
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public enum OutputFormat {
  CSV,
  JSON,
}
