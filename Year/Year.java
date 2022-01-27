/*
 * Copyright (c) 2012, 2013, Oracle and/or its affiliates. All rights reserved.
   ...
 */
package Year;

public class Year
{
    public static final int MIN_VALUE = -999_999_999;
    public static final int MAX_VALUE = 999_999_999;

    private final int year;

    public static boolean isLeap(long year)
    {
        return ((year & 3) == 0) && ((year % 100) != 0
                || (year % 400) == 0);
    }
    public static Year of(int isoYear)
    {
        return new Year(isoYear);
    }
    private Year(int year)
    {
        this.year = year;
    }
    public int getValue()
    {
        return this.year;
    }
    public boolean isLeap()
    {
        return Year.isLeap(this.year);
    }
    public int length()
    {
        return this.isLeap() ? 366 : 365;
    }
    public String toString()
    {
        return Integer.toString(this.year);
    }
    public boolean isAfter(Year other)
    {
        return this.year > other.year;
    }

    public boolean isBefore(Year other)
    {
        return this.year < other.year;
    }

    public Year minusYears(long yearsToSubtract)
    {
        return new Year((int) (this.year - yearsToSubtract));
    }

    public Year plusYears(long yearsToAdd)
    {
        return new Year((int) (this.year + yearsToAdd));
    }

    public static Year parse(String text)
    {
        return new Year(Integer.valueOf(text));
    }

}