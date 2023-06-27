// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;

/**
 * The type of the object in workspace.
 *
 * <p>- `NOTEBOOK`: document that contains runnable code, visualizations, and explanatory text. -
 * `DIRECTORY`: directory - `LIBRARY`: library - `FILE`: file - `REPO`: repository
 */
@Generated
public enum ObjectType {
  DIRECTORY,
  FILE,
  LIBRARY,
  NOTEBOOK,
  REPO,
}
