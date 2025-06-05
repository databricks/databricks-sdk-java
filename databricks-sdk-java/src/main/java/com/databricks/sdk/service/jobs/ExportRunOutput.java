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
import java.util.Collection;
import java.util.Objects;

/** Run was exported successfully. */
@Generated
@JsonSerialize(using = ExportRunOutput.ExportRunOutputSerializer.class)
@JsonDeserialize(using = ExportRunOutput.ExportRunOutputDeserializer.class)
public class ExportRunOutput {
  /**
   * The exported content in HTML format (one for every view item). To extract the HTML notebook
   * from the JSON response, download and run this [Python script].
   *
   * <p>[Python script]: https://docs.databricks.com/en/_static/examples/extract.py
   */
  private Collection<ViewItem> views;

  public ExportRunOutput setViews(Collection<ViewItem> views) {
    this.views = views;
    return this;
  }

  public Collection<ViewItem> getViews() {
    return views;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExportRunOutput that = (ExportRunOutput) o;
    return Objects.equals(views, that.views);
  }

  @Override
  public int hashCode() {
    return Objects.hash(views);
  }

  @Override
  public String toString() {
    return new ToStringer(ExportRunOutput.class).add("views", views).toString();
  }

  ExportRunOutputPb toPb() {
    ExportRunOutputPb pb = new ExportRunOutputPb();
    pb.setViews(views);

    return pb;
  }

  static ExportRunOutput fromPb(ExportRunOutputPb pb) {
    ExportRunOutput model = new ExportRunOutput();
    model.setViews(pb.getViews());

    return model;
  }

  public static class ExportRunOutputSerializer extends JsonSerializer<ExportRunOutput> {
    @Override
    public void serialize(ExportRunOutput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExportRunOutputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExportRunOutputDeserializer extends JsonDeserializer<ExportRunOutput> {
    @Override
    public ExportRunOutput deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExportRunOutputPb pb = mapper.readValue(p, ExportRunOutputPb.class);
      return ExportRunOutput.fromPb(pb);
    }
  }
}
