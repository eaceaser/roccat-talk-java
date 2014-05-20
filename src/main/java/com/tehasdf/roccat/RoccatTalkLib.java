package com.tehasdf.roccat;

import com.sun.jna.Native;

class RoccatTalkLib {
  public static native long newRoccatTalkHandle();
  public static native void destroyRoccatTalkHandle(long ptr);

  public static native boolean init_ryos_talk(long handle);
  public static native boolean set_ryos_kb_SDKmode(long handle, boolean state);
  public static native void turn_off_all_LEDS(long handle);
  public static native void turn_on_all_LEDS(long handle);
  public static native void set_LED_on(long handle, byte pos);
  public static native void set_LED_off(long handle, byte pos);
  public static native void Set_all_LEDS(long handle, byte[] pos);
  public static native void All_Key_Blinking(long handle, int delayTime, int loopTime);
  public static native void Set_LED_RGB(long handle, byte zone, byte effect, byte speed, byte red, byte green, byte blue);
  public static native void RestoreLEDRGB(long handle);

  static {
    Native.register("talkfx-c");
  }
}
