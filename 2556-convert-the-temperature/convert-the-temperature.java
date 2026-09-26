class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin=celsius+273.15;
        double Fahrenheit=celsius*1.80+32.00;
        double a[]=new double[2];
        for(int i=0;i<a.length;i++)
        {
            a[0]=kelvin;
            a[1]=Fahrenheit;
        }
      return a;
    }
}