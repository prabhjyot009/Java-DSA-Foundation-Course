package GeekForGeeks.School;

public class armstrong {
    public static void main(String[] args) {
        int num1 = 163;
        int temp=num1;
        int count=0;
        int arm=0;
        while(num1>0){
            count=count+1;
            num1=num1/10;
        }
        System.out.println(count);
        num1=temp;
        while (num1>0) {
            arm+=(int)Math.pow(num1%10, count);
            num1/=10;
        }
        if(arm==temp){
            System.out.println("Arm");
        }
        else{
            System.out.println("Not arm");
        }





















        /* 
        int count = 0;
        while(temp > 0){
            count++;
            temp/=10;
        }
        
        temp = num2;

        int total=0;
        while(num2 > 0){
            int d = num2%10;
            total = total +(int) Math.pow(d,count);
            num2/=10;
        }
        if(total == temp)System.out.print("Armstrong");
        else System.out.print("Not Armstrong");
        */
    }
}
