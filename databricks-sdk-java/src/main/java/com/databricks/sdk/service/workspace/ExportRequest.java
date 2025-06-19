// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

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

/** Export a workspace object */
@Generated
@JsonSerialize(using = ExportRequest.ExportRequestSerializer.class)
@JsonDeserialize(using = ExportRequest.ExportRequestDeserializer.class)
public class ExportRequest {
  /**
   * This specifies the format of the exported file. By default, this is `SOURCE`.
   *
   * <p>The value is case sensitive.
   *
   * <p>- `SOURCE`: The notebook is exported as source code. Directory exports will not include
   * non-notebook entries. - `HTML`: The notebook is exported as an HTML file. - `JUPYTER`: The
   * notebook is exported as a Jupyter/IPython Notebook file. - `DBC`: The notebook is exported in
   * Databricks archive format. Directory exports will not include non-notebook entries. -
   * `R_MARKDOWN`: The notebook is exported to R Markdown format. - `AUTO`: The object or directory
   * is exported depending on the objects type. Directory exports will include notebooks and
   * workspace files.
   */
  private ExportFormat format;

  /**
   * The absolute path of the object or directory. Exporting a directory is only supported for the
   * `DBC`, `SOURCE`, and `AUTO` format.
   */
  private String path;

  public ExportRequest setFormat(ExportFormat format) {
    this.format = format;
    return this;
  }

  public ExportFormat getFormat() {
    return format;
  }

  public ExportRequest setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExportRequest that = (ExportRequest) o;
    return Objects.equals(format, that.format) && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, path);
  }

  @Override
  public String toString() {
    return new ToStringer(ExportRequest.class).add("format", format).add("path", path).toString();
  }

  ExportRequestPb toPb() {
    ExportRequestPb pb = new ExportRequestPb();
    pb.setFormat(format);
    pb.setPath(path);

    return pb;
  }

  static ExportRequest fromPb(ExportRequestPb pb) {
    ExportRequest model = new ExportRequest();
    model.setFormat(pb.getFormat());
    model.setPath(pb.getPath());

    return model;
  }

  public static class ExportRequestSerializer extends JsonSerializer<ExportRequest> {
    @Override
    public void serialize(ExportRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExportRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExportRequestDeserializer extends JsonDeserializer<ExportRequest> {
    @Override
    public ExportRequest deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExportRequestPb pb = mapper.readValue(p, ExportRequestPb.class);
      return ExportRequest.fromPb(pb);
    }
  }
}
