// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;

/**
 * Data security mode decides what data governance model to use when accessing data from a cluster.
 *
 * <ul>
 *   <li>{@code DATA_SECURITY_MODE_AUTO}: Databricks will choose the most appropriate access mode
 *       depending on your compute configuration.
 *   <li>{@code DATA_SECURITY_MODE_STANDARD}: A secure cluster that can be shared by multiple users.
 *       Cluster users are fully isolated so that they cannot see each other’s data and credentials.
 *       Most data governance features are supported in this mode. But programming languages and
 *       cluster features might be limited.
 *   <li>{@code DATA_SECURITY_MODE_DEDICATED}: A secure cluster that can only be exclusively used by
 *       a single user specified in {@code single_user_name}. Most programming languages, cluster
 *       features and data governance features are available in this mode.
 * </ul>
 *
 * <p>The following modes are legacy aliases for the above modes:
 *
 * <ul>
 *   <li>{@code USER_ISOLATION}: Legacy alias for {@code DATA_SECURITY_MODE_STANDARD}.
 *   <li>{@code SINGLE_USER}: Legacy alias for {@code DATA_SECURITY_MODE_DEDICATED}.
 * </ul>
 *
 * <p>The following modes are deprecated starting with Databricks Runtime 15.0 and will be removed
 * for future Databricks Runtime versions:
 *
 * <ul>
 *   <li>{@code LEGACY_TABLE_ACL}: This mode is for users migrating from legacy Table ACL clusters.
 *   <li>{@code LEGACY_PASSTHROUGH}: This mode is for users migrating from legacy Passthrough on
 *       high concurrency clusters.
 *   <li>{@code LEGACY_SINGLE_USER}: This mode is for users migrating from legacy Passthrough on
 *       standard clusters.
 *   <li>{@code LEGACY_SINGLE_USER_STANDARD}: This mode provides a way that doesn’t have UC nor
 *       passthrough enabled.
 * </ul>
 */
@Generated
public enum DataSecurityMode {
  DATA_SECURITY_MODE_AUTO, // <Databricks> will choose the most appropriate access mode depending on
  // your
  // compute configuration.
  DATA_SECURITY_MODE_DEDICATED, // A secure cluster that can only be exclusively used by a single
  // user specified
  // in `single_user_name`. Most programming languages, cluster features and data
  // governance features are available in this mode.
  DATA_SECURITY_MODE_STANDARD, // A secure cluster that can be shared by multiple users. Cluster
  // users are
  // fully isolated so that they cannot see each other’s data and credentials.
  // Most data governance features are supported in this mode. But programming
  // languages and cluster features might be limited.
  LEGACY_PASSTHROUGH, // This mode is for users migrating from legacy Passthrough on high
  // concurrency
  // clusters.
  LEGACY_SINGLE_USER, // This mode is for users migrating from legacy Passthrough on standard
  // clusters.
  LEGACY_SINGLE_USER_STANDARD, // This mode provides a way that doesn’t have UC nor passthrough
  // enabled.
  LEGACY_TABLE_ACL, // This mode is for users migrating from legacy Table ACL clusters.
  NONE,
  SINGLE_USER, // Legacy alias for `DATA_SECURITY_MODE_DEDICATED`.
  USER_ISOLATION, // Legacy alias for `DATA_SECURITY_MODE_STANDARD`.
}
