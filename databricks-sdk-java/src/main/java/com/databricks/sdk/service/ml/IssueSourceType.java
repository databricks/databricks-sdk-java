// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;

/**
 * What created an Issue: ADHOC_RUN, an issue detection run started on demand; SCHEDULED_RUN, one
 * started by a schedule; SINGLE_TRACE_ANALYSIS, an analysis of a single trace; or MANUAL, a person.
 */
@Generated
public enum IssueSourceType {
  ADHOC_RUN,
  MANUAL,
  SCHEDULED_RUN,
  SINGLE_TRACE_ANALYSIS,
}
