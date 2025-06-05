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
@JsonSerialize(using = UpdateMetastoreAssignment.UpdateMetastoreAssignmentSerializer.class)
@JsonDeserialize(using = UpdateMetastoreAssignment.UpdateMetastoreAssignmentDeserializer.class)
public class UpdateMetastoreAssignment {
  /**
   * The name of the default catalog in the metastore. This field is deprecated. Please use "Default
   * Namespace API" to configure the default catalog for a Databricks workspace.
   */
  private String defaultCatalogName;

  /** The unique ID of the metastore. */
  private String metastoreId;

  /** A workspace ID. */
  private Long workspaceId;

  public UpdateMetastoreAssignment setDefaultCatalogName(String defaultCatalogName) {
    this.defaultCatalogName = defaultCatalogName;
    return this;
  }

  public String getDefaultCatalogName() {
    return defaultCatalogName;
  }

  public UpdateMetastoreAssignment setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public UpdateMetastoreAssignment setWorkspaceId(Long workspaceId) {
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
    UpdateMetastoreAssignment that = (UpdateMetastoreAssignment) o;
    return Objects.equals(defaultCatalogName, that.defaultCatalogName)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultCatalogName, metastoreId, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateMetastoreAssignment.class)
        .add("defaultCatalogName", defaultCatalogName)
        .add("metastoreId", metastoreId)
        .add("workspaceId", workspaceId)
        .toString();
  }

  UpdateMetastoreAssignmentPb toPb() {
    UpdateMetastoreAssignmentPb pb = new UpdateMetastoreAssignmentPb();
    pb.setDefaultCatalogName(defaultCatalogName);
    pb.setMetastoreId(metastoreId);
    pb.setWorkspaceId(workspaceId);

    return pb;
  }

  static UpdateMetastoreAssignment fromPb(UpdateMetastoreAssignmentPb pb) {
    UpdateMetastoreAssignment model = new UpdateMetastoreAssignment();
    model.setDefaultCatalogName(pb.getDefaultCatalogName());
    model.setMetastoreId(pb.getMetastoreId());
    model.setWorkspaceId(pb.getWorkspaceId());

    return model;
  }

  public static class UpdateMetastoreAssignmentSerializer
      extends JsonSerializer<UpdateMetastoreAssignment> {
    @Override
    public void serialize(
        UpdateMetastoreAssignment value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateMetastoreAssignmentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateMetastoreAssignmentDeserializer
      extends JsonDeserializer<UpdateMetastoreAssignment> {
    @Override
    public UpdateMetastoreAssignment deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateMetastoreAssignmentPb pb = mapper.readValue(p, UpdateMetastoreAssignmentPb.class);
      return UpdateMetastoreAssignment.fromPb(pb);
    }
  }
}
