// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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

/** Cluster log delivery config */
@Generated
@JsonSerialize(using = ClusterLogConf.ClusterLogConfSerializer.class)
@JsonDeserialize(using = ClusterLogConf.ClusterLogConfDeserializer.class)
public class ClusterLogConf {
  /**
   * destination needs to be provided. e.g. `{ "dbfs" : { "destination" : "dbfs:/home/cluster_log" }
   * }`
   */
  private DbfsStorageInfo dbfs;

  /**
   * destination and either the region or endpoint need to be provided. e.g. `{ "s3": {
   * "destination" : "s3://cluster_log_bucket/prefix", "region" : "us-west-2" } }` Cluster iam role
   * is used to access s3, please make sure the cluster iam role in `instance_profile_arn` has
   * permission to write data to the s3 destination.
   */
  private S3StorageInfo s3;

  /**
   * destination needs to be provided, e.g. `{ "volumes": { "destination":
   * "/Volumes/catalog/schema/volume/cluster_log" } }`
   */
  private VolumesStorageInfo volumes;

  public ClusterLogConf setDbfs(DbfsStorageInfo dbfs) {
    this.dbfs = dbfs;
    return this;
  }

  public DbfsStorageInfo getDbfs() {
    return dbfs;
  }

  public ClusterLogConf setS3(S3StorageInfo s3) {
    this.s3 = s3;
    return this;
  }

  public S3StorageInfo getS3() {
    return s3;
  }

  public ClusterLogConf setVolumes(VolumesStorageInfo volumes) {
    this.volumes = volumes;
    return this;
  }

  public VolumesStorageInfo getVolumes() {
    return volumes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterLogConf that = (ClusterLogConf) o;
    return Objects.equals(dbfs, that.dbfs)
        && Objects.equals(s3, that.s3)
        && Objects.equals(volumes, that.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbfs, s3, volumes);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterLogConf.class)
        .add("dbfs", dbfs)
        .add("s3", s3)
        .add("volumes", volumes)
        .toString();
  }

  ClusterLogConfPb toPb() {
    ClusterLogConfPb pb = new ClusterLogConfPb();
    pb.setDbfs(dbfs);
    pb.setS3(s3);
    pb.setVolumes(volumes);

    return pb;
  }

  static ClusterLogConf fromPb(ClusterLogConfPb pb) {
    ClusterLogConf model = new ClusterLogConf();
    model.setDbfs(pb.getDbfs());
    model.setS3(pb.getS3());
    model.setVolumes(pb.getVolumes());

    return model;
  }

  public static class ClusterLogConfSerializer extends JsonSerializer<ClusterLogConf> {
    @Override
    public void serialize(ClusterLogConf value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ClusterLogConfPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ClusterLogConfDeserializer extends JsonDeserializer<ClusterLogConf> {
    @Override
    public ClusterLogConf deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ClusterLogConfPb pb = mapper.readValue(p, ClusterLogConfPb.class);
      return ClusterLogConf.fromPb(pb);
    }
  }
}
