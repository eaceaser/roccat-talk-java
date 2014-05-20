package com.tehasdf.roccat;

import com.tehasdf.roccat.keymaps.Key;

import java.util.Arrays;

public final class KeyboardState {
  private static int BufferSize = 110;

  public KeyboardState() {
    buffer = new byte[BufferSize];
  }

  public KeyboardState on(byte key) throws InvalidKeyException {
    try {
      buffer[key] = (byte) 1;
    } catch (ArrayIndexOutOfBoundsException ex) {
      throw new InvalidKeyException();
    }

    return this;
  }

  public KeyboardState on(Key key) {
    buffer[key.getPosition()] = (byte) 1;
    return this;
  }

  public KeyboardState off(byte key) throws InvalidKeyException {
    try {
      buffer[key] = (byte) 0;
    } catch (ArrayIndexOutOfBoundsException ex) {
      throw new InvalidKeyException();
    }

    return this;
  }

  public KeyboardState off(Key key) {
    buffer[key.getPosition()] = (byte) 0;
    return this;
  }

  public KeyboardState allOff() {
    Arrays.fill(buffer, (byte) 0);
    return this;
  }

  public KeyboardState allOn() {
    Arrays.fill(buffer, (byte) 1);
    return this;
  }

  private byte[] buffer;
}