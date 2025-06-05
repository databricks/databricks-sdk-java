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
@JsonSerialize(using = AccountsMetastoreInfo.AccountsMetastoreInfoSerializer.class)
@JsonDeserialize(using = AccountsMetastoreInfo.AccountsMetastoreInfoDeserializer.class)
public class AccountsMetastoreInfo {
  /** */
  private MetastoreInfo metastoreInfo;

  public AccountsMetastoreInfo setMetastoreInfo(MetastoreInfo metastoreInfo) {
    this.metastoreInfo = metastoreInfo;
    return this;
  }

  public MetastoreInfo getMetastoreInfo() {
    return metastoreInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccountsMetastoreInfo that = (AccountsMetastoreInfo) o;
    return Objects.equals(metastoreInfo, that.metastoreInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(AccountsMetastoreInfo.class)
        .add("metastoreInfo", metastoreInfo)
        .toString();
  }

  AccountsMetastoreInfoPb toPb() {
    AccountsMetastoreInfoPb pb = new AccountsMetastoreInfoPb();
    pb.setMetastoreInfo(metastoreInfo);

    return pb;
  }

  static AccountsMetastoreInfo fromPb(AccountsMetastoreInfoPb pb) {
    AccountsMetastoreInfo model = new AccountsMetastoreInfo();
    model.setMetastoreInfo(pb.getMetastoreInfo());

    return model;
  }

  public static class AccountsMetastoreInfoSerializer
      extends JsonSerializer<AccountsMetastoreInfo> {
    @Override
    public void serialize(
        AccountsMetastoreInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AccountsMetastoreInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AccountsMetastoreInfoDeserializer
      extends JsonDeserializer<AccountsMetastoreInfo> {
    @Override
    public AccountsMetastoreInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AccountsMetastoreInfoPb pb = mapper.readValue(p, AccountsMetastoreInfoPb.class);
      return AccountsMetastoreInfo.fromPb(pb);
    }
  }
}
