// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response message for ListSecrets. */
@Generated
public class ListSecretsResponse {
  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * **page_token** should be set to this value for the next request.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** An array of secret objects. */
  @JsonProperty("secrets")
  private Collection<Secret> secrets;

  public ListSecretsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListSecretsResponse setSecrets(Collection<Secret> secrets) {
    this.secrets = secrets;
    return this;
  }

  public Collection<Secret> getSecrets() {
    return secrets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSecretsResponse that = (ListSecretsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(secrets, that.secrets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, secrets);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSecretsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("secrets", secrets)
        .toString();
  }
}
