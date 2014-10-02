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
public class Periodical extends hPublication{
    
    private String name = "";
    private int vol = -1;
    private int num = -1;
    private String month = "";
    
    public Periodical(int citNum, String name, String title, int vol, int num, String page, 
            String month, int year)
    {
        super();
        super.citNum = citNum;
        this.name = name.trim();
        super.setTitle(title);
        this.vol = vol;
        this.num = num;
        super.page = page.trim();
        this.month = month.trim();
        super.setYear(year);
    }
    
    //REQUIRES ITALICS!!!
    public String toString()
    {
        String output = "";
        output += "[" + super.citNum + "] " + super.getAuthor() + ", \"" + this.name + "\", ";
        output += "<i>" + super.getTitle() + "</i>, ";
        if(vol > 0)
        {
            output += "vol. " + this.vol + ", ";
        }
        if(num > 0)
        {
            output += "no. " + this.num + ", ";
        }
        if(!page.equals(""))
        {
            output += "pp. " + super.page + ", ";
        }
        if(!month.equals(""))
        {
            output += this.month + ", ";
        }
        if(super.getYear() > 0)
        {
            output += super.getYear() + ".";
        }
        return output;
    }
}
