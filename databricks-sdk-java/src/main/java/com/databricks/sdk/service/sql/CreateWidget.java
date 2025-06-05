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
@JsonSerialize(using = CreateWidget.CreateWidgetSerializer.class)
@JsonDeserialize(using = CreateWidget.CreateWidgetDeserializer.class)
public class CreateWidget {
  /** Dashboard ID returned by :method:dashboards/create. */
  private String dashboardId;

  /** Widget ID returned by :method:dashboardwidgets/create */
  private String id;

  /** */
  private WidgetOptions options;

  /**
   * If this is a textbox widget, the application displays this text. This field is ignored if the
   * widget contains a visualization in the `visualization` field.
   */
  private String text;

  /** Query Vizualization ID returned by :method:queryvisualizations/create. */
  private String visualizationId;

  /** Width of a widget */
  private Long width;

  public CreateWidget setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public CreateWidget setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public CreateWidget setOptions(WidgetOptions options) {
    this.options = options;
    return this;
  }

  public WidgetOptions getOptions() {
    return options;
  }

  public CreateWidget setText(String text) {
    this.text = text;
    return this;
  }

  public String getText() {
    return text;
  }

  public CreateWidget setVisualizationId(String visualizationId) {
    this.visualizationId = visualizationId;
    return this;
  }

  public String getVisualizationId() {
    return visualizationId;
  }

  public CreateWidget setWidth(Long width) {
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
    CreateWidget that = (CreateWidget) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(id, that.id)
        && Objects.equals(options, that.options)
        && Objects.equals(text, that.text)
        && Objects.equals(visualizationId, that.visualizationId)
        && Objects.equals(width, that.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, id, options, text, visualizationId, width);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateWidget.class)
        .add("dashboardId", dashboardId)
        .add("id", id)
        .add("options", options)
        .add("text", text)
        .add("visualizationId", visualizationId)
        .add("width", width)
        .toString();
  }

  CreateWidgetPb toPb() {
    CreateWidgetPb pb = new CreateWidgetPb();
    pb.setDashboardId(dashboardId);
    pb.setId(id);
    pb.setOptions(options);
    pb.setText(text);
    pb.setVisualizationId(visualizationId);
    pb.setWidth(width);

    return pb;
  }

  static CreateWidget fromPb(CreateWidgetPb pb) {
    CreateWidget model = new CreateWidget();
    model.setDashboardId(pb.getDashboardId());
    model.setId(pb.getId());
    model.setOptions(pb.getOptions());
    model.setText(pb.getText());
    model.setVisualizationId(pb.getVisualizationId());
    model.setWidth(pb.getWidth());

    return model;
  }

  public static class CreateWidgetSerializer extends JsonSerializer<CreateWidget> {
    @Override
    public void serialize(CreateWidget value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateWidgetPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateWidgetDeserializer extends JsonDeserializer<CreateWidget> {
    @Override
    public CreateWidget deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateWidgetPb pb = mapper.readValue(p, CreateWidgetPb.class);
      return CreateWidget.fromPb(pb);
    }
  }
}
