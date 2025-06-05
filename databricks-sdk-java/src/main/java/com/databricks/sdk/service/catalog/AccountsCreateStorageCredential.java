// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
@JsonSerialize(
    using = AccountsCreateStorageCredential.AccountsCreateStorageCredentialSerializer.class)
@JsonDeserialize(
    using = AccountsCreateStorageCredential.AccountsCreateStorageCredentialDeserializer.class)
public class AccountsCreateStorageCredential {
  /** */
  private CreateStorageCredential credentialInfo;

  /** Unity Catalog metastore ID */
  private String metastoreId;

  public AccountsCreateStorageCredential setCredentialInfo(CreateStorageCredential credentialInfo) {
    this.credentialInfo = credentialInfo;
    return this;
  }

  public CreateStorageCredential getCredentialInfo() {
    return credentialInfo;
  }

  public AccountsCreateStorageCredential setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccountsCreateStorageCredential that = (AccountsCreateStorageCredential) o;
    return Objects.equals(credentialInfo, that.credentialInfo)
        && Objects.equals(metastoreId, that.metastoreId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialInfo, metastoreId);
  }

  @Override
  public String toString() {
    return new ToStringer(AccountsCreateStorageCredential.class)
        .add("credentialInfo", credentialInfo)
        .add("metastoreId", metastoreId)
        .toString();
  }

  AccountsCreateStorageCredentialPb toPb() {
    AccountsCreateStorageCredentialPb pb = new AccountsCreateStorageCredentialPb();
    pb.setCredentialInfo(credentialInfo);
    pb.setMetastoreId(metastoreId);

    return pb;
  }

  static AccountsCreateStorageCredential fromPb(AccountsCreateStorageCredentialPb pb) {
    AccountsCreateStorageCredential model = new AccountsCreateStorageCredential();
    model.setCredentialInfo(pb.getCredentialInfo());
    model.setMetastoreId(pb.getMetastoreId());

    return model;
  }

  public static class AccountsCreateStorageCredentialSerializer
      extends JsonSerializer<AccountsCreateStorageCredential> {
    @Override
    public void serialize(
        AccountsCreateStorageCredential value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AccountsCreateStorageCredentialPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AccountsCreateStorageCredentialDeserializer
      extends JsonDeserializer<AccountsCreateStorageCredential> {
    @Override
    public AccountsCreateStorageCredential deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AccountsCreateStorageCredentialPb pb =
          mapper.readValue(p, AccountsCreateStorageCredentialPb.class);
      return AccountsCreateStorageCredential.fromPb(pb);
    }
  }
}
