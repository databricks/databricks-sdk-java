// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

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
@JsonSerialize(using = VectorIndex.VectorIndexSerializer.class)
@JsonDeserialize(using = VectorIndex.VectorIndexDeserializer.class)
public class VectorIndex {
  /** The user who created the index. */
  private String creator;

  /** */
  private DeltaSyncVectorIndexSpecResponse deltaSyncIndexSpec;

  /** */
  private DirectAccessVectorIndexSpec directAccessIndexSpec;

  /** Name of the endpoint associated with the index */
  private String endpointName;

  /**
   * There are 2 types of Vector Search indexes: - `DELTA_SYNC`: An index that automatically syncs
   * with a source Delta Table, automatically and incrementally updating the index as the underlying
   * data in the Delta Table changes. - `DIRECT_ACCESS`: An index that supports direct read and
   * write of vectors and metadata through our REST and SDK APIs. With this model, the user manages
   * index updates.
   */
  private VectorIndexType indexType;

  /** Name of the index */
  private String name;

  /** Primary key of the index */
  private String primaryKey;

  /** */
  private VectorIndexStatus status;

  public VectorIndex setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public VectorIndex setDeltaSyncIndexSpec(DeltaSyncVectorIndexSpecResponse deltaSyncIndexSpec) {
    this.deltaSyncIndexSpec = deltaSyncIndexSpec;
    return this;
  }

  public DeltaSyncVectorIndexSpecResponse getDeltaSyncIndexSpec() {
    return deltaSyncIndexSpec;
  }

  public VectorIndex setDirectAccessIndexSpec(DirectAccessVectorIndexSpec directAccessIndexSpec) {
    this.directAccessIndexSpec = directAccessIndexSpec;
    return this;
  }

  public DirectAccessVectorIndexSpec getDirectAccessIndexSpec() {
    return directAccessIndexSpec;
  }

  public VectorIndex setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  public VectorIndex setIndexType(VectorIndexType indexType) {
    this.indexType = indexType;
    return this;
  }

  public VectorIndexType getIndexType() {
    return indexType;
  }

  public VectorIndex setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public VectorIndex setPrimaryKey(String primaryKey) {
    this.primaryKey = primaryKey;
    return this;
  }

  public String getPrimaryKey() {
    return primaryKey;
  }

  public VectorIndex setStatus(VectorIndexStatus status) {
    this.status = status;
    return this;
  }

  public VectorIndexStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VectorIndex that = (VectorIndex) o;
    return Objects.equals(creator, that.creator)
        && Objects.equals(deltaSyncIndexSpec, that.deltaSyncIndexSpec)
        && Objects.equals(directAccessIndexSpec, that.directAccessIndexSpec)
        && Objects.equals(endpointName, that.endpointName)
        && Objects.equals(indexType, that.indexType)
        && Objects.equals(name, that.name)
        && Objects.equals(primaryKey, that.primaryKey)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        creator,
        deltaSyncIndexSpec,
        directAccessIndexSpec,
        endpointName,
        indexType,
        name,
        primaryKey,
        status);
  }

  @Override
  public String toString() {
    return new ToStringer(VectorIndex.class)
        .add("creator", creator)
        .add("deltaSyncIndexSpec", deltaSyncIndexSpec)
        .add("directAccessIndexSpec", directAccessIndexSpec)
        .add("endpointName", endpointName)
        .add("indexType", indexType)
        .add("name", name)
        .add("primaryKey", primaryKey)
        .add("status", status)
        .toString();
  }

  VectorIndexPb toPb() {
    VectorIndexPb pb = new VectorIndexPb();
    pb.setCreator(creator);
    pb.setDeltaSyncIndexSpec(deltaSyncIndexSpec);
    pb.setDirectAccessIndexSpec(directAccessIndexSpec);
    pb.setEndpointName(endpointName);
    pb.setIndexType(indexType);
    pb.setName(name);
    pb.setPrimaryKey(primaryKey);
    pb.setStatus(status);

    return pb;
  }

  static VectorIndex fromPb(VectorIndexPb pb) {
    VectorIndex model = new VectorIndex();
    model.setCreator(pb.getCreator());
    model.setDeltaSyncIndexSpec(pb.getDeltaSyncIndexSpec());
    model.setDirectAccessIndexSpec(pb.getDirectAccessIndexSpec());
    model.setEndpointName(pb.getEndpointName());
    model.setIndexType(pb.getIndexType());
    model.setName(pb.getName());
    model.setPrimaryKey(pb.getPrimaryKey());
    model.setStatus(pb.getStatus());

    return model;
  }

  public static class VectorIndexSerializer extends JsonSerializer<VectorIndex> {
    @Override
    public void serialize(VectorIndex value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      VectorIndexPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class VectorIndexDeserializer extends JsonDeserializer<VectorIndex> {
    @Override
    public VectorIndex deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      VectorIndexPb pb = mapper.readValue(p, VectorIndexPb.class);
      return VectorIndex.fromPb(pb);
    }
  }
}
