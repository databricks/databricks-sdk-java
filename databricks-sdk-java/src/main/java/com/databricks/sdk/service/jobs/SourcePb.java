// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

/**
 * Optional location type of the SQL file. When set to `WORKSPACE`, the SQL file will be retrieved\
 * from the local Databricks workspace. When set to `GIT`, the SQL file will be retrieved from a Git
 * repository defined in `git_source`. If the value is empty, the task will use `GIT` if
 * `git_source` is defined and `WORKSPACE` otherwise.
 *
 * <p>* `WORKSPACE`: SQL file is located in Databricks workspace. * `GIT`: SQL file is located in
 * cloud Git provider.
 */
