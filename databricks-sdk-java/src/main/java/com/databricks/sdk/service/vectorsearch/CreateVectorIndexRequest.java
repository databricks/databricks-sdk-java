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
@JsonSerialize(using = CreateVectorIndexRequest.CreateVectorIndexRequestSerializer.class)
@JsonDeserialize(using = CreateVectorIndexRequest.CreateVectorIndexRequestDeserializer.class)
public class CreateVectorIndexRequest {
  /** Specification for Delta Sync Index. Required if `index_type` is `DELTA_SYNC`. */
  private DeltaSyncVectorIndexSpecRequest deltaSyncIndexSpec;

  /** Specification for Direct Vector Access Index. Required if `index_type` is `DIRECT_ACCESS`. */
  private DirectAccessVectorIndexSpec directAccessIndexSpec;

  /** Name of the endpoint to be used for serving the index */
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

  public CreateVectorIndexRequest setDeltaSyncIndexSpec(
      DeltaSyncVectorIndexSpecRequest deltaSyncIndexSpec) {
    this.deltaSyncIndexSpec = deltaSyncIndexSpec;
    return this;
  }

  public DeltaSyncVectorIndexSpecRequest getDeltaSyncIndexSpec() {
    return deltaSyncIndexSpec;
  }

  public CreateVectorIndexRequest setDirectAccessIndexSpec(
      DirectAccessVectorIndexSpec directAccessIndexSpec) {
    this.directAccessIndexSpec = directAccessIndexSpec;
    return this;
  }

  public DirectAccessVectorIndexSpec getDirectAccessIndexSpec() {
    return directAccessIndexSpec;
  }

  public CreateVectorIndexRequest setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  public CreateVectorIndexRequest setIndexType(VectorIndexType indexType) {
    this.indexType = indexType;
    return this;
  }

  public VectorIndexType getIndexType() {
    return indexType;
  }

  public CreateVectorIndexRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateVectorIndexRequest setPrimaryKey(String primaryKey) {
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
    CreateVectorIndexRequest that = (CreateVectorIndexRequest) o;
    return Objects.equals(deltaSyncIndexSpec, that.deltaSyncIndexSpec)
        && Objects.equals(directAccessIndexSpec, that.directAccessIndexSpec)
        && Objects.equals(endpointName, that.endpointName)
        && Objects.equals(indexType, that.indexType)
        && Objects.equals(name, that.name)
        && Objects.equals(primaryKey, that.primaryKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        deltaSyncIndexSpec, directAccessIndexSpec, endpointName, indexType, name, primaryKey);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateVectorIndexRequest.class)
        .add("deltaSyncIndexSpec", deltaSyncIndexSpec)
        .add("directAccessIndexSpec", directAccessIndexSpec)
        .add("endpointName", endpointName)
        .add("indexType", indexType)
        .add("name", name)
        .add("primaryKey", primaryKey)
        .toString();
  }

  CreateVectorIndexRequestPb toPb() {
    CreateVectorIndexRequestPb pb = new CreateVectorIndexRequestPb();
    pb.setDeltaSyncIndexSpec(deltaSyncIndexSpec);
    pb.setDirectAccessIndexSpec(directAccessIndexSpec);
    pb.setEndpointName(endpointName);
    pb.setIndexType(indexType);
    pb.setName(name);
    pb.setPrimaryKey(primaryKey);

    return pb;
  }

  static CreateVectorIndexRequest fromPb(CreateVectorIndexRequestPb pb) {
    CreateVectorIndexRequest model = new CreateVectorIndexRequest();
    model.setDeltaSyncIndexSpec(pb.getDeltaSyncIndexSpec());
    model.setDirectAccessIndexSpec(pb.getDirectAccessIndexSpec());
    model.setEndpointName(pb.getEndpointName());
    model.setIndexType(pb.getIndexType());
    model.setName(pb.getName());
    model.setPrimaryKey(pb.getPrimaryKey());

    return model;
  }

  public static class CreateVectorIndexRequestSerializer
      extends JsonSerializer<CreateVectorIndexRequest> {
    @Override
    public void serialize(
        CreateVectorIndexRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateVectorIndexRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateVectorIndexRequestDeserializer
      extends JsonDeserializer<CreateVectorIndexRequest> {
    @Override
    public CreateVectorIndexRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateVectorIndexRequestPb pb = mapper.readValue(p, CreateVectorIndexRequestPb.class);
      return CreateVectorIndexRequest.fromPb(pb);
    }
  }
}
