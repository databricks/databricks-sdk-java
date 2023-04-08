// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateCustomerManagedKeyRequest {
  /** */
  @JsonProperty("aws_key_info")
  private CreateAwsKeyInfo awsKeyInfo;

  /** The cases that the key can be used for. */
  @JsonProperty("use_cases")
  private java.util.List<KeyUseCase> useCases;

  public CreateCustomerManagedKeyRequest setAwsKeyInfo(CreateAwsKeyInfo awsKeyInfo) {
    this.awsKeyInfo = awsKeyInfo;
    return this;
  }

  public CreateAwsKeyInfo getAwsKeyInfo() {
    return awsKeyInfo;
  }

  public CreateCustomerManagedKeyRequest setUseCases(java.util.List<KeyUseCase> useCases) {
    this.useCases = useCases;
    return this;
  }

  public java.util.List<KeyUseCase> getUseCases() {
    return useCases;
  }
}
