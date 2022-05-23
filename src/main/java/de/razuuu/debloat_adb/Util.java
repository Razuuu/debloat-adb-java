/*
  Copyright (C) 2022 Joshua Samenfink <joshua@razuuu.de>

  This program is free software: you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package de.razuuu.debloat_adb;

import java.util.concurrent.TimeUnit;

public class Util {
    public static String contributeText =
            "If you want to contribute, you can create an Issue" +
            "or a Pull-Request! :)\nhttps://github.com/A2L5E0X1/debloat-adb";

    public static final String redMessage = "\033[0;31m";
    public static final String resetColor = "\033[0m";
    public static void warningMessage() {
        System.out.println(redMessage +
                "IMPORTANT: Read README.md before you continue!\n" +
                "Make sure USB-Debugging is enabled on your phone and it's connected to your PC.\n" +
                "If your PC can't find the phone, make sure your PC is authorized.\n" +
                "Press ENTER to continue. Press CTRL+C to exit." + resetColor);

        try {
            System.in.read();
        } catch (Exception ignored) {
        }

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void baseText(String type, String author) throws InterruptedException {
        Util.clearScreen();
        System.out.println("### " + type + "\n### by " + author + "\n");
        TimeUnit.SECONDS.sleep(1);
    }

}
