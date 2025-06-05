// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete a private access settings object */
@Generated
class DeletePrivateAccesRequestPb {
  @JsonIgnore private String privateAccessSettingsId;

  public DeletePrivateAccesRequestPb setPrivateAccessSettingsId(String privateAccessSettingsId) {
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
    DeletePrivateAccesRequestPb that = (DeletePrivateAccesRequestPb) o;
    return Objects.equals(privateAccessSettingsId, that.privateAccessSettingsId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateAccessSettingsId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeletePrivateAccesRequestPb.class)
        .add("privateAccessSettingsId", privateAccessSettingsId)
        .toString();
  }
}
