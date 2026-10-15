// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;

/**
 * The triage status of an Issue: PENDING means open and awaiting triage, RESOLVED means judged real
 * and addressed, and REJECTED means judged not to be an issue.
 */
@Generated
public enum IssueStatus {
  PENDING,
  REJECTED,
  RESOLVED,
}
