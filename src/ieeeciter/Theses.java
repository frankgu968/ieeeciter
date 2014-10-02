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
public class Theses extends source{
    private String dept = "";
    private String univ = "";
    private String city = "";
    private String state = "";
    private boolean MS = false; //Ph. D or MS
    
    public Theses(int citNum, String title, String dept, String univ, String city,
            String state, int year, boolean ms)
    {
        super();
        super.citNum = citNum;
        super.setTitle(title);
        this.dept = dept.trim();
        this.univ = univ.trim();
        this.city = city.trim();
        this.state = state.trim();
        super.setYear(year);
        this.MS = ms;
    }
    
    public String toString()
    {
        String output = "";
        String typeStr = "";
        if(MS)
        {
            typeStr = "M.S. thesis";
        }
        else
        {
            typeStr = "Ph.D dissertation";
        }
        output += super.getAuthor() + ", \"" + super.getTitle() + "\", " + typeStr + ", ";
        
        if(dept!="")
        {
            output += this.dept + ", ";
        }
        output += this.univ + ", ";
        if(city != "")
        {
            output += this.city + ", ";
        }
        if(state != "")
        {
            output += this.state + ", ";
        }
        output += super.getYear() + ".";
        return output;
    }
}
