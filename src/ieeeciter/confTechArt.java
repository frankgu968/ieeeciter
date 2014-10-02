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
public class confTechArt extends Book{
    
    public confTechArt(int citNum, String title, String conf, String city, String state,
            int year, String page)
    {
        super(citNum, "", title, "",city,state,"",year,-1,-1,page);
    }
    
    public String toString()
    {
        return super.toString();
    }
}
