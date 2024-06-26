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
import io.swagger.client.model.FileLinksResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ContentsResponse contains information about a repo&#x27;s entry&#x27;s (dir, file, symlink, submodule) metadata and content
 */
@Schema(description = "ContentsResponse contains information about a repo's entry's (dir, file, symlink, submodule) metadata and content")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T21:57:57.853188500+08:00[Asia/Hong_Kong]")

public class ContentsResponse {
  @SerializedName("_links")
  private FileLinksResponse _links = null;

  @SerializedName("content")
  private String content = null;

  @SerializedName("download_url")
  private String downloadUrl = null;

  @SerializedName("encoding")
  private String encoding = null;

  @SerializedName("git_url")
  private String gitUrl = null;

  @SerializedName("html_url")
  private String htmlUrl = null;

  @SerializedName("last_commit_sha")
  private String lastCommitSha = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("sha")
  private String sha = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("submodule_git_url")
  private String submoduleGitUrl = null;

  @SerializedName("target")
  private String target = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("url")
  private String url = null;

  public ContentsResponse _links(FileLinksResponse _links) {
    this._links = _links;
    return this;
  }

   /**
   * Get _links
   * @return _links
  **/
  @Schema(description = "")
  public FileLinksResponse getLinks() {
    return _links;
  }

  public void setLinks(FileLinksResponse _links) {
    this._links = _links;
  }

  public ContentsResponse content(String content) {
    this.content = content;
    return this;
  }

   /**
   * &#x60;content&#x60; is populated when &#x60;type&#x60; is &#x60;file&#x60;, otherwise null
   * @return content
  **/
  @Schema(description = "`content` is populated when `type` is `file`, otherwise null")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public ContentsResponse downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * Get downloadUrl
   * @return downloadUrl
  **/
  @Schema(description = "")
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public ContentsResponse encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * &#x60;encoding&#x60; is populated when &#x60;type&#x60; is &#x60;file&#x60;, otherwise null
   * @return encoding
  **/
  @Schema(description = "`encoding` is populated when `type` is `file`, otherwise null")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public ContentsResponse gitUrl(String gitUrl) {
    this.gitUrl = gitUrl;
    return this;
  }

   /**
   * Get gitUrl
   * @return gitUrl
  **/
  @Schema(description = "")
  public String getGitUrl() {
    return gitUrl;
  }

  public void setGitUrl(String gitUrl) {
    this.gitUrl = gitUrl;
  }

  public ContentsResponse htmlUrl(String htmlUrl) {
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

  public ContentsResponse lastCommitSha(String lastCommitSha) {
    this.lastCommitSha = lastCommitSha;
    return this;
  }

   /**
   * Get lastCommitSha
   * @return lastCommitSha
  **/
  @Schema(description = "")
  public String getLastCommitSha() {
    return lastCommitSha;
  }

  public void setLastCommitSha(String lastCommitSha) {
    this.lastCommitSha = lastCommitSha;
  }

  public ContentsResponse name(String name) {
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

  public ContentsResponse path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Schema(description = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ContentsResponse sha(String sha) {
    this.sha = sha;
    return this;
  }

   /**
   * Get sha
   * @return sha
  **/
  @Schema(description = "")
  public String getSha() {
    return sha;
  }

  public void setSha(String sha) {
    this.sha = sha;
  }

  public ContentsResponse size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public ContentsResponse submoduleGitUrl(String submoduleGitUrl) {
    this.submoduleGitUrl = submoduleGitUrl;
    return this;
  }

   /**
   * &#x60;submodule_git_url&#x60; is populated when &#x60;type&#x60; is &#x60;submodule&#x60;, otherwise null
   * @return submoduleGitUrl
  **/
  @Schema(description = "`submodule_git_url` is populated when `type` is `submodule`, otherwise null")
  public String getSubmoduleGitUrl() {
    return submoduleGitUrl;
  }

  public void setSubmoduleGitUrl(String submoduleGitUrl) {
    this.submoduleGitUrl = submoduleGitUrl;
  }

  public ContentsResponse target(String target) {
    this.target = target;
    return this;
  }

   /**
   * &#x60;target&#x60; is populated when &#x60;type&#x60; is &#x60;symlink&#x60;, otherwise null
   * @return target
  **/
  @Schema(description = "`target` is populated when `type` is `symlink`, otherwise null")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public ContentsResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * &#x60;type&#x60; will be &#x60;file&#x60;, &#x60;dir&#x60;, &#x60;symlink&#x60;, or &#x60;submodule&#x60;
   * @return type
  **/
  @Schema(description = "`type` will be `file`, `dir`, `symlink`, or `submodule`")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ContentsResponse url(String url) {
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
    ContentsResponse contentsResponse = (ContentsResponse) o;
    return Objects.equals(this._links, contentsResponse._links) &&
        Objects.equals(this.content, contentsResponse.content) &&
        Objects.equals(this.downloadUrl, contentsResponse.downloadUrl) &&
        Objects.equals(this.encoding, contentsResponse.encoding) &&
        Objects.equals(this.gitUrl, contentsResponse.gitUrl) &&
        Objects.equals(this.htmlUrl, contentsResponse.htmlUrl) &&
        Objects.equals(this.lastCommitSha, contentsResponse.lastCommitSha) &&
        Objects.equals(this.name, contentsResponse.name) &&
        Objects.equals(this.path, contentsResponse.path) &&
        Objects.equals(this.sha, contentsResponse.sha) &&
        Objects.equals(this.size, contentsResponse.size) &&
        Objects.equals(this.submoduleGitUrl, contentsResponse.submoduleGitUrl) &&
        Objects.equals(this.target, contentsResponse.target) &&
        Objects.equals(this.type, contentsResponse.type) &&
        Objects.equals(this.url, contentsResponse.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_links, content, downloadUrl, encoding, gitUrl, htmlUrl, lastCommitSha, name, path, sha, size, submoduleGitUrl, target, type, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentsResponse {\n");
    
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    lastCommitSha: ").append(toIndentedString(lastCommitSha)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    submoduleGitUrl: ").append(toIndentedString(submoduleGitUrl)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
