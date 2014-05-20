package com.tehasdf.roccat.keymaps;

public final class Key {
  Key(byte position) {
    this.position = position;
  }

  Key(int position) {
    this.position = (byte)position;
  }

  public byte getPosition() {
    return position;
  }

  private final byte position;
}
