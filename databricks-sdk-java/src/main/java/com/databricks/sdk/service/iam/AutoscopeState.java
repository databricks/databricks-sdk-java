// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;

/**
 * State of inferred scope collection (autoscope) for an external PAT. Mirrored in
 * databricks.identity.AutoscopeState in common/principal-context/api/proto/tokendetails.proto.
 * Token store and token management proto can depend on this. Principal context proto should NOT
 * depend on this proto definitions because too many services depend on the principal context proto.
 */
@Generated
public enum AutoscopeState {
  AUTOSCOPE_STATE_API_NOT_COVERED,
  AUTOSCOPE_STATE_BACKFILLED,
  AUTOSCOPE_STATE_COMPLETED,
  AUTOSCOPE_STATE_DISABLED,
  AUTOSCOPE_STATE_RUNNING,
  AUTOSCOPE_STATE_USER_SELECTED,
}
