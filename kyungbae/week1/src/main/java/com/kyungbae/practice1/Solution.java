package com.kyungbae.practice1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {


        String today = DateTimeFormatter.ofPattern("yyyy.MM.dd").format(LocalDate.now());
        String[] terms = {"A 3", "B 12", "C 6"};
        String[] privacies = {"2024.10.21 A", "2024.03.04 B", "2025.01.25 C" };
        int[] result = solution(today, terms, privacies);



    }
    public static int[] solution(String today, String[] terms, String[] privacies) {
        /*

            privacies 의 공백 다음 문자를 terms와 비교하여 terms의 공백 다음항목(숫자) 가져오기
            가져온 terms의 공백 다음 문자(숫자)를 privacies의 공백 전(날짜)에 월에 추가
            추가된 날짜가 현재 날짜보다 적은 경우 인덱스 를 int[]에 추가
            int[] 반환
         */
        for (int i = 0; i < privacies.length; i++) {
            String term = privacies[i].substring(privacies[i].indexOf(" "));
            // => i번째 개인정보의 term
            int month = 0;
            for (int j = 0; j < terms.length; j++) {
                if(term.equals(terms[j].substring(0, 1))){
                    month = Integer.parseInt(terms[j].substring(terms[j].indexOf(" ")));
                }
            }
            int mmOfPrivaies = Integer.parseInt(privacies[i].substring(privacies[i].indexOf("."),privacies[i].lastIndexOf(".")));
            

        }


        int[] answer = {};
        return answer;
    }
}
