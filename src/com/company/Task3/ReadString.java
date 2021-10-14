package com.company.Task3;

public class ReadString {

    private String strWord;
    private Integer strAmount;

    public ReadString(String strWord) {
        this.strWord = strWord;
        this.strAmount = getStrAmount(strWord.toLowerCase());
    }

    public Integer getStrAmount() {
        return strAmount;
    }

    public String getStrWord() {
        return strWord;
    }

    public void setStrWord(String strWord) {
        this.strWord = strWord;
    }

    private Integer getStrAmount(String strWord) {
        int i = 0;
        Config vowel = new Config();
        for (Character a : strWord.toCharArray()) {
            if (vowel.VOWEL_LETTER.contains(a.toString())) {
                i++;
            }
        }
        return i;
    }

    @Override
    public String toString() {
        return strWord;
    }

}
