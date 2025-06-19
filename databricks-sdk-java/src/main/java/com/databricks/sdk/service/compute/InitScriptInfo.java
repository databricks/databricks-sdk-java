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

/** Config for an individual init script Next ID: 11 */
@Generated
@JsonSerialize(using = InitScriptInfo.InitScriptInfoSerializer.class)
@JsonDeserialize(using = InitScriptInfo.InitScriptInfoDeserializer.class)
public class InitScriptInfo {
  /**
   * destination needs to be provided, e.g.
   * `abfss://<container-name>@<storage-account-name>.dfs.core.windows.net/<directory-name>`
   */
  private Adlsgen2Info abfss;

  /**
   * destination needs to be provided. e.g. `{ "dbfs": { "destination" : "dbfs:/home/cluster_log" }
   * }`
   */
  private DbfsStorageInfo dbfs;

  /**
   * destination needs to be provided, e.g. `{ "file": { "destination": "file:/my/local/file.sh" }
   * }`
   */
  private LocalFileInfo file;

  /**
   * destination needs to be provided, e.g. `{ "gcs": { "destination": "gs://my-bucket/file.sh" } }`
   */
  private GcsStorageInfo gcs;

  /**
   * destination and either the region or endpoint need to be provided. e.g. `{ \"s3\": {
   * \"destination\": \"s3://cluster_log_bucket/prefix\", \"region\": \"us-west-2\" } }` Cluster iam
   * role is used to access s3, please make sure the cluster iam role in `instance_profile_arn` has
   * permission to write data to the s3 destination.
   */
  private S3StorageInfo s3;

  /**
   * destination needs to be provided. e.g. `{ \"volumes\" : { \"destination\" :
   * \"/Volumes/my-init.sh\" } }`
   */
  private VolumesStorageInfo volumes;

  /**
   * destination needs to be provided, e.g. `{ "workspace": { "destination":
   * "/cluster-init-scripts/setup-datadog.sh" } }`
   */
  private WorkspaceStorageInfo workspace;

  public InitScriptInfo setAbfss(Adlsgen2Info abfss) {
    this.abfss = abfss;
    return this;
  }

  public Adlsgen2Info getAbfss() {
    return abfss;
  }

  public InitScriptInfo setDbfs(DbfsStorageInfo dbfs) {
    this.dbfs = dbfs;
    return this;
  }

  public DbfsStorageInfo getDbfs() {
    return dbfs;
  }

  public InitScriptInfo setFile(LocalFileInfo file) {
    this.file = file;
    return this;
  }

  public LocalFileInfo getFile() {
    return file;
  }

  public InitScriptInfo setGcs(GcsStorageInfo gcs) {
    this.gcs = gcs;
    return this;
  }

  public GcsStorageInfo getGcs() {
    return gcs;
  }

  public InitScriptInfo setS3(S3StorageInfo s3) {
    this.s3 = s3;
    return this;
  }

  public S3StorageInfo getS3() {
    return s3;
  }

  public InitScriptInfo setVolumes(VolumesStorageInfo volumes) {
    this.volumes = volumes;
    return this;
  }

  public VolumesStorageInfo getVolumes() {
    return volumes;
  }

  public InitScriptInfo setWorkspace(WorkspaceStorageInfo workspace) {
    this.workspace = workspace;
    return this;
  }

  public WorkspaceStorageInfo getWorkspace() {
    return workspace;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InitScriptInfo that = (InitScriptInfo) o;
    return Objects.equals(abfss, that.abfss)
        && Objects.equals(dbfs, that.dbfs)
        && Objects.equals(file, that.file)
        && Objects.equals(gcs, that.gcs)
        && Objects.equals(s3, that.s3)
        && Objects.equals(volumes, that.volumes)
        && Objects.equals(workspace, that.workspace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abfss, dbfs, file, gcs, s3, volumes, workspace);
  }

  @Override
  public String toString() {
    return new ToStringer(InitScriptInfo.class)
        .add("abfss", abfss)
        .add("dbfs", dbfs)
        .add("file", file)
        .add("gcs", gcs)
        .add("s3", s3)
        .add("volumes", volumes)
        .add("workspace", workspace)
        .toString();
  }

  InitScriptInfoPb toPb() {
    InitScriptInfoPb pb = new InitScriptInfoPb();
    pb.setAbfss(abfss);
    pb.setDbfs(dbfs);
    pb.setFile(file);
    pb.setGcs(gcs);
    pb.setS3(s3);
    pb.setVolumes(volumes);
    pb.setWorkspace(workspace);

    return pb;
  }

  static InitScriptInfo fromPb(InitScriptInfoPb pb) {
    InitScriptInfo model = new InitScriptInfo();
    model.setAbfss(pb.getAbfss());
    model.setDbfs(pb.getDbfs());
    model.setFile(pb.getFile());
    model.setGcs(pb.getGcs());
    model.setS3(pb.getS3());
    model.setVolumes(pb.getVolumes());
    model.setWorkspace(pb.getWorkspace());

    return model;
  }

  public static class InitScriptInfoSerializer extends JsonSerializer<InitScriptInfo> {
    @Override
    public void serialize(InitScriptInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      InitScriptInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class InitScriptInfoDeserializer extends JsonDeserializer<InitScriptInfo> {
    @Override
    public InitScriptInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      InitScriptInfoPb pb = mapper.readValue(p, InitScriptInfoPb.class);
      return InitScriptInfo.fromPb(pb);
    }
  }
}
