package com.example.morsekeyboard;

import java.util.HashMap;

public class hebrewMorseMap {
    public static HashMap<Character, CharSequence> createHebrewToMorseMap() {
        HashMap<Character, CharSequence> map = new HashMap<>();

        // Add Hebrew letters and their Morse code equivalents as CharSequence
        map.put('א', "·−   ");
        map.put('ב', "−···   ");
        map.put('ג', "−−·   ");
        map.put('ד', "−··   ");
        map.put('ה', "−−−   ");
        map.put('ו', "·   ");//ואו מתחלך עם ח שהופך לנאל
        map.put('ז', "··−−   ");//מתחלף עם צ שהופך לנאל
        map.put('ח', "····   ");
        map.put('ט', "··−   ");
        map.put('י', "··   ");
        map.put('כ', "−·−   ");
        map.put('ל', "·−··   ");
        map.put('מ', "−−   ");
        map.put('נ', "−·   ");
        map.put('ס', "−·−·   ");
        map.put('ע', "·−−−   ");
        map.put('פ', "·−−·   ");
        map.put('צ', "·−−   ");
        map.put('ק', "−−·−   ");
        map.put('ר', "·−·   ");
        map.put('ש', "···   ");
        map.put('ת', "−   ");
        map.put(' ', "/   ");
        map.put('ם', "−−   ");
        map.put('ן', "−·   ");
        map.put('ץ', "·−−   ");
        map.put('ף', "·−−·   ");
        map.put('ך', "−·−   ");
        map.put('0', "−−−−   ");
        map.put('1', "·−−−−   ");
        map.put('2', "··−−−   ");
        map.put('3', "···−−   ");
        map.put('4', "····−   ");
        map.put('5', "·····   ");
        map.put('6', "−····   ");
        map.put('7', "−−···   ");
        map.put('8', "−−−··   ");
        map.put('9', "−−−−·   ");
        // Add more mappings for other Hebrew letters as needed

        return map;
    }
}

