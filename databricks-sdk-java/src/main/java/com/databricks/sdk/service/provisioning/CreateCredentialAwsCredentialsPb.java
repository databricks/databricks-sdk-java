// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CreateCredentialAwsCredentialsPb {
  @JsonProperty("sts_role")
  private CreateCredentialStsRole stsRole;

  public CreateCredentialAwsCredentialsPb setStsRole(CreateCredentialStsRole stsRole) {
    this.stsRole = stsRole;
    return this;
  }

  public CreateCredentialStsRole getStsRole() {
    return stsRole;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCredentialAwsCredentialsPb that = (CreateCredentialAwsCredentialsPb) o;
    return Objects.equals(stsRole, that.stsRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stsRole);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCredentialAwsCredentialsPb.class)
        .add("stsRole", stsRole)
        .toString();
  }
}
