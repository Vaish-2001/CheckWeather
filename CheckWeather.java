class CheckWeather
  {
    public static void main(String[]args)
      {
       double temp = 21.5;
       String result = temp>=0 && temp<10?"very cold"
                      :temp>=10 && temp<20?"cold"
                      :temp>=20 && temp<30?"moderate"
                      :temp>=30 && temp<40?"summer"
                      :temp>=40 && temp<50?"very hot"
                      :(" out of range ");

       System.out.println(result);  //result=moderate
      }
  }