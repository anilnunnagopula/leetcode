class Solution {
    public static int monthDays(int m,int maxYear){
        if(m==1||m==3||m==5||m==7||m==8||m==10||m==12){
            return 31;
        }
        if(m==2){
            
            return isLeapYear(maxYear)?29:28;
        }
        else return 30;
    }

    public static boolean isLeapYear(int year){
        if((year % 400 == 0)||(year % 4 == 0 && year % 100 != 0)){
            return true;
        }
        return false;
    }

    public int daysFrom1971(String date){
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(5,7));
        int day = Integer.parseInt(date.substring(8,10));

        int totalDays = 0;
        
        for(int y = 1971; y < year; y++){
            totalDays += isLeapYear(y) ? 366 : 365;
        }
        
        for(int m = 1; m < month; m++){
            totalDays += monthDays(m, year);
        }
        
        totalDays += day;

        return totalDays;
    }

    public int daysBetweenDates(String date1, String date2) {

        // int totalDays=0;
        // int y1=Integer.parseInt(date1.substring(0,4));
        // int y2=Integer.parseInt(date2.substring(0,4)); 

        // int minYear=Math.min(y1,y2);
        // int maxYear=Math.max(y1,y2);
        // for(int i=minYear;i<maxYear;i++){
        //     if(isLeapYear(i)){
        //         totalDays+=366;
        //     }
        //     else{
        //         totalDays+=365;
        //     }
        // }

        // int m1=Integer.parseInt(date1.substring(5,7));
        // int m2=Integer.parseInt(date2.substring(5,7)); 

        // int minMonth=Math.min(m1,m2);
        // int maxMonth=Math.max(m1,m2);
        // for(int i=minMonth;i<maxMonth;i++){
        //     totalDays+=monthDays(i,maxYear);
        // } 

        // int d1=Integer.parseInt(date1.substring(8,10));
        // int d2=Integer.parseInt(date2.substring(8,10)); 
        // int days=Math.abs(d1-d2);

        // totalDays+=days;

        // return totalDays;

        return Math.abs(daysFrom1971(date1)-daysFrom1971(date2));
    }
}