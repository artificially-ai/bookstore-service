package nl.ekholabs.microservices.bookstore.service.enums;

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
