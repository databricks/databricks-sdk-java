// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
@JsonSerialize(using = Widget.WidgetSerializer.class)
@JsonDeserialize(using = Widget.WidgetDeserializer.class)
public class Widget {
  /** The unique ID for this widget. */
  private String id;

  /** */
  private WidgetOptions options;

  /**
   * The visualization description API changes frequently and is unsupported. You can duplicate a
   * visualization by copying description objects received _from the API_ and then using them to
   * create a new one with a POST request to the same endpoint. Databricks does not recommend
   * constructing ad-hoc visualizations entirely in JSON.
   */
  private LegacyVisualization visualization;

  /** Unused field. */
  private Long width;

  public Widget setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public Widget setOptions(WidgetOptions options) {
    this.options = options;
    return this;
  }

  public WidgetOptions getOptions() {
    return options;
  }

  public Widget setVisualization(LegacyVisualization visualization) {
    this.visualization = visualization;
    return this;
  }

  public LegacyVisualization getVisualization() {
    return visualization;
  }

  public Widget setWidth(Long width) {
    this.width = width;
    return this;
  }

  public Long getWidth() {
    return width;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Widget that = (Widget) o;
    return Objects.equals(id, that.id)
        && Objects.equals(options, that.options)
        && Objects.equals(visualization, that.visualization)
        && Objects.equals(width, that.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, options, visualization, width);
  }

  @Override
  public String toString() {
    return new ToStringer(Widget.class)
        .add("id", id)
        .add("options", options)
        .add("visualization", visualization)
        .add("width", width)
        .toString();
  }

  WidgetPb toPb() {
    WidgetPb pb = new WidgetPb();
    pb.setId(id);
    pb.setOptions(options);
    pb.setVisualization(visualization);
    pb.setWidth(width);

    return pb;
  }

  static Widget fromPb(WidgetPb pb) {
    Widget model = new Widget();
    model.setId(pb.getId());
    model.setOptions(pb.getOptions());
    model.setVisualization(pb.getVisualization());
    model.setWidth(pb.getWidth());

    return model;
  }

  public static class WidgetSerializer extends JsonSerializer<Widget> {
    @Override
    public void serialize(Widget value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      WidgetPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class WidgetDeserializer extends JsonDeserializer<Widget> {
    @Override
    public Widget deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      WidgetPb pb = mapper.readValue(p, WidgetPb.class);
      return Widget.fromPb(pb);
    }
  }
}
