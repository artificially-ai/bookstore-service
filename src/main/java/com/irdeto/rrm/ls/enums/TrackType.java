package com.irdeto.rrm.ls.enums;

public enum TrackType {

  AUDIO("Audio track"),
  SD("Standard Definition track"),
  HD("High Definition track"),
  UHD("Ultra High Definition track"),
  DATA("Protected data"),
  TEXT("Protected text"),
  DEFAULT("Default track. If according type is not defined for the track, default protection will" +
      "be applied to it");

  private String description;

  TrackType(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
}
