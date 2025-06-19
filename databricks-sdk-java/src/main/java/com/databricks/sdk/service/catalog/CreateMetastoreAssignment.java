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
@JsonSerialize(using = CreateMetastoreAssignment.CreateMetastoreAssignmentSerializer.class)
@JsonDeserialize(using = CreateMetastoreAssignment.CreateMetastoreAssignmentDeserializer.class)
public class CreateMetastoreAssignment {
  /**
   * The name of the default catalog in the metastore. This field is deprecated. Please use "Default
   * Namespace API" to configure the default catalog for a Databricks workspace.
   */
  private String defaultCatalogName;

  /** The unique ID of the metastore. */
  private String metastoreId;

  /** A workspace ID. */
  private Long workspaceId;

  public CreateMetastoreAssignment setDefaultCatalogName(String defaultCatalogName) {
    this.defaultCatalogName = defaultCatalogName;
    return this;
  }

  public String getDefaultCatalogName() {
    return defaultCatalogName;
  }

  public CreateMetastoreAssignment setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public CreateMetastoreAssignment setWorkspaceId(Long workspaceId) {
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
    CreateMetastoreAssignment that = (CreateMetastoreAssignment) o;
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
    return new ToStringer(CreateMetastoreAssignment.class)
        .add("defaultCatalogName", defaultCatalogName)
        .add("metastoreId", metastoreId)
        .add("workspaceId", workspaceId)
        .toString();
  }

  CreateMetastoreAssignmentPb toPb() {
    CreateMetastoreAssignmentPb pb = new CreateMetastoreAssignmentPb();
    pb.setDefaultCatalogName(defaultCatalogName);
    pb.setMetastoreId(metastoreId);
    pb.setWorkspaceId(workspaceId);

    return pb;
  }

  static CreateMetastoreAssignment fromPb(CreateMetastoreAssignmentPb pb) {
    CreateMetastoreAssignment model = new CreateMetastoreAssignment();
    model.setDefaultCatalogName(pb.getDefaultCatalogName());
    model.setMetastoreId(pb.getMetastoreId());
    model.setWorkspaceId(pb.getWorkspaceId());

    return model;
  }

  public static class CreateMetastoreAssignmentSerializer
      extends JsonSerializer<CreateMetastoreAssignment> {
    @Override
    public void serialize(
        CreateMetastoreAssignment value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateMetastoreAssignmentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateMetastoreAssignmentDeserializer
      extends JsonDeserializer<CreateMetastoreAssignment> {
    @Override
    public CreateMetastoreAssignment deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateMetastoreAssignmentPb pb = mapper.readValue(p, CreateMetastoreAssignmentPb.class);
      return CreateMetastoreAssignment.fromPb(pb);
    }
  }
}
