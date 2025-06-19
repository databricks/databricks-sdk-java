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
@JsonSerialize(using = MiniVectorIndex.MiniVectorIndexSerializer.class)
@JsonDeserialize(using = MiniVectorIndex.MiniVectorIndexDeserializer.class)
public class MiniVectorIndex {
  /** The user who created the index. */
  private String creator;

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

  public MiniVectorIndex setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public MiniVectorIndex setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  public MiniVectorIndex setIndexType(VectorIndexType indexType) {
    this.indexType = indexType;
    return this;
  }

  public VectorIndexType getIndexType() {
    return indexType;
  }

  public MiniVectorIndex setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public MiniVectorIndex setPrimaryKey(String primaryKey) {
    this.primaryKey = primaryKey;
    return this;
  }

  public String getPrimaryKey() {
    return primaryKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MiniVectorIndex that = (MiniVectorIndex) o;
    return Objects.equals(creator, that.creator)
        && Objects.equals(endpointName, that.endpointName)
        && Objects.equals(indexType, that.indexType)
        && Objects.equals(name, that.name)
        && Objects.equals(primaryKey, that.primaryKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creator, endpointName, indexType, name, primaryKey);
  }

  @Override
  public String toString() {
    return new ToStringer(MiniVectorIndex.class)
        .add("creator", creator)
        .add("endpointName", endpointName)
        .add("indexType", indexType)
        .add("name", name)
        .add("primaryKey", primaryKey)
        .toString();
  }

  MiniVectorIndexPb toPb() {
    MiniVectorIndexPb pb = new MiniVectorIndexPb();
    pb.setCreator(creator);
    pb.setEndpointName(endpointName);
    pb.setIndexType(indexType);
    pb.setName(name);
    pb.setPrimaryKey(primaryKey);

    return pb;
  }

  static MiniVectorIndex fromPb(MiniVectorIndexPb pb) {
    MiniVectorIndex model = new MiniVectorIndex();
    model.setCreator(pb.getCreator());
    model.setEndpointName(pb.getEndpointName());
    model.setIndexType(pb.getIndexType());
    model.setName(pb.getName());
    model.setPrimaryKey(pb.getPrimaryKey());

    return model;
  }

  public static class MiniVectorIndexSerializer extends JsonSerializer<MiniVectorIndex> {
    @Override
    public void serialize(MiniVectorIndex value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      MiniVectorIndexPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class MiniVectorIndexDeserializer extends JsonDeserializer<MiniVectorIndex> {
    @Override
    public MiniVectorIndex deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      MiniVectorIndexPb pb = mapper.readValue(p, MiniVectorIndexPb.class);
      return MiniVectorIndex.fromPb(pb);
    }
  }
}
