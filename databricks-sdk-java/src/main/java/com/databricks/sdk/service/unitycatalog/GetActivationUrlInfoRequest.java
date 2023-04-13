// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get a share activation URL */
public class GetActivationUrlInfoRequest {
  /** The one time activation url. It also accepts activation token. */
  private String activationUrl;

  public GetActivationUrlInfoRequest setActivationUrl(String activationUrl) {
    this.activationUrl = activationUrl;
    return this;
  }

  public String getActivationUrl() {
    return activationUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetActivationUrlInfoRequest that = (GetActivationUrlInfoRequest) o;
    return Objects.equals(activationUrl, that.activationUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationUrl);
  }

  @Override
  public String toString() {
    return new ToStringer(GetActivationUrlInfoRequest.class)
        .add("activationUrl", activationUrl)
        .toString();
  }
}
