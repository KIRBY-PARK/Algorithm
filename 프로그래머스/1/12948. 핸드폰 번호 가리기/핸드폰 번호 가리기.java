class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        // 문자열 길이만큼 반복
        for(int i =0;i<phone_number.length();i++){
           // 끝 4자리가 아닌 경우는 * 
           if(i < phone_number.length() -4) answer+="*";
           // 끝 4자리는 살린다. 
           else answer+=phone_number.charAt(i); 
        }
        
        return answer;
    }
}