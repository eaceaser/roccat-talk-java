package com.tehasdf.roccat;

public class RoccatTalk {
  public RoccatTalk() {
    ptr = _allocateObj();
  }

  public boolean initialize() {
    return _initialize(ptr);
  }

  public boolean setSDKMode(boolean state) {
    return _setSDKMode(ptr, state);
  }

  public void disableAllLEDs() {
    _disableAllLEDs(ptr);
  }

  public void enableAllLEDs() {
    _enableAllLEDs(ptr);
  }

  public void enableLED(byte pos) {
    _enableLED(ptr, pos);
  }

  public void disableLED(byte pos) {
    _disableLED(ptr, pos);
  }

  public void setAllLEDs(byte[] leds) {
    _setAllLEDs(ptr, leds);
  }

  public void blinkAllKeys(int delayTimeMs, int loopTimeMs) {
    _blinkAllKeys(ptr, delayTimeMs, loopTimeMs);
  }

  public void setLEDRGB(byte zone, byte effect, byte speed, byte red, byte green, byte blue) {
    _setLEDRGB(ptr, zone, effect, speed, red, green, blue);
  }

  public void restoreLEDRGB() {
    _restoreLEDRGB(ptr);
  }

  private long ptr;
  private native boolean _initialize(long ptr);
  private native boolean _setSDKMode(long ptr, boolean state);
  private native void _disableAllLEDs(long ptr);
  private native void _enableAllLEDs(long ptr);
  private native void _enableLED(long ptr, byte pos);
  private native void _disableLED(long ptr, byte pos);
  private native void _setAllLEDs(long ptr, byte[] leds);
  private native void _blinkAllKeys(long ptr, int delayTimeMs, int loopTimeMs);
  private native void _setLEDRGB(long ptr, byte zone, byte effect, byte speed, byte red, byte green, byte blue);
  private native void _restoreLEDRGB(long ptr);

  private native long _allocateObj();
}