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

/**
 * Coordinates of this widget on a dashboard. This portion of the API changes frequently and is
 * unsupported.
 */
@Generated
@JsonSerialize(using = WidgetPosition.WidgetPositionSerializer.class)
@JsonDeserialize(using = WidgetPosition.WidgetPositionDeserializer.class)
public class WidgetPosition {
  /** reserved for internal use */
  private Boolean autoHeight;

  /** column in the dashboard grid. Values start with 0 */
  private Long col;

  /** row in the dashboard grid. Values start with 0 */
  private Long row;

  /** width of the widget measured in dashboard grid cells */
  private Long sizeX;

  /** height of the widget measured in dashboard grid cells */
  private Long sizeY;

  public WidgetPosition setAutoHeight(Boolean autoHeight) {
    this.autoHeight = autoHeight;
    return this;
  }

  public Boolean getAutoHeight() {
    return autoHeight;
  }

  public WidgetPosition setCol(Long col) {
    this.col = col;
    return this;
  }

  public Long getCol() {
    return col;
  }

  public WidgetPosition setRow(Long row) {
    this.row = row;
    return this;
  }

  public Long getRow() {
    return row;
  }

  public WidgetPosition setSizeX(Long sizeX) {
    this.sizeX = sizeX;
    return this;
  }

  public Long getSizeX() {
    return sizeX;
  }

  public WidgetPosition setSizeY(Long sizeY) {
    this.sizeY = sizeY;
    return this;
  }

  public Long getSizeY() {
    return sizeY;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WidgetPosition that = (WidgetPosition) o;
    return Objects.equals(autoHeight, that.autoHeight)
        && Objects.equals(col, that.col)
        && Objects.equals(row, that.row)
        && Objects.equals(sizeX, that.sizeX)
        && Objects.equals(sizeY, that.sizeY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoHeight, col, row, sizeX, sizeY);
  }

  @Override
  public String toString() {
    return new ToStringer(WidgetPosition.class)
        .add("autoHeight", autoHeight)
        .add("col", col)
        .add("row", row)
        .add("sizeX", sizeX)
        .add("sizeY", sizeY)
        .toString();
  }

  WidgetPositionPb toPb() {
    WidgetPositionPb pb = new WidgetPositionPb();
    pb.setAutoHeight(autoHeight);
    pb.setCol(col);
    pb.setRow(row);
    pb.setSizeX(sizeX);
    pb.setSizeY(sizeY);

    return pb;
  }

  static WidgetPosition fromPb(WidgetPositionPb pb) {
    WidgetPosition model = new WidgetPosition();
    model.setAutoHeight(pb.getAutoHeight());
    model.setCol(pb.getCol());
    model.setRow(pb.getRow());
    model.setSizeX(pb.getSizeX());
    model.setSizeY(pb.getSizeY());

    return model;
  }

  public static class WidgetPositionSerializer extends JsonSerializer<WidgetPosition> {
    @Override
    public void serialize(WidgetPosition value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      WidgetPositionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class WidgetPositionDeserializer extends JsonDeserializer<WidgetPosition> {
    @Override
    public WidgetPosition deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      WidgetPositionPb pb = mapper.readValue(p, WidgetPositionPb.class);
      return WidgetPosition.fromPb(pb);
    }
  }
}
