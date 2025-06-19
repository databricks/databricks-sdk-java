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
    using = AccountsCreateMetastoreAssignment.AccountsCreateMetastoreAssignmentSerializer.class)
@JsonDeserialize(
    using = AccountsCreateMetastoreAssignment.AccountsCreateMetastoreAssignmentDeserializer.class)
public class AccountsCreateMetastoreAssignment {
  /** */
  private CreateMetastoreAssignment metastoreAssignment;

  /** Unity Catalog metastore ID */
  private String metastoreId;

  /** Workspace ID. */
  private Long workspaceId;

  public AccountsCreateMetastoreAssignment setMetastoreAssignment(
      CreateMetastoreAssignment metastoreAssignment) {
    this.metastoreAssignment = metastoreAssignment;
    return this;
  }

  public CreateMetastoreAssignment getMetastoreAssignment() {
    return metastoreAssignment;
  }

  public AccountsCreateMetastoreAssignment setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public AccountsCreateMetastoreAssignment setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public Long getWorkspaceId() {
    return workspaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccountsCreateMetastoreAssignment that = (AccountsCreateMetastoreAssignment) o;
    return Objects.equals(metastoreAssignment, that.metastoreAssignment)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreAssignment, metastoreId, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(AccountsCreateMetastoreAssignment.class)
        .add("metastoreAssignment", metastoreAssignment)
        .add("metastoreId", metastoreId)
        .add("workspaceId", workspaceId)
        .toString();
  }

  AccountsCreateMetastoreAssignmentPb toPb() {
    AccountsCreateMetastoreAssignmentPb pb = new AccountsCreateMetastoreAssignmentPb();
    pb.setMetastoreAssignment(metastoreAssignment);
    pb.setMetastoreId(metastoreId);
    pb.setWorkspaceId(workspaceId);

    return pb;
  }

  static AccountsCreateMetastoreAssignment fromPb(AccountsCreateMetastoreAssignmentPb pb) {
    AccountsCreateMetastoreAssignment model = new AccountsCreateMetastoreAssignment();
    model.setMetastoreAssignment(pb.getMetastoreAssignment());
    model.setMetastoreId(pb.getMetastoreId());
    model.setWorkspaceId(pb.getWorkspaceId());

    return model;
  }

  public static class AccountsCreateMetastoreAssignmentSerializer
      extends JsonSerializer<AccountsCreateMetastoreAssignment> {
    @Override
    public void serialize(
        AccountsCreateMetastoreAssignment value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AccountsCreateMetastoreAssignmentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AccountsCreateMetastoreAssignmentDeserializer
      extends JsonDeserializer<AccountsCreateMetastoreAssignment> {
    @Override
    public AccountsCreateMetastoreAssignment deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AccountsCreateMetastoreAssignmentPb pb =
          mapper.readValue(p, AccountsCreateMetastoreAssignmentPb.class);
      return AccountsCreateMetastoreAssignment.fromPb(pb);
    }
  }
}
