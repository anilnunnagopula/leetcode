class Solution {
    public static int monthDays(int m){
        if(m==1||m==3||m==5||m==7||m==8||m==10||m==12){
            return 31;
        }
        if(m==2){
            
            return  28;
        }
        else return 30;
    }
    private int convert(String date) {
        int month = Integer.parseInt(date.substring(0,2));
        int day = Integer.parseInt(date.substring(3,5));
        int totalDays = day;
        for (int i = 1; i < month; i++) {
            totalDays +=monthDays(i);
        }
        return totalDays;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
       int aStart = convert(arriveAlice);
        int aEnd   = convert(leaveAlice);
        int bStart = convert(arriveBob);
        int bEnd   = convert(leaveBob);

        int start = Math.max(aStart, bStart);
        int end   = Math.min(aEnd, bEnd);

        return Math.max(0, end - start + 1);
    }
}


//        Wrong Answer
// 20 / 51 testcases passed
// Input
// arriveAlice =
// "10-20"
// leaveAlice =
// "12-22"
// arriveBob =
// "06-21"
// leaveBob =
// "07-05"

// Use Testcase
// Output
// 31
// Expected
// 0
        // //alice
        // int amonthArrive=Integer.parseInt(arriveAlice.substring(0,2));
        // int amonthLeave=Integer.parseInt(leaveAlice .substring(0,2));

        // int aliceTotalDays=0;
        // for(int i=amonthArrive;i<amonthLeave;i++){
        //     aliceTotalDays+=monthDays(i);
        // }
        // aliceTotalDays+=Integer.parseInt(leaveAlice.substring(3,5))-Integer.parseInt(arriveAlice.substring(3,5))+1;

        // //bob
        // int bmonthArrive=Integer.parseInt(arriveBob.substring(0,2));
        // int bmonthLeave=Integer.parseInt(leaveBob.substring(0,2));

        // int bobTotalDays=0;
        // for(int i=bmonthArrive;i<bmonthLeave;i++){
        //     bobTotalDays+=monthDays(i);
        // }
        // bobTotalDays+=Integer.parseInt(leaveBob.substring(3,5))-Integer.parseInt(arriveBob.substring(3,5))+1;

        // //arrive diff
        // int arriveDiff=0;
        // for(int i=amonthArrive;i<bmonthArrive;i++){
        //     arriveDiff+=monthDays(i);
        // }
        // // arriveDiff+=Math.abs(Integer.parseInt(arriveAlice.substring(3,5))-Integer.parseInt(arriveBob.substring(3,5)));
        // if (amonthArrive < bmonthArrive) {
        //     arriveDiff += (Integer.parseInt(arriveBob.substring(3,5)) 
        //          - Integer.parseInt(arriveAlice.substring(3,5)));
        // }       
        // else if (amonthArrive == bmonthArrive) {
        //      arriveDiff += Math.max(0, Integer.parseInt(arriveBob.substring(3,5)) - Integer.parseInt(arriveAlice.substring(3,5)));
        // }

        // //leave diff

        // int leaveDiff=0;
        // for(int i=amonthLeave;i<bmonthLeave;i++){
        //     leaveDiff+=monthDays(i);
        // }
        // // leaveDiff+=Math.abs(Integer.parseInt(leaveAlice.substring(3,5))-Integer.parseInt(leaveBob.substring(3,5)));
        // if (amonthLeave > bmonthLeave) {
        //     leaveDiff += (Integer.parseInt(leaveAlice.substring(3,5))-Integer.parseInt(leaveBob.substring(3,5)));
        // } 
        // else if (amonthLeave == bmonthLeave) {
        //     leaveDiff += Math.max(0, Integer.parseInt(leaveAlice.substring(3,5)) - Integer.parseInt(leaveBob.substring(3,5)));
        // }

        // int total=0;
        // total=aliceTotalDays+bobTotalDays-arriveDiff-leaveDiff;
        // return total<=0?0:total/2;


        
//     }
// }