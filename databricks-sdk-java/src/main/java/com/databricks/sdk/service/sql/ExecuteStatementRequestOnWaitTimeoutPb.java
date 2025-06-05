// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

/**
 * When `wait_timeout > 0s`, the call will block up to the specified time. If the statement
 * execution doesn't finish within this time, `on_wait_timeout` determines whether the execution
 * should continue or be canceled. When set to `CONTINUE`, the statement execution continues
 * asynchronously and the call returns a statement ID which can be used for polling with
 * :method:statementexecution/getStatement. When set to `CANCEL`, the statement execution is
 * canceled and the call returns with a `CANCELED` state.
 */
