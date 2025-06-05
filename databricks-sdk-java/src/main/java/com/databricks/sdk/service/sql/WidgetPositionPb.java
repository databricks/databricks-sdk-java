// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Coordinates of this widget on a dashboard. This portion of the API changes frequently and is
 * unsupported.
 */
@Generated
class WidgetPositionPb {
  @JsonProperty("autoHeight")
  private Boolean autoHeight;

  @JsonProperty("col")
  private Long col;

  @JsonProperty("row")
  private Long row;

  @JsonProperty("sizeX")
  private Long sizeX;

  @JsonProperty("sizeY")
  private Long sizeY;

  public WidgetPositionPb setAutoHeight(Boolean autoHeight) {
    this.autoHeight = autoHeight;
    return this;
  }

  public Boolean getAutoHeight() {
    return autoHeight;
  }

  public WidgetPositionPb setCol(Long col) {
    this.col = col;
    return this;
  }

  public Long getCol() {
    return col;
  }

  public WidgetPositionPb setRow(Long row) {
    this.row = row;
    return this;
  }

  public Long getRow() {
    return row;
  }

  public WidgetPositionPb setSizeX(Long sizeX) {
    this.sizeX = sizeX;
    return this;
  }

  public Long getSizeX() {
    return sizeX;
  }

  public WidgetPositionPb setSizeY(Long sizeY) {
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
    WidgetPositionPb that = (WidgetPositionPb) o;
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
    return new ToStringer(WidgetPositionPb.class)
        .add("autoHeight", autoHeight)
        .add("col", col)
        .add("row", row)
        .add("sizeX", sizeX)
        .add("sizeY", sizeY)
        .toString();
  }
}
