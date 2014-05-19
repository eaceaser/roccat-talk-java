package com.tehasdf.roccat.test;

import com.tehasdf.roccat.NarSystem;
import com.tehasdf.roccat.RoccatTalk;
import org.junit.Test;

public class RoccatTalkTest {
  @Test
  public void initializeClass() {
    NarSystem.loadLibrary();
    RoccatTalk t = new RoccatTalk();
  }
}