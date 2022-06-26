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

import de.razuuu.debloat_adb.options.DebloatOption;

import java.util.Scanner;

import static java.lang.System.exit;

public class Debloat_ADB {

    public static void main(String[] args) throws InterruptedException {

        Util.baseText("Debloat ADB", "A2L5E0X1 + Razuuu");

        System.out.println("Select an option\n");

        while (true) {
            try {
                System.out.println("(D)ebloat | (I)nstall Apps | (R)evert Debloat | (E)xit");
                System.out.print("» ");

                Scanner scanner = new Scanner(System.in);
                String reader = scanner.next();

                switch (reader) {
                    case "d" -> DebloatOption.startDebloat();
                    case "e" -> {
                        System.out.println("Exit!");
                        exit(0);
                    }
                    default -> {
                        System.out.println("No option selected!");
                    }
                }
            } catch (Exception ignored) {
            }
        }
    }

}
