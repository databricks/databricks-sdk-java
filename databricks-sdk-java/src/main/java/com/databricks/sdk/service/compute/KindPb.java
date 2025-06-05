// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

/**
 * The kind of compute described by this compute specification.
 *
 * <p>Depending on `kind`, different validations and default values will be applied.
 *
 * <p>Clusters with `kind = CLASSIC_PREVIEW` support the following fields, whereas clusters with no
 * specified `kind` do not. * [is_single_node](/api/workspace/clusters/create#is_single_node) *
 * [use_ml_runtime](/api/workspace/clusters/create#use_ml_runtime) *
 * [data_security_mode](/api/workspace/clusters/create#data_security_mode) set to
 * `DATA_SECURITY_MODE_AUTO`, `DATA_SECURITY_MODE_DEDICATED`, or `DATA_SECURITY_MODE_STANDARD`
 *
 * <p>By using the [simple form], your clusters are automatically using `kind = CLASSIC_PREVIEW`.
 *
 * <p>[simple form]: https://docs.databricks.com/compute/simple-form.html
 */
