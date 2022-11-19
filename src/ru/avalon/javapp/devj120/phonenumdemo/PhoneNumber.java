package ru.avalon.javapp.devj120.phonenumdemo;

import java.util.Objects;

public class PhoneNumber {
    private final String areaCode;
    private final String localNum;

    public PhoneNumber(String areaCode, String localNum) {
        if(!checkMum(areaCode))
            throw new IllegalArgumentException("areaCode is wrong; it must be non-null, non-empty string containing digits only");
        if(!checkMum(localNum))
            throw new IllegalArgumentException("localNum is wrong; it must be non-null, non-empty string containing digits only");
        this.areaCode = areaCode;
        this.localNum = localNum;
    }

    private boolean checkMum(String num) {
        if(num == null || num.isEmpty())
            return false;
        int p = 0;
        while (p < num.length() && Character.isDigit(num.charAt(p)))
            p++;
        return p == num.length();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getLocalNum() {
        return localNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return Objects.equals(areaCode, that.areaCode) && Objects.equals(localNum, that.localNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, localNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(')
                .append(areaCode)
                .append(')')
                .append(localNum);
        int p = sb.length(),
            l = localNum.length();
        while (l > 3) {
            p -= 2;
            l -= 2;
            sb.insert(p, '-');
        }

        return sb.toString();
    }
}
