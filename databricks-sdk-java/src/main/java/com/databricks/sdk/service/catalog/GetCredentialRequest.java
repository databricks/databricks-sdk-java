// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetCredentialRequest {
  /** Name of the credential. */
  @JsonIgnore private String nameArg;

  public GetCredentialRequest setNameArg(String nameArg) {
    this.nameArg = nameArg;
    return this;
  }

  public String getNameArg() {
    return nameArg;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetCredentialRequest that = (GetCredentialRequest) o;
    return Objects.equals(nameArg, that.nameArg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameArg);
  }

  @Override
  public String toString() {
    return new ToStringer(GetCredentialRequest.class).add("nameArg", nameArg).toString();
  }
}
