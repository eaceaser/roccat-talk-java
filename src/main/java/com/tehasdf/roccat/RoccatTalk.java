package com.tehasdf.roccat;

public class RoccatTalk {
  public RoccatTalk() {
    ptr = RoccatTalkLib.newRoccatTalkHandle();
  }

  public boolean initialize() {
    return RoccatTalkLib.init_ryos_talk(ptr);
  }

  public boolean setSDKMode(boolean state) {
    return RoccatTalkLib.set_ryos_kb_SDKmode(ptr, state);
  }

  public void disableAllLEDs() {
    RoccatTalkLib.turn_off_all_LEDS(ptr);
  }

  public void enableAllLEDs() {
    RoccatTalkLib.turn_on_all_LEDS(ptr);
  }

  public void enableLED(byte pos) {
    RoccatTalkLib.set_LED_on(ptr, pos);
  }

  public void disableLED(byte pos) {
    RoccatTalkLib.set_LED_off(ptr, pos);
  }

  public void setAllLEDs(byte[] leds) {
    RoccatTalkLib.Set_all_LEDS(ptr, leds);
  }

  public void blinkAllKeys(int delayTimeMs, int loopTimeMs) {
    RoccatTalkLib.All_Key_Blinking(ptr, delayTimeMs, loopTimeMs);
  }

  public void setLEDRGB(byte zone, byte effect, byte speed, byte red, byte green, byte blue) {
    RoccatTalkLib.Set_LED_RGB(ptr, zone, effect, speed, red, green, blue);
  }

  public void restoreLEDRGB() {
    RoccatTalkLib.RestoreLEDRGB(ptr);
  }

  private long ptr;
}

