// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The etag is returned. */
@Generated
class DeleteRestrictWorkspaceAdminsSettingResponsePb {
  @JsonProperty("etag")
  private String etag;

  public DeleteRestrictWorkspaceAdminsSettingResponsePb setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteRestrictWorkspaceAdminsSettingResponsePb that =
        (DeleteRestrictWorkspaceAdminsSettingResponsePb) o;
    return Objects.equals(etag, that.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteRestrictWorkspaceAdminsSettingResponsePb.class)
        .add("etag", etag)
        .toString();
  }
}
