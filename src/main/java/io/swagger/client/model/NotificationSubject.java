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
 * NotificationSubject contains the notification subject (Issue/Pull/Commit)
 */
@Schema(description = "NotificationSubject contains the notification subject (Issue/Pull/Commit)")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T21:57:57.853188500+08:00[Asia/Hong_Kong]")

public class NotificationSubject {
  @SerializedName("html_url")
  private String htmlUrl = null;

  @SerializedName("latest_comment_html_url")
  private String latestCommentHtmlUrl = null;

  @SerializedName("latest_comment_url")
  private String latestCommentUrl = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("url")
  private String url = null;

  public NotificationSubject htmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
    return this;
  }

   /**
   * Get htmlUrl
   * @return htmlUrl
  **/
  @Schema(description = "")
  public String getHtmlUrl() {
    return htmlUrl;
  }

  public void setHtmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }

  public NotificationSubject latestCommentHtmlUrl(String latestCommentHtmlUrl) {
    this.latestCommentHtmlUrl = latestCommentHtmlUrl;
    return this;
  }

   /**
   * Get latestCommentHtmlUrl
   * @return latestCommentHtmlUrl
  **/
  @Schema(description = "")
  public String getLatestCommentHtmlUrl() {
    return latestCommentHtmlUrl;
  }

  public void setLatestCommentHtmlUrl(String latestCommentHtmlUrl) {
    this.latestCommentHtmlUrl = latestCommentHtmlUrl;
  }

  public NotificationSubject latestCommentUrl(String latestCommentUrl) {
    this.latestCommentUrl = latestCommentUrl;
    return this;
  }

   /**
   * Get latestCommentUrl
   * @return latestCommentUrl
  **/
  @Schema(description = "")
  public String getLatestCommentUrl() {
    return latestCommentUrl;
  }

  public void setLatestCommentUrl(String latestCommentUrl) {
    this.latestCommentUrl = latestCommentUrl;
  }

  public NotificationSubject state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public NotificationSubject title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public NotificationSubject type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public NotificationSubject url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationSubject notificationSubject = (NotificationSubject) o;
    return Objects.equals(this.htmlUrl, notificationSubject.htmlUrl) &&
        Objects.equals(this.latestCommentHtmlUrl, notificationSubject.latestCommentHtmlUrl) &&
        Objects.equals(this.latestCommentUrl, notificationSubject.latestCommentUrl) &&
        Objects.equals(this.state, notificationSubject.state) &&
        Objects.equals(this.title, notificationSubject.title) &&
        Objects.equals(this.type, notificationSubject.type) &&
        Objects.equals(this.url, notificationSubject.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htmlUrl, latestCommentHtmlUrl, latestCommentUrl, state, title, type, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationSubject {\n");
    
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    latestCommentHtmlUrl: ").append(toIndentedString(latestCommentHtmlUrl)).append("\n");
    sb.append("    latestCommentUrl: ").append(toIndentedString(latestCommentUrl)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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