// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;

/**
 * The kind of compute described by this compute specification.
 *
 * <p>Depending on {@code kind}, different validations and default values will be applied.
 *
 * <p>Clusters with {@code kind = CLASSIC_PREVIEW} support the following fields, whereas clusters
 * with no specified {@code kind} do not.
 *
 * <ul>
 *   <li><a href="/api/workspace/clusters/create#is_single_node">is_single_node</a>
 *   <li><a href="/api/workspace/clusters/create#use_ml_runtime">use_ml_runtime</a>
 * </ul>
 *
 * <p>By using the <a href="https://docs.databricks.com/compute/simple-form.html">simple form</a>,
 * your clusters are automatically using {@code kind = CLASSIC_PREVIEW}.
 */
@Generated
public enum Kind {
  CLASSIC_PREVIEW,
}
