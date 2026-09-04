// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** AWS access-key-pair auth for Amazon Bedrock: a SigV4-signing key pair. */
@Generated
public class ModelProviderServiceConfigAwsAccessKey {
  /**
   * AWS access key ID. Required on Create when using access-key auth. Treated as
   * username-equivalent (not a secret value): round-trips on reads and is scrubbed from audit logs.
   */
  @JsonProperty("access_key_id")
  private String accessKeyId;

  /**
   * AWS secret access key paired with `access_key_id`. Required when creating a service with
   * access-key authentication. Supply the value in `secret_access_key.plaintext`.
   */
  @JsonProperty("secret_access_key")
  private ModelProviderServiceConfigProviderSecret secretAccessKey;

  public ModelProviderServiceConfigAwsAccessKey setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

  public String getAccessKeyId() {
    return accessKeyId;
  }

  public ModelProviderServiceConfigAwsAccessKey setSecretAccessKey(
      ModelProviderServiceConfigProviderSecret secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
    return this;
  }

  public ModelProviderServiceConfigProviderSecret getSecretAccessKey() {
    return secretAccessKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelProviderServiceConfigAwsAccessKey that = (ModelProviderServiceConfigAwsAccessKey) o;
    return Objects.equals(accessKeyId, that.accessKeyId)
        && Objects.equals(secretAccessKey, that.secretAccessKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId, secretAccessKey);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigAwsAccessKey.class)
        .add("accessKeyId", accessKeyId)
        .add("secretAccessKey", secretAccessKey)
        .toString();
  }
}
