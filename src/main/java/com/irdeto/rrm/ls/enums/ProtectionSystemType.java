package com.irdeto.rrm.ls.enums;

public enum ProtectionSystemType {

  PlayReady("PlayReady protection system");

  private String description;

  ProtectionSystemType(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
}
