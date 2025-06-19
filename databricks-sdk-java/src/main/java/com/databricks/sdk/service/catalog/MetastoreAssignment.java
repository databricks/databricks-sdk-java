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
@JsonSerialize(using = MetastoreAssignment.MetastoreAssignmentSerializer.class)
@JsonDeserialize(using = MetastoreAssignment.MetastoreAssignmentDeserializer.class)
public class MetastoreAssignment {
  /** The name of the default catalog in the metastore. */
  private String defaultCatalogName;

  /** The unique ID of the metastore. */
  private String metastoreId;

  /** The unique ID of the Databricks workspace. */
  private Long workspaceId;

  public MetastoreAssignment setDefaultCatalogName(String defaultCatalogName) {
    this.defaultCatalogName = defaultCatalogName;
    return this;
  }

  public String getDefaultCatalogName() {
    return defaultCatalogName;
  }

  public MetastoreAssignment setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public MetastoreAssignment setWorkspaceId(Long workspaceId) {
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
    MetastoreAssignment that = (MetastoreAssignment) o;
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
    return new ToStringer(MetastoreAssignment.class)
        .add("defaultCatalogName", defaultCatalogName)
        .add("metastoreId", metastoreId)
        .add("workspaceId", workspaceId)
        .toString();
  }

  MetastoreAssignmentPb toPb() {
    MetastoreAssignmentPb pb = new MetastoreAssignmentPb();
    pb.setDefaultCatalogName(defaultCatalogName);
    pb.setMetastoreId(metastoreId);
    pb.setWorkspaceId(workspaceId);

    return pb;
  }

  static MetastoreAssignment fromPb(MetastoreAssignmentPb pb) {
    MetastoreAssignment model = new MetastoreAssignment();
    model.setDefaultCatalogName(pb.getDefaultCatalogName());
    model.setMetastoreId(pb.getMetastoreId());
    model.setWorkspaceId(pb.getWorkspaceId());

    return model;
  }

  public static class MetastoreAssignmentSerializer extends JsonSerializer<MetastoreAssignment> {
    @Override
    public void serialize(MetastoreAssignment value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      MetastoreAssignmentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class MetastoreAssignmentDeserializer
      extends JsonDeserializer<MetastoreAssignment> {
    @Override
    public MetastoreAssignment deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      MetastoreAssignmentPb pb = mapper.readValue(p, MetastoreAssignmentPb.class);
      return MetastoreAssignment.fromPb(pb);
    }
  }
}
