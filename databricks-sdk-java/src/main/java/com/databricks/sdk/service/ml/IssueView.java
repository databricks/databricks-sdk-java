// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;

/**
 * Which fields each search result includes: BASIC has every field except `description`, and may
 * omit large `metadata` entries; FULL has every field.
 */
@Generated
public enum IssueView {
  BASIC,
  FULL,
}
