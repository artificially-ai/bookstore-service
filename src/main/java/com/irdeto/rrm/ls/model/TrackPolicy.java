package com.irdeto.rrm.ls.model;

import com.irdeto.rrm.ls.enums.TrackType;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TrackPolicy {

  @Id
  @GeneratedValue(generator="uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  private String id;

  private TrackType trackType;

  private String documentData;

  public TrackPolicy(TrackType trackType, String documentData) {
    this.trackType = trackType;
    this.documentData = documentData;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TrackType getTrackType() {
    return trackType;
  }

  public void setTrackType(TrackType trackType) {
    this.trackType = trackType;
  }

  public String getDocumentData() {
    return documentData;
  }

  public void setDocumentData(String documentData) {
    this.documentData = documentData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    TrackPolicy that = (TrackPolicy) o;

    if (id != null ? !id.equals(that.id) : that.id != null) return false;
    if (trackType != that.trackType) return false;
    return documentData != null ? documentData
        .equals(that.documentData) : that.documentData == null;

  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (trackType != null ? trackType.hashCode() : 0);
    result = 31 * result + (documentData != null ? documentData.hashCode() : 0);
    return result;
  }
}
