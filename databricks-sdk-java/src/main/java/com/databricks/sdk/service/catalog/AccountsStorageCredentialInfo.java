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
@JsonSerialize(using = AccountsStorageCredentialInfo.AccountsStorageCredentialInfoSerializer.class)
@JsonDeserialize(
    using = AccountsStorageCredentialInfo.AccountsStorageCredentialInfoDeserializer.class)
public class AccountsStorageCredentialInfo {
  /** */
  private StorageCredentialInfo credentialInfo;

  public AccountsStorageCredentialInfo setCredentialInfo(StorageCredentialInfo credentialInfo) {
    this.credentialInfo = credentialInfo;
    return this;
  }

  public StorageCredentialInfo getCredentialInfo() {
    return credentialInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccountsStorageCredentialInfo that = (AccountsStorageCredentialInfo) o;
    return Objects.equals(credentialInfo, that.credentialInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(AccountsStorageCredentialInfo.class)
        .add("credentialInfo", credentialInfo)
        .toString();
  }

  AccountsStorageCredentialInfoPb toPb() {
    AccountsStorageCredentialInfoPb pb = new AccountsStorageCredentialInfoPb();
    pb.setCredentialInfo(credentialInfo);

    return pb;
  }

  static AccountsStorageCredentialInfo fromPb(AccountsStorageCredentialInfoPb pb) {
    AccountsStorageCredentialInfo model = new AccountsStorageCredentialInfo();
    model.setCredentialInfo(pb.getCredentialInfo());

    return model;
  }

  public static class AccountsStorageCredentialInfoSerializer
      extends JsonSerializer<AccountsStorageCredentialInfo> {
    @Override
    public void serialize(
        AccountsStorageCredentialInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AccountsStorageCredentialInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AccountsStorageCredentialInfoDeserializer
      extends JsonDeserializer<AccountsStorageCredentialInfo> {
    @Override
    public AccountsStorageCredentialInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AccountsStorageCredentialInfoPb pb =
          mapper.readValue(p, AccountsStorageCredentialInfoPb.class);
      return AccountsStorageCredentialInfo.fromPb(pb);
    }
  }
}
