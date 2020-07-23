import static jdk.nashorn.internal.objects.NativeMath.round;

public class array_average {

    public double arrayAverage(int[] arr){

        int total = 0;

        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }
        double average = total / arr.length;
        System.out.format("The average is: %.3f", average);
        return round(average,2);
    }

}