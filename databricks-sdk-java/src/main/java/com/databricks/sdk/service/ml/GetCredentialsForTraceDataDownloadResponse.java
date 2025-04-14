// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GetCredentialsForTraceDataDownloadResponse {
  /** The artifact download credentials for the specified trace data. */
  @JsonProperty("credential_info")
  private ArtifactCredentialInfo credentialInfo;

  public GetCredentialsForTraceDataDownloadResponse setCredentialInfo(
      ArtifactCredentialInfo credentialInfo) {
    this.credentialInfo = credentialInfo;
    return this;
  }

  public ArtifactCredentialInfo getCredentialInfo() {
    return credentialInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetCredentialsForTraceDataDownloadResponse that =
        (GetCredentialsForTraceDataDownloadResponse) o;
    return Objects.equals(credentialInfo, that.credentialInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(GetCredentialsForTraceDataDownloadResponse.class)
        .add("credentialInfo", credentialInfo)
        .toString();
  }
}
