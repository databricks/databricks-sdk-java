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
    using = AccountsUpdateStorageCredential.AccountsUpdateStorageCredentialSerializer.class)
@JsonDeserialize(
    using = AccountsUpdateStorageCredential.AccountsUpdateStorageCredentialDeserializer.class)
public class AccountsUpdateStorageCredential {
  /** */
  private UpdateStorageCredential credentialInfo;

  /** Unity Catalog metastore ID */
  private String metastoreId;

  /** Name of the storage credential. */
  private String storageCredentialName;

  public AccountsUpdateStorageCredential setCredentialInfo(UpdateStorageCredential credentialInfo) {
    this.credentialInfo = credentialInfo;
    return this;
  }

  public UpdateStorageCredential getCredentialInfo() {
    return credentialInfo;
  }

  public AccountsUpdateStorageCredential setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public AccountsUpdateStorageCredential setStorageCredentialName(String storageCredentialName) {
    this.storageCredentialName = storageCredentialName;
    return this;
  }

  public String getStorageCredentialName() {
    return storageCredentialName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccountsUpdateStorageCredential that = (AccountsUpdateStorageCredential) o;
    return Objects.equals(credentialInfo, that.credentialInfo)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(storageCredentialName, that.storageCredentialName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialInfo, metastoreId, storageCredentialName);
  }

  @Override
  public String toString() {
    return new ToStringer(AccountsUpdateStorageCredential.class)
        .add("credentialInfo", credentialInfo)
        .add("metastoreId", metastoreId)
        .add("storageCredentialName", storageCredentialName)
        .toString();
  }

  AccountsUpdateStorageCredentialPb toPb() {
    AccountsUpdateStorageCredentialPb pb = new AccountsUpdateStorageCredentialPb();
    pb.setCredentialInfo(credentialInfo);
    pb.setMetastoreId(metastoreId);
    pb.setStorageCredentialName(storageCredentialName);

    return pb;
  }

  static AccountsUpdateStorageCredential fromPb(AccountsUpdateStorageCredentialPb pb) {
    AccountsUpdateStorageCredential model = new AccountsUpdateStorageCredential();
    model.setCredentialInfo(pb.getCredentialInfo());
    model.setMetastoreId(pb.getMetastoreId());
    model.setStorageCredentialName(pb.getStorageCredentialName());

    return model;
  }

  public static class AccountsUpdateStorageCredentialSerializer
      extends JsonSerializer<AccountsUpdateStorageCredential> {
    @Override
    public void serialize(
        AccountsUpdateStorageCredential value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AccountsUpdateStorageCredentialPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AccountsUpdateStorageCredentialDeserializer
      extends JsonDeserializer<AccountsUpdateStorageCredential> {
    @Override
    public AccountsUpdateStorageCredential deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AccountsUpdateStorageCredentialPb pb =
          mapper.readValue(p, AccountsUpdateStorageCredentialPb.class);
      return AccountsUpdateStorageCredential.fromPb(pb);
    }
  }
}
