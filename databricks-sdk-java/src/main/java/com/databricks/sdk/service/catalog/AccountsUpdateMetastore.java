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
@JsonSerialize(using = AccountsUpdateMetastore.AccountsUpdateMetastoreSerializer.class)
@JsonDeserialize(using = AccountsUpdateMetastore.AccountsUpdateMetastoreDeserializer.class)
public class AccountsUpdateMetastore {
  /** Unity Catalog metastore ID */
  private String metastoreId;

  /** */
  private UpdateMetastore metastoreInfo;

  public AccountsUpdateMetastore setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public AccountsUpdateMetastore setMetastoreInfo(UpdateMetastore metastoreInfo) {
    this.metastoreInfo = metastoreInfo;
    return this;
  }

  public UpdateMetastore getMetastoreInfo() {
    return metastoreInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccountsUpdateMetastore that = (AccountsUpdateMetastore) o;
    return Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(metastoreInfo, that.metastoreInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreId, metastoreInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(AccountsUpdateMetastore.class)
        .add("metastoreId", metastoreId)
        .add("metastoreInfo", metastoreInfo)
        .toString();
  }

  AccountsUpdateMetastorePb toPb() {
    AccountsUpdateMetastorePb pb = new AccountsUpdateMetastorePb();
    pb.setMetastoreId(metastoreId);
    pb.setMetastoreInfo(metastoreInfo);

    return pb;
  }

  static AccountsUpdateMetastore fromPb(AccountsUpdateMetastorePb pb) {
    AccountsUpdateMetastore model = new AccountsUpdateMetastore();
    model.setMetastoreId(pb.getMetastoreId());
    model.setMetastoreInfo(pb.getMetastoreInfo());

    return model;
  }

  public static class AccountsUpdateMetastoreSerializer
      extends JsonSerializer<AccountsUpdateMetastore> {
    @Override
    public void serialize(
        AccountsUpdateMetastore value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AccountsUpdateMetastorePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AccountsUpdateMetastoreDeserializer
      extends JsonDeserializer<AccountsUpdateMetastore> {
    @Override
    public AccountsUpdateMetastore deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AccountsUpdateMetastorePb pb = mapper.readValue(p, AccountsUpdateMetastorePb.class);
      return AccountsUpdateMetastore.fromPb(pb);
    }
  }
}
