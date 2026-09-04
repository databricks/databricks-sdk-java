// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * Controls which fields are populated on each ModelService in the response. The server uses `BASIC`
 * when `view` is unset. Callers needing the full configuration must request it explicitly with
 * `view = FULL`.
 */
@Generated
public enum ListModelServicesRequestView {
  BASIC,
  FULL,
}
