public class lab406 {
    public static void main(String[] argv) {
        int hours = 0;
        hours = 2;
        park(hours);
        System.out.println("--------------------");
        
        hours = 3;
        park(hours);
        System.out.println("--------------------");
        
        hours = 5;
        park(hours);
        System.out.println("--------------------");
        
        hours = 8;
        park(hours);
    }
    
    public static void park(int hours) {
        int[] hourTable = {0, 2, 4, 6};
        int[] feeTable = {30, 50, 80, 100};
        int fee = 0;
        
        System.out.println("停車時數：" + hours + "小時");
        

        int i = hourTable.length - 1;
        
        while(i > 0) {
        	if(hourTable[i] < hours)
        		break;
        	i--;
        }
        
        while(i >= 0) {
        	fee += (hours - hourTable[i]) * feeTable[i];
        	hours = hourTable[i];
        	i--;
        }
    }
}
