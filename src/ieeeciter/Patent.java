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
public class Patent extends source {

    private String patNum = "";
    private String month = "";
    private int day = -1;

    public Patent(int citNum, String title, String patentNumber, String month, int day, 
            int year)
    {
        super();
        super.setCitNum(citNum);
        super.setTitle(title);
        this.patNum = patentNumber;
        this.month = month;
        this.day = day;
        super.setYear(year);
    }
    
    public String toString()
    {
        String dateStr = "";
        if(this.month != "" && this.day > 0)
        {
            dateStr = this.month + ", " + day + ", ";
        }
        return super.getAuthor() + ", \"" + super.getTitle() + "\", " + 
                this.patNum + ", " + dateStr + super.getYear() + ".";
    }
}
