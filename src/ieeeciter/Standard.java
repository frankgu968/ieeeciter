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
public class Standard extends source{
    
    private String number = "";
    
    public Standard(int citNum, String title, String number, int year)
    {
        super();
        super.setCitNum(citNum);
        super.setTitle(title.trim());
        this.number = number.trim();
        super.setYear(year);
    }
    
    //TITLE REQUIRES ITALICIZING!
    public String toString()
    {
        String dateStr = "";
        if(this.getYear() > 0)
        {
            dateStr = ", " + this.getYear();
        }
        return "["+super.citNum + "] " + "<i>" + super.getTitle() + "</i>, " + 
                this.number + dateStr + ".";
    }
    
}
