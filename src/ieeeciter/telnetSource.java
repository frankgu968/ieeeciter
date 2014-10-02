/*
 * Copyright (C) 2014 Yu Cheng Gu (Frank)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ieeeciter;

/**
 *
 * @author Frank
 */
public class telnetSource extends ePublication{
    private String site = "";
    private String dir = "";
    private String file = "";
    
    public telnetSource(int citNum, int year, String month, int day,
            String title, String site, String dir, String file)
    {
        super();
        super.setCitNum(citNum);
        super.setTitle(title);
        super.setDate(year, month.trim(), day);
        this.site = site.trim();
        this.file = file.trim();
        if(dir != "")
        {
            this.dir = dir.trim();
        }
    }
    
    public String toString()
    {
        String dirStr = "";
        if(this.dir != "")
        {
            dirStr = " Directory: " + this.dir;
        }
        return super.toString() + "Available Telnet: " + this.site + dirStr + 
                " File: " + this.file;
    }
}
