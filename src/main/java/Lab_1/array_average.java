package Lab_1;

import static jdk.nashorn.internal.objects.NativeMath.round;

public class array_average {

    public double arrayAverage(int[] arr){

        int total = 0;
        double average=0.0;
if(arr.length>0){
        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }
        average= total / arr.length;

        return (average);
    }
else {
    return average;
}
}
}
