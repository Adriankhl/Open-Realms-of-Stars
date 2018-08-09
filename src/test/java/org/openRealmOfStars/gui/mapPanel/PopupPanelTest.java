package org.openRealmOfStars.gui.mapPanel;

import static org.junit.Assert.*;

import java.awt.image.BufferedImage;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

/**
*
* Open Realm of Stars game project
* Copyright (C) 2018  Tuomo Untinen
*
* This program is free software; you can redistribute it and/or
* modify it under the terms of the GNU General Public License
* as published by the Free Software Foundation; either version 2
* of the License, or (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program; if not, see http://www.gnu.org/licenses/
*
*
* Class for handling popups on map panel
*
*/
public class PopupPanelTest {

  @Test
  @Category(org.openRealmOfStars.UnitTest.class)
  public void testBasic() {
    PopupPanel panel = new PopupPanel("Test", "Test title");
    BufferedImage image = Mockito.mock(BufferedImage.class);
    assertEquals("Test", panel.getText());
    assertEquals(null, panel.getImage());
    panel.setImage(image);
    assertEquals(image, panel.getImage());
    panel.setText("Testing");
    assertEquals("Testing", panel.getText());
    assertEquals("Test title", panel.getTitle());
    panel.setTitle("Another");
    assertEquals("Another", panel.getTitle());
  }

}