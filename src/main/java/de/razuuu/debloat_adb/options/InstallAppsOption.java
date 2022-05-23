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
package de.razuuu.debloat_adb.options;

import de.razuuu.debloat_adb.Util;

import static java.lang.System.exit;

public class InstallAppsOption {
    public static void startInstall() throws InterruptedException {

        Util.baseText("Install Apps", "A2L5E0X1 + Razuuu");

        Util.warningMessage();

        exit(0);
    }
}
