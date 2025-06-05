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
    using = AccountsUpdateMetastoreAssignment.AccountsUpdateMetastoreAssignmentSerializer.class)
@JsonDeserialize(
    using = AccountsUpdateMetastoreAssignment.AccountsUpdateMetastoreAssignmentDeserializer.class)
public class AccountsUpdateMetastoreAssignment {
  /** */
  private UpdateMetastoreAssignment metastoreAssignment;

  /** Unity Catalog metastore ID */
  private String metastoreId;

  /** Workspace ID. */
  private Long workspaceId;

  public AccountsUpdateMetastoreAssignment setMetastoreAssignment(
      UpdateMetastoreAssignment metastoreAssignment) {
    this.metastoreAssignment = metastoreAssignment;
    return this;
  }

  public UpdateMetastoreAssignment getMetastoreAssignment() {
    return metastoreAssignment;
  }

  public AccountsUpdateMetastoreAssignment setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public AccountsUpdateMetastoreAssignment setWorkspaceId(Long workspaceId) {
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
    AccountsUpdateMetastoreAssignment that = (AccountsUpdateMetastoreAssignment) o;
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
    return new ToStringer(AccountsUpdateMetastoreAssignment.class)
        .add("metastoreAssignment", metastoreAssignment)
        .add("metastoreId", metastoreId)
        .add("workspaceId", workspaceId)
        .toString();
  }

  AccountsUpdateMetastoreAssignmentPb toPb() {
    AccountsUpdateMetastoreAssignmentPb pb = new AccountsUpdateMetastoreAssignmentPb();
    pb.setMetastoreAssignment(metastoreAssignment);
    pb.setMetastoreId(metastoreId);
    pb.setWorkspaceId(workspaceId);

    return pb;
  }

  static AccountsUpdateMetastoreAssignment fromPb(AccountsUpdateMetastoreAssignmentPb pb) {
    AccountsUpdateMetastoreAssignment model = new AccountsUpdateMetastoreAssignment();
    model.setMetastoreAssignment(pb.getMetastoreAssignment());
    model.setMetastoreId(pb.getMetastoreId());
    model.setWorkspaceId(pb.getWorkspaceId());

    return model;
  }

  public static class AccountsUpdateMetastoreAssignmentSerializer
      extends JsonSerializer<AccountsUpdateMetastoreAssignment> {
    @Override
    public void serialize(
        AccountsUpdateMetastoreAssignment value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AccountsUpdateMetastoreAssignmentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AccountsUpdateMetastoreAssignmentDeserializer
      extends JsonDeserializer<AccountsUpdateMetastoreAssignment> {
    @Override
    public AccountsUpdateMetastoreAssignment deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AccountsUpdateMetastoreAssignmentPb pb =
          mapper.readValue(p, AccountsUpdateMetastoreAssignmentPb.class);
      return AccountsUpdateMetastoreAssignment.fromPb(pb);
    }
  }
}
