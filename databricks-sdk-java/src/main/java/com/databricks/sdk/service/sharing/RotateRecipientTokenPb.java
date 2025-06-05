// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class RotateRecipientTokenPb {
  @JsonProperty("existing_token_expire_in_seconds")
  private Long existingTokenExpireInSeconds;

  @JsonIgnore private String name;

  public RotateRecipientTokenPb setExistingTokenExpireInSeconds(Long existingTokenExpireInSeconds) {
    this.existingTokenExpireInSeconds = existingTokenExpireInSeconds;
    return this;
  }

  public Long getExistingTokenExpireInSeconds() {
    return existingTokenExpireInSeconds;
  }

  public RotateRecipientTokenPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RotateRecipientTokenPb that = (RotateRecipientTokenPb) o;
    return Objects.equals(existingTokenExpireInSeconds, that.existingTokenExpireInSeconds)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(existingTokenExpireInSeconds, name);
  }

  @Override
  public String toString() {
    return new ToStringer(RotateRecipientTokenPb.class)
        .add("existingTokenExpireInSeconds", existingTokenExpireInSeconds)
        .add("name", name)
        .toString();
  }
}
