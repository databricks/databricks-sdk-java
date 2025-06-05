// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

@Generated
@JsonSerialize(using = Credential.CredentialSerializer.class)
@JsonDeserialize(using = Credential.CredentialDeserializer.class)
public class Credential {
  /** The Databricks account ID that hosts the credential. */
  private String accountId;

  /** */
  private AwsCredentials awsCredentials;

  /** Time in epoch milliseconds when the credential was created. */
  private Long creationTime;

  /** Databricks credential configuration ID. */
  private String credentialsId;

  /** The human-readable name of the credential configuration object. */
  private String credentialsName;

  public Credential setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public Credential setAwsCredentials(AwsCredentials awsCredentials) {
    this.awsCredentials = awsCredentials;
    return this;
  }

  public AwsCredentials getAwsCredentials() {
    return awsCredentials;
  }

  public Credential setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public Credential setCredentialsId(String credentialsId) {
    this.credentialsId = credentialsId;
    return this;
  }

  public String getCredentialsId() {
    return credentialsId;
  }

  public Credential setCredentialsName(String credentialsName) {
    this.credentialsName = credentialsName;
    return this;
  }

  public String getCredentialsName() {
    return credentialsName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Credential that = (Credential) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(awsCredentials, that.awsCredentials)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(credentialsId, that.credentialsId)
        && Objects.equals(credentialsName, that.credentialsName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, awsCredentials, creationTime, credentialsId, credentialsName);
  }

  @Override
  public String toString() {
    return new ToStringer(Credential.class)
        .add("accountId", accountId)
        .add("awsCredentials", awsCredentials)
        .add("creationTime", creationTime)
        .add("credentialsId", credentialsId)
        .add("credentialsName", credentialsName)
        .toString();
  }

  CredentialPb toPb() {
    CredentialPb pb = new CredentialPb();
    pb.setAccountId(accountId);
    pb.setAwsCredentials(awsCredentials);
    pb.setCreationTime(creationTime);
    pb.setCredentialsId(credentialsId);
    pb.setCredentialsName(credentialsName);

    return pb;
  }

  static Credential fromPb(CredentialPb pb) {
    Credential model = new Credential();
    model.setAccountId(pb.getAccountId());
    model.setAwsCredentials(pb.getAwsCredentials());
    model.setCreationTime(pb.getCreationTime());
    model.setCredentialsId(pb.getCredentialsId());
    model.setCredentialsName(pb.getCredentialsName());

    return model;
  }

  public static class CredentialSerializer extends JsonSerializer<Credential> {
    @Override
    public void serialize(Credential value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CredentialPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CredentialDeserializer extends JsonDeserializer<Credential> {
    @Override
    public Credential deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CredentialPb pb = mapper.readValue(p, CredentialPb.class);
      return Credential.fromPb(pb);
    }
  }
}
