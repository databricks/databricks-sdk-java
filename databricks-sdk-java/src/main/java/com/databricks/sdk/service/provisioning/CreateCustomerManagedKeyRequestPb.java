// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class CreateCustomerManagedKeyRequestPb {
  @JsonProperty("aws_key_info")
  private CreateAwsKeyInfo awsKeyInfo;

  @JsonProperty("gcp_key_info")
  private CreateGcpKeyInfo gcpKeyInfo;

  @JsonProperty("use_cases")
  private Collection<KeyUseCase> useCases;

  public CreateCustomerManagedKeyRequestPb setAwsKeyInfo(CreateAwsKeyInfo awsKeyInfo) {
    this.awsKeyInfo = awsKeyInfo;
    return this;
  }

  public CreateAwsKeyInfo getAwsKeyInfo() {
    return awsKeyInfo;
  }

  public CreateCustomerManagedKeyRequestPb setGcpKeyInfo(CreateGcpKeyInfo gcpKeyInfo) {
    this.gcpKeyInfo = gcpKeyInfo;
    return this;
  }

  public CreateGcpKeyInfo getGcpKeyInfo() {
    return gcpKeyInfo;
  }

  public CreateCustomerManagedKeyRequestPb setUseCases(Collection<KeyUseCase> useCases) {
    this.useCases = useCases;
    return this;
  }

  public Collection<KeyUseCase> getUseCases() {
    return useCases;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCustomerManagedKeyRequestPb that = (CreateCustomerManagedKeyRequestPb) o;
    return Objects.equals(awsKeyInfo, that.awsKeyInfo)
        && Objects.equals(gcpKeyInfo, that.gcpKeyInfo)
        && Objects.equals(useCases, that.useCases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsKeyInfo, gcpKeyInfo, useCases);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCustomerManagedKeyRequestPb.class)
        .add("awsKeyInfo", awsKeyInfo)
        .add("gcpKeyInfo", gcpKeyInfo)
        .add("useCases", useCases)
        .toString();
  }
}
