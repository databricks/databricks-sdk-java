// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;

/**
 * Qualifier for type of experiments to be returned. If unspecified, return only active experiments.
 */
@Generated
public enum SearchExperimentsViewType {
  ACTIVE_ONLY,

  ALL,

  DELETED_ONLY,
}
