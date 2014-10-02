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
public class Unpublished extends source {
    
    private String month = "";
    
    public Unpublished(int citNum, String title)
    {
        super();
        super.citNum = citNum;
        super.setTitle(title);
    }
    
    public Unpublished(int citNum, String month, int year)
    {
        super();
        super.citNum = citNum;
        super.setYear(year);
        this.month = month;
    }
    public Unpublished(String month, int year)
    {
        super();
        super.setYear(year);
        this.month = month;
    }
    
    public String toString()
    {
        String dateStr = "";
        
        if(month!="")
        {
            dateStr = this.month + ", ";
        }
        
        if(super.getYear() > 0)
        {
            return "[" + super.citNum + "] " + super.getAuthor() + ", private communication, " + dateStr + 
                    super.getYear() + ".";
        }
        else
        {
            return "[" + super.citNum + "] " + super.getAuthor() + ", \"" + super.getTitle() + "\", unpublished.";
        }
    }
}
