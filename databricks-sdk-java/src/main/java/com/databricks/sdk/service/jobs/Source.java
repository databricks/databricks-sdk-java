// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;

/**
 * Optional location type of the SQL file. When set to {@code WORKSPACE}, the SQL file will be
 * retrieved from the local Databricks workspace. When set to {@code GIT}, the SQL file will be
 * retrieved from a Git repository defined in {@code git_source}. If the value is empty, the task
 * will use {@code GIT} if {@code git_source} is defined and {@code WORKSPACE} otherwise.
 *
 * <ul>
 *   <li>{@code WORKSPACE}: SQL file is located in Databricks workspace.
 *   <li>{@code GIT}: SQL file is located in cloud Git provider.
 * </ul>
 */
@Generated
public enum Source {
  GIT, // SQL file is located in cloud Git provider.
  WORKSPACE, // SQL file is located in <Databricks> workspace.
}
