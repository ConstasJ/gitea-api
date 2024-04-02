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
 * MarkupOption markup options
 */
@Schema(description = "MarkupOption markup options")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T21:57:57.853188500+08:00[Asia/Hong_Kong]")

public class MarkupOption {
  @SerializedName("Context")
  private String context = null;

  @SerializedName("FilePath")
  private String filePath = null;

  @SerializedName("Mode")
  private String mode = null;

  @SerializedName("Text")
  private String text = null;

  @SerializedName("Wiki")
  private Boolean wiki = null;

  public MarkupOption context(String context) {
    this.context = context;
    return this;
  }

   /**
   * Context to render  in: body
   * @return context
  **/
  @Schema(description = "Context to render  in: body")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public MarkupOption filePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

   /**
   * File path for detecting extension in file mode  in: body
   * @return filePath
  **/
  @Schema(description = "File path for detecting extension in file mode  in: body")
  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  public MarkupOption mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Mode to render (comment, gfm, markdown, file)  in: body
   * @return mode
  **/
  @Schema(description = "Mode to render (comment, gfm, markdown, file)  in: body")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public MarkupOption text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text markup to render  in: body
   * @return text
  **/
  @Schema(description = "Text markup to render  in: body")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public MarkupOption wiki(Boolean wiki) {
    this.wiki = wiki;
    return this;
  }

   /**
   * Is it a wiki page ?  in: body
   * @return wiki
  **/
  @Schema(description = "Is it a wiki page ?  in: body")
  public Boolean isWiki() {
    return wiki;
  }

  public void setWiki(Boolean wiki) {
    this.wiki = wiki;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarkupOption markupOption = (MarkupOption) o;
    return Objects.equals(this.context, markupOption.context) &&
        Objects.equals(this.filePath, markupOption.filePath) &&
        Objects.equals(this.mode, markupOption.mode) &&
        Objects.equals(this.text, markupOption.text) &&
        Objects.equals(this.wiki, markupOption.wiki);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, filePath, mode, text, wiki);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarkupOption {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    wiki: ").append(toIndentedString(wiki)).append("\n");
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
