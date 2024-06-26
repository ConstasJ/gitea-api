/*
 * Gitea API
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.21.10
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * LabelTemplate info of a Label template
 */
@Schema(description = "LabelTemplate info of a Label template")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T21:57:57.853188500+08:00[Asia/Hong_Kong]")

public class LabelTemplate {
  @SerializedName("color")
  private String color = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("exclusive")
  private Boolean exclusive = null;

  @SerializedName("name")
  private String name = null;

  public LabelTemplate color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @Schema(example = "00aabb", description = "")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public LabelTemplate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LabelTemplate exclusive(Boolean exclusive) {
    this.exclusive = exclusive;
    return this;
  }

   /**
   * Get exclusive
   * @return exclusive
  **/
  @Schema(example = "false", description = "")
  public Boolean isExclusive() {
    return exclusive;
  }

  public void setExclusive(Boolean exclusive) {
    this.exclusive = exclusive;
  }

  public LabelTemplate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelTemplate labelTemplate = (LabelTemplate) o;
    return Objects.equals(this.color, labelTemplate.color) &&
        Objects.equals(this.description, labelTemplate.description) &&
        Objects.equals(this.exclusive, labelTemplate.exclusive) &&
        Objects.equals(this.name, labelTemplate.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, description, exclusive, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelTemplate {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    exclusive: ").append(toIndentedString(exclusive)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
