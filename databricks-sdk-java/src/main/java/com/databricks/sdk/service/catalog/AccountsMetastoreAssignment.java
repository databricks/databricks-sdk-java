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
@JsonSerialize(using = AccountsMetastoreAssignment.AccountsMetastoreAssignmentSerializer.class)
@JsonDeserialize(using = AccountsMetastoreAssignment.AccountsMetastoreAssignmentDeserializer.class)
public class AccountsMetastoreAssignment {
  /** */
  private MetastoreAssignment metastoreAssignment;

  public AccountsMetastoreAssignment setMetastoreAssignment(
      MetastoreAssignment metastoreAssignment) {
    this.metastoreAssignment = metastoreAssignment;
    return this;
  }

  public MetastoreAssignment getMetastoreAssignment() {
    return metastoreAssignment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccountsMetastoreAssignment that = (AccountsMetastoreAssignment) o;
    return Objects.equals(metastoreAssignment, that.metastoreAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreAssignment);
  }

  @Override
  public String toString() {
    return new ToStringer(AccountsMetastoreAssignment.class)
        .add("metastoreAssignment", metastoreAssignment)
        .toString();
  }

  AccountsMetastoreAssignmentPb toPb() {
    AccountsMetastoreAssignmentPb pb = new AccountsMetastoreAssignmentPb();
    pb.setMetastoreAssignment(metastoreAssignment);

    return pb;
  }

  static AccountsMetastoreAssignment fromPb(AccountsMetastoreAssignmentPb pb) {
    AccountsMetastoreAssignment model = new AccountsMetastoreAssignment();
    model.setMetastoreAssignment(pb.getMetastoreAssignment());

    return model;
  }

  public static class AccountsMetastoreAssignmentSerializer
      extends JsonSerializer<AccountsMetastoreAssignment> {
    @Override
    public void serialize(
        AccountsMetastoreAssignment value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AccountsMetastoreAssignmentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AccountsMetastoreAssignmentDeserializer
      extends JsonDeserializer<AccountsMetastoreAssignment> {
    @Override
    public AccountsMetastoreAssignment deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AccountsMetastoreAssignmentPb pb = mapper.readValue(p, AccountsMetastoreAssignmentPb.class);
      return AccountsMetastoreAssignment.fromPb(pb);
    }
  }
}
