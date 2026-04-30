// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;

/**
 * Confidential computing technology for GCP instances. Aligns with gcloud's
 * --confidential-compute-type flag and the REST API's
 * confidentialInstanceConfig.confidentialInstanceType field. See:
 * https://cloud.google.com/confidential-computing/confidential-vm/docs/create-a-confidential-vm-instance
 */
@Generated
public enum ConfidentialComputeType {
  CONFIDENTIAL_COMPUTE_TYPE_NONE,
  SEV_SNP,
}
