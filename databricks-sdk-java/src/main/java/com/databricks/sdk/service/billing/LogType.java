// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

/**
 * Log delivery type. Supported values are:
 *
 * <p>* `BILLABLE_USAGE` — Configure [billable usage log delivery]. For the CSV schema, see the
 * [View billable usage].
 *
 * <p>* `AUDIT_LOGS` — Configure [audit log delivery]. For the JSON schema, see [Configure audit
 * logging]
 *
 * <p>[Configure audit logging]:
 * https://docs.databricks.com/administration-guide/account-settings/audit-logs.html [View billable
 * usage]: https://docs.databricks.com/administration-guide/account-settings/usage.html [audit log
 * delivery]: https://docs.databricks.com/administration-guide/account-settings/audit-logs.html
 * [billable usage log delivery]:
 * https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html
 */
public enum LogType {
  AUDIT_LOGS,
  BILLABLE_USAGE,
}
