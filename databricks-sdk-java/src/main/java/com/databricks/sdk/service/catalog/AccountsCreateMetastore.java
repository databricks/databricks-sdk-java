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
@JsonSerialize(using = AccountsCreateMetastore.AccountsCreateMetastoreSerializer.class)
@JsonDeserialize(using = AccountsCreateMetastore.AccountsCreateMetastoreDeserializer.class)
public class AccountsCreateMetastore {
  /** */
  private CreateMetastore metastoreInfo;

  public AccountsCreateMetastore setMetastoreInfo(CreateMetastore metastoreInfo) {
    this.metastoreInfo = metastoreInfo;
    return this;
  }

  public CreateMetastore getMetastoreInfo() {
    return metastoreInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccountsCreateMetastore that = (AccountsCreateMetastore) o;
    return Objects.equals(metastoreInfo, that.metastoreInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(AccountsCreateMetastore.class)
        .add("metastoreInfo", metastoreInfo)
        .toString();
  }

  AccountsCreateMetastorePb toPb() {
    AccountsCreateMetastorePb pb = new AccountsCreateMetastorePb();
    pb.setMetastoreInfo(metastoreInfo);

    return pb;
  }

  static AccountsCreateMetastore fromPb(AccountsCreateMetastorePb pb) {
    AccountsCreateMetastore model = new AccountsCreateMetastore();
    model.setMetastoreInfo(pb.getMetastoreInfo());

    return model;
  }

  public static class AccountsCreateMetastoreSerializer
      extends JsonSerializer<AccountsCreateMetastore> {
    @Override
    public void serialize(
        AccountsCreateMetastore value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AccountsCreateMetastorePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AccountsCreateMetastoreDeserializer
      extends JsonDeserializer<AccountsCreateMetastore> {
    @Override
    public AccountsCreateMetastore deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AccountsCreateMetastorePb pb = mapper.readValue(p, AccountsCreateMetastorePb.class);
      return AccountsCreateMetastore.fromPb(pb);
    }
  }
}
