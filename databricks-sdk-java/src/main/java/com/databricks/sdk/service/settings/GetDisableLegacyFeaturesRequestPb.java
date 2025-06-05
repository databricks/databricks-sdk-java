// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get the disable legacy features setting */
@Generated
class GetDisableLegacyFeaturesRequestPb {
  @JsonIgnore
  @QueryParam("etag")
  private String etag;

  public GetDisableLegacyFeaturesRequestPb setEtag(String etag) {
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
    GetDisableLegacyFeaturesRequestPb that = (GetDisableLegacyFeaturesRequestPb) o;
    return Objects.equals(etag, that.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag);
  }

  @Override
  public String toString() {
    return new ToStringer(GetDisableLegacyFeaturesRequestPb.class).add("etag", etag).toString();
  }
}
