public class e_variance_sd {

    //compute mean
    static float mean(int a[], int n)
    {
        int sum = 0;
        float mean; 
        for(int i = 0; i < n; i++)
            sum += a[i];
        
        mean = sum / (float)n;                      //computing the mean
    
    return mean;
    }

    //compute variance
    static float variance(int a[], int n)                  //function_2 to compute the variance of given numbers
    {
        float sum_of_squares = 0, square_of_sum = 0;
        float variance;
    
        for (int i = 0; i < n; i++)
            square_of_sum += a[i];
        
        square_of_sum *= square_of_sum;             //coputing the square of sum of elements
    
        for(int i = 0; i < n; i++)
            a[i] *= a[i];
        
        for(int i = 0; i < n; i++)
            sum_of_squares += a[i];                 //computing the sum of squares of elements
        
        variance = ( (sum_of_squares - ((square_of_sum)/n)) / ((float)n - 1) );    //computing the variance
    
    return variance;
    }

    static float standard_deviation(int a[], int n)        //function_3 to compute the variance of given numbers
    {
    
        float var = variance(a, n);                 //calling function_2
        float sd = (float) Math.pow(var, 0.5);                   //computing standard deviation
    
    return sd;
    }


}