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
import io.swagger.client.model.WikiCommit;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * WikiPage a wiki page
 */
@Schema(description = "WikiPage a wiki page")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T21:57:57.853188500+08:00[Asia/Hong_Kong]")

public class WikiPage {
  @SerializedName("commit_count")
  private Long commitCount = null;

  @SerializedName("content_base64")
  private String contentBase64 = null;

  @SerializedName("footer")
  private String footer = null;

  @SerializedName("html_url")
  private String htmlUrl = null;

  @SerializedName("last_commit")
  private WikiCommit lastCommit = null;

  @SerializedName("sidebar")
  private String sidebar = null;

  @SerializedName("sub_url")
  private String subUrl = null;

  @SerializedName("title")
  private String title = null;

  public WikiPage commitCount(Long commitCount) {
    this.commitCount = commitCount;
    return this;
  }

   /**
   * Get commitCount
   * @return commitCount
  **/
  @Schema(description = "")
  public Long getCommitCount() {
    return commitCount;
  }

  public void setCommitCount(Long commitCount) {
    this.commitCount = commitCount;
  }

  public WikiPage contentBase64(String contentBase64) {
    this.contentBase64 = contentBase64;
    return this;
  }

   /**
   * Page content, base64 encoded
   * @return contentBase64
  **/
  @Schema(description = "Page content, base64 encoded")
  public String getContentBase64() {
    return contentBase64;
  }

  public void setContentBase64(String contentBase64) {
    this.contentBase64 = contentBase64;
  }

  public WikiPage footer(String footer) {
    this.footer = footer;
    return this;
  }

   /**
   * Get footer
   * @return footer
  **/
  @Schema(description = "")
  public String getFooter() {
    return footer;
  }

  public void setFooter(String footer) {
    this.footer = footer;
  }

  public WikiPage htmlUrl(String htmlUrl) {
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

  public WikiPage lastCommit(WikiCommit lastCommit) {
    this.lastCommit = lastCommit;
    return this;
  }

   /**
   * Get lastCommit
   * @return lastCommit
  **/
  @Schema(description = "")
  public WikiCommit getLastCommit() {
    return lastCommit;
  }

  public void setLastCommit(WikiCommit lastCommit) {
    this.lastCommit = lastCommit;
  }

  public WikiPage sidebar(String sidebar) {
    this.sidebar = sidebar;
    return this;
  }

   /**
   * Get sidebar
   * @return sidebar
  **/
  @Schema(description = "")
  public String getSidebar() {
    return sidebar;
  }

  public void setSidebar(String sidebar) {
    this.sidebar = sidebar;
  }

  public WikiPage subUrl(String subUrl) {
    this.subUrl = subUrl;
    return this;
  }

   /**
   * Get subUrl
   * @return subUrl
  **/
  @Schema(description = "")
  public String getSubUrl() {
    return subUrl;
  }

  public void setSubUrl(String subUrl) {
    this.subUrl = subUrl;
  }

  public WikiPage title(String title) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WikiPage wikiPage = (WikiPage) o;
    return Objects.equals(this.commitCount, wikiPage.commitCount) &&
        Objects.equals(this.contentBase64, wikiPage.contentBase64) &&
        Objects.equals(this.footer, wikiPage.footer) &&
        Objects.equals(this.htmlUrl, wikiPage.htmlUrl) &&
        Objects.equals(this.lastCommit, wikiPage.lastCommit) &&
        Objects.equals(this.sidebar, wikiPage.sidebar) &&
        Objects.equals(this.subUrl, wikiPage.subUrl) &&
        Objects.equals(this.title, wikiPage.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commitCount, contentBase64, footer, htmlUrl, lastCommit, sidebar, subUrl, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WikiPage {\n");
    
    sb.append("    commitCount: ").append(toIndentedString(commitCount)).append("\n");
    sb.append("    contentBase64: ").append(toIndentedString(contentBase64)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    lastCommit: ").append(toIndentedString(lastCommit)).append("\n");
    sb.append("    sidebar: ").append(toIndentedString(sidebar)).append("\n");
    sb.append("    subUrl: ").append(toIndentedString(subUrl)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
