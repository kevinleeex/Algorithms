package No1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Date;

/**
 * Description: <br/>
 * Author: KevinLee <br/>
 * Version: 1.0 <br/>
 * Create Date Time: 2016-08-24 23:49. <br/>
 * Update Date Time: <br/>
 */
public class Solution1 {

    private static int get1Count(int num){
        int count=0;
        while(num!=0){
            if(num%10==1){
                count++;
            }
            num/=10;
        }
        return count;
    }

    public static int get1FO(int n){
        int fo=0;
        int num=1;
        while (num<=n){
            fo+=get1Count(num);
            num++;
        }
        return fo;
    }

}
