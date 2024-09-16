// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get a private access settings object */
@Generated
public class GetPrivateAccesRequest {
  /** Databricks Account API private access settings ID. */
  @JsonIgnore private String privateAccessSettingsId;

  public GetPrivateAccesRequest setPrivateAccessSettingsId(String privateAccessSettingsId) {
    this.privateAccessSettingsId = privateAccessSettingsId;
    return this;
  }

  public String getPrivateAccessSettingsId() {
    return privateAccessSettingsId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPrivateAccesRequest that = (GetPrivateAccesRequest) o;
    return Objects.equals(privateAccessSettingsId, that.privateAccessSettingsId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateAccessSettingsId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPrivateAccesRequest.class)
        .add("privateAccessSettingsId", privateAccessSettingsId)
        .toString();
  }
}
