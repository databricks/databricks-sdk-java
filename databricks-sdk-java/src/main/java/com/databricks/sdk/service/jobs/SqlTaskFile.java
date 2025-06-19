// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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
@JsonSerialize(using = SqlTaskFile.SqlTaskFileSerializer.class)
@JsonDeserialize(using = SqlTaskFile.SqlTaskFileDeserializer.class)
public class SqlTaskFile {
  /**
   * Path of the SQL file. Must be relative if the source is a remote Git repository and absolute
   * for workspace paths.
   */
  private String path;

  /**
   * Optional location type of the SQL file. When set to `WORKSPACE`, the SQL file will be retrieved
   * from the local Databricks workspace. When set to `GIT`, the SQL file will be retrieved from a
   * Git repository defined in `git_source`. If the value is empty, the task will use `GIT` if
   * `git_source` is defined and `WORKSPACE` otherwise.
   *
   * <p>* `WORKSPACE`: SQL file is located in Databricks workspace. * `GIT`: SQL file is located in
   * cloud Git provider.
   */
  private Source source;

  public SqlTaskFile setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public SqlTaskFile setSource(Source source) {
    this.source = source;
    return this;
  }

  public Source getSource() {
    return source;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlTaskFile that = (SqlTaskFile) o;
    return Objects.equals(path, that.path) && Objects.equals(source, that.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, source);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlTaskFile.class).add("path", path).add("source", source).toString();
  }

  SqlTaskFilePb toPb() {
    SqlTaskFilePb pb = new SqlTaskFilePb();
    pb.setPath(path);
    pb.setSource(source);

    return pb;
  }

  static SqlTaskFile fromPb(SqlTaskFilePb pb) {
    SqlTaskFile model = new SqlTaskFile();
    model.setPath(pb.getPath());
    model.setSource(pb.getSource());

    return model;
  }

  public static class SqlTaskFileSerializer extends JsonSerializer<SqlTaskFile> {
    @Override
    public void serialize(SqlTaskFile value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SqlTaskFilePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SqlTaskFileDeserializer extends JsonDeserializer<SqlTaskFile> {
    @Override
    public SqlTaskFile deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SqlTaskFilePb pb = mapper.readValue(p, SqlTaskFilePb.class);
      return SqlTaskFile.fromPb(pb);
    }
  }
}
