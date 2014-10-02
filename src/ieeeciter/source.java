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

import java.util.ArrayList;

/**
 *
 * @author Frank
 */
public class source {
    
    protected int citNum = 0; //Citation number
    private int yPub = -1; //Year published
    private final ArrayList authors = new ArrayList();  //List of author(s)
    private boolean authorFlag = false; //Flags for et al.
    private String title = "";  
    
    public source()
    {}
    
    public void setCitNum(int num)
    {
        this.citNum = num;
    }
    
    public void setAuthorFlag(boolean input)
    {
        this.authorFlag = input;
    }
    
    public void setYear(int year)
    {
        this.yPub = year;
    } 
    
    public String toString()
    {
        return "[" + this.citNum + "] ";
    }
    
    public int getYear()
    {
        return this.yPub;
    }
    
    public void clrAuthor()
    {
        this.authors.clear();
    }

    public String getAuthor()
    {
        if(authors.size()== 0)
        {
            return "";
        }
        String authorStr = "";
        //Construct the authors output
        if(authorFlag == true)
        {
            authorStr = authors.toArray()[0].toString() + " et al.";
        }
        else
        {
            authorStr += authors.toArray()[0].toString();

            if(!authors.toArray()[1].toString().equals(""))
            {
                authorStr += " and " + 
                        authors.toArray()[1].toString();
            }
        }
        return authorStr;
    }
    
    public void AddAuthors(String input)
    {
        authors.add(input.trim());
    }
    
    public void setTitle(String input)
    {
        this.title = input.trim();
    }
    
    public String getTitle()
    {
        return this.title + " ";
    }
    
}
